package com.grestrp.personalaccountingapp.domain.repository;

import com.grestrp.personalaccountingapp.persistence.entity.TypeTransaction;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TypeTransactionRepository {
    List<TypeTransaction> getAll();
    Optional<TypeTransaction> getById(int id);
    TypeTransaction save(TypeTransaction typeTransaction);
    TypeTransaction update (int id, String name, int stateId, LocalDateTime updatedAt);
    void delete(int id);
}
