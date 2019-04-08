package com.lending.repositories;

import com.lending.contracts.BorrowMeContract;
import com.lending.contracts.BorrowMeContractConnector;
import com.lending.entities.ResourceRenting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.stream.StreamSupport;

@Component
public class WypozyczenieZasobuRepositoryImpl implements WypozyczenieZasobuRepository {

    static String privateKey = "704f7159d16f05e611306d71c61b98722c9e8ade2395e9bbfcf8dfa92caa27b1";
    static String contractAddres = "0xE60903Efd7dB59BA673669bB15D3464676F272C7";


    private BorrowMeContractConnector contractConnector;
    private BorrowMeContract contract;

    @Autowired
    private UzytkownikRepository uzytkownikRepository;

    @Autowired
    private ZasobRepository zasobRepository;

    public WypozyczenieZasobuRepositoryImpl(UzytkownikRepository uzytkownikRepository,
                                            ZasobRepository zasobRepository) {
        this.uzytkownikRepository = uzytkownikRepository;
        this.zasobRepository = zasobRepository;
        try {
            contractConnector = new BorrowMeContractConnector(privateKey, contractAddres);
            contract = contractConnector.getBorrowMeContract();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public <S extends ResourceRenting> S save(S entity) {
        TransactionReceipt receipt = null;
        try {
            receipt = contract.createBorrowing(
                    entity.getGiver().getEthereumKey(),
                    entity.getGetter().getEthereumKey(),
                    BigInteger.valueOf(entity.getResource().getId())
            ).sendAsync().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return entity;
    }

    @Override
    public <S extends ResourceRenting> Iterable<S> saveAll(Iterable<S> entities) {
        entities.forEach((entity) -> save(entity));
        return entities;
    }


    @Override
    public Optional<ResourceRenting> findById(Integer id) {
        Tuple8<BigInteger, String, String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> wypozyczenieTuple = null;
        try {
            wypozyczenieTuple = contract
                                    .getBorrowing(BigInteger.valueOf(id))
                                    .sendAsync()
                                    .get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        ResourceRenting resourceRenting = new ResourceRenting(
                wypozyczenieTuple.getValue1().intValue(),
                uzytkownikRepository.getUzytkownikByKluczEthereum(wypozyczenieTuple.getValue2()),
                uzytkownikRepository.getUzytkownikByKluczEthereum(wypozyczenieTuple.getValue3()),
                zasobRepository.findById(wypozyczenieTuple.getValue4().intValue()).get(),
                new Date(wypozyczenieTuple.getValue5().longValue()),
                new Date(wypozyczenieTuple.getValue6().longValue()),
                new Date(wypozyczenieTuple.getValue7().longValue()),
                ResourceRenting.RentingStatus.fromInteger(wypozyczenieTuple.getValue8().intValue())
        );

        return Optional.of(resourceRenting);
    }

    @Override
    public boolean existsById(Integer integer) {
        return findById(integer).isPresent();
    }

    @Override
    public Iterable<ResourceRenting> findAll() {
        int count = (int) count();
        List<ResourceRenting> wypozyczenia = new ArrayList<ResourceRenting>(count);
        for(int i = 0; i<count;i++){
            wypozyczenia.add(findById(i).get());
        }
        return wypozyczenia;
    }

    @Override
    public Iterable<ResourceRenting> findAllById(Iterable<Integer> ids) {
        int count = (int) count();
        List<ResourceRenting> wypozyczenia = new ArrayList<ResourceRenting>(count);
        for(int i = 0; i<count;i++){
            ResourceRenting wypozyczenie = findById(i).get();
            if(containsHelper(ids, wypozyczenie.getId()))
                wypozyczenia.add(wypozyczenie);
        }
        return wypozyczenia;
    }


    private boolean containsHelper(Iterable<Integer> ids, Integer value){
        return StreamSupport.stream(ids.spliterator(), false)
                .anyMatch(id -> value.equals(id));
    }


    @Override
    public long count() {
        try {
            return contract.borrowingsCount().sendAsync().get().longValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(ResourceRenting entity) {

    }


    @Override
    public void deleteAll(Iterable<? extends ResourceRenting> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
