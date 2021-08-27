package com.docker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.docker.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{
}	
