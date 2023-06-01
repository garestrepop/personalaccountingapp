package com.grestrp.personalaccountingapp.domain.service;

import com.grestrp.personalaccountingapp.domain.repository.TransactionRepository;
import com.grestrp.personalaccountingapp.persistence.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAll () {
        return transactionRepository.getAll();
    };

    public Optional<Transaction> getById(int id) {
        return  transactionRepository.getById(id);
    };

    public Transaction save (Transaction transaction){
        return transactionRepository.save(transaction);
    };

    public Transaction update (int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    };

    public boolean delete(int id){
        return getById(id).map(Transaction -> {
            transactionRepository.delete(id);
            return true;
        }).orElse(false);
    };
}
