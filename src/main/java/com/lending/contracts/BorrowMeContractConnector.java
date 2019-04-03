package com.lending.contracts;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;

import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

public class BorrowMeContractConnector {

    private final static BigInteger GAS_LIMIT = BigInteger.valueOf(6721975L);
    private final static BigInteger GAS_PRICE = BigInteger.valueOf(20000000000L);

    private Web3j web3j;
    private TransactionManager transactionManager;
    private BorrowMeContract borrowMeContract;
    private String contractAddress;
    private Credentials credentials;

    public BorrowMeContractConnector(String privateKey, String contractAddress) throws ExecutionException, InterruptedException {
        web3j = Web3j.build(new HttpService());
        credentials = Credentials.create(privateKey);
        transactionManager = new RawTransactionManager(web3j, credentials);
        this.contractAddress = contractAddress;
        if(this.contractAddress == null || this.contractAddress.isEmpty()){
            borrowMeContract = BorrowMeContract.deploy(web3j, transactionManager, GAS_PRICE, GAS_LIMIT)
                .sendAsync()
                .get();
            this.contractAddress = borrowMeContract.getContractAddress();
        }
        else {
            borrowMeContract = BorrowMeContract.load(contractAddress, web3j, transactionManager, GAS_PRICE, GAS_LIMIT);
        }
    }

    public BorrowMeContract getBorrowMeContract(){
        return this.borrowMeContract;
    }
}
