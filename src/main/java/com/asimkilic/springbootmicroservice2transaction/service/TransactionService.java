package com.asimkilic.springbootmicroservice2transaction.service;

import com.asimkilic.springbootmicroservice2transaction.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransactionById(Long id);

    List<Transaction> findAllTransactionsOfUserById(Long userId);
}
