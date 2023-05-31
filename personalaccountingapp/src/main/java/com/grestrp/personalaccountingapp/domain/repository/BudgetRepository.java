package com.grestrp.personalaccountingapp.domain.repository;

import com.grestrp.personalaccountingapp.persistence.entity.Budget;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface BudgetRepository {
    List<Budget> getAll();
    Optional<Budget> getById(int id);
    Budget save(Budget budget);
    Budget update (int id, String name, int stateId, LocalDateTime updatedAt);
    void delete(int id);
}
