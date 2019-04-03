package com.lending;

import com.lending.contracts.BorrowMeContract;
import com.lending.entities.WypozyczenieZasobu;
import com.lending.repositories.UzytkownikRepository;
import com.lending.repositories.UzytkownikRepositoryImpl;
import com.lending.repositories.WypozyczenieZasobuRepository;
import com.lending.repositories.ZasobRepository;
import com.lending.services.WypozyczenieZasobuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class LendingAppApplication {

	public static void main(String[] args)  {
		SpringApplication.run(LendingAppApplication.class, args);
	}






}
