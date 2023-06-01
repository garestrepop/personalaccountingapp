package com.grestrp.personalaccountingapp.domain.repository;

import com.grestrp.personalaccountingapp.persistence.entity.Transaction;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TransactionRepository {
    List<Transaction> getAll();
    Optional<Transaction> getById(int id);
    Transaction save(Transaction transaction);
    Transaction update (int id, String name, int stateId, LocalDateTime updatedAt);
    void delete(int id);
}
