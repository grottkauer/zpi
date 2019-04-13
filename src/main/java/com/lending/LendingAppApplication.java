package com.lending;

import com.lending.contracts.BorrowMeContract;
import com.lending.contracts.BorrowMeContractConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.web3j.protocol.Web3j;

import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class LendingAppApplication {

	public static void main(String[] args)  {

		SpringApplication.run(LendingAppApplication.class, args);

		//Deploy contract code

//		String borrowMeAddress = "704f7159d16f05e611306d71c61b98722c9e8ade2395e9bbfcf8dfa92caa27b1";
//		BorrowMeContractConnector borrowMeContractConnector = new BorrowMeContractConnector(borrowMeAddress);
//		try {
//			borrowMeContractConnector.deployBorrowMeContract();
//		} catch (ExecutionException e) {
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

	}






}
