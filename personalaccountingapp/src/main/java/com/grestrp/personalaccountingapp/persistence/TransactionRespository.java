package com.grestrp.personalaccountingapp.persistence;

import com.grestrp.personalaccountingapp.domain.repository.TransactionRepository;
import com.grestrp.personalaccountingapp.persistence.crud.TransactionCrudRepository;
import com.grestrp.personalaccountingapp.persistence.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class TransactionRespository implements TransactionRepository {
    @Autowired
    private TransactionCrudRepository transactionCrudRepository;

    @Override
    public List<Transaction> getAll() {
        return (List<Transaction>) transactionCrudRepository.findAll();
    }

    @Override
    public Optional<Transaction> getById(int id) {
        return transactionCrudRepository.findById(id);
    }

    @Override
    public Transaction save(Transaction transaction) {
        return transactionCrudRepository.save(transaction);
    }

    @Override
    public Transaction update(int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    }

    @Override
    public void delete(int id) {
        transactionCrudRepository.deleteById(id);
    }
}
