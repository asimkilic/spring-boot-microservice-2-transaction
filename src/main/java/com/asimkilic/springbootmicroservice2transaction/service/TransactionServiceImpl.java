package com.asimkilic.springbootmicroservice2transaction.service;

import com.asimkilic.springbootmicroservice2transaction.model.Transaction;
import com.asimkilic.springbootmicroservice2transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        transaction.setTransactionTime(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransactionById(Long id) {
        transactionRepository.deleteById(id);
    }

    @Override
    public List<Transaction> findAllTransactionsOfUserById(Long userId){
        return transactionRepository.findAllByUserId(userId);
    }
}
