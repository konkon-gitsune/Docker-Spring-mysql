package com.docker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.model.Transaction;
import com.docker.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	public void saveTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
	}
	
	public Iterable<Transaction>getTransactionHistory(){
		return transactionRepository.findAll();
	}
	
	public Optional<Transaction> getTranscation(Long id){
		return transactionRepository.findById(id);
	}
}
