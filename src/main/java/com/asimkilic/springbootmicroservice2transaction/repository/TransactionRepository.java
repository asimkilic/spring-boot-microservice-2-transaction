package com.asimkilic.springbootmicroservice2transaction.repository;

import com.asimkilic.springbootmicroservice2transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findAllByUserId(Long id);
}
