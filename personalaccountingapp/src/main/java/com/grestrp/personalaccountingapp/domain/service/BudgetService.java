package com.grestrp.personalaccountingapp.domain.service;

import com.grestrp.personalaccountingapp.domain.repository.BudgetRepository;
import com.grestrp.personalaccountingapp.persistence.entity.Budget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BudgetService {
    @Autowired
    private BudgetRepository budgetRepository;

    public List<Budget> getAll () {
        return budgetRepository.getAll();
    };

    public Optional<Budget> getById(int id) {
       return  budgetRepository.getById(id);
    };

    public Budget save (Budget budget){
        return budgetRepository.save(budget);
    };

    public Budget update (int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    };

    public boolean delete(int id){
        return getById(id).map(Budget -> {
            budgetRepository.delete(id);
            return true;
        }).orElse(false);
    };

}
