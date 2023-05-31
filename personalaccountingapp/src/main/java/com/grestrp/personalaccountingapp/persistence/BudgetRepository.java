package com.grestrp.personalaccountingapp.persistence;

import com.grestrp.personalaccountingapp.persistence.crud.BudgetCrudRepository;
import com.grestrp.personalaccountingapp.persistence.entity.Budget;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class BudgetRepository {
    private BudgetCrudRepository budgetCrudRepository;

    public List<Budget> getAll() {
        return (List<Budget>) budgetCrudRepository.findAll();
    }

    public Optional<Budget> getById (int id) {
        return budgetCrudRepository.findById(id);
    }

    public List<Budget> getByStateId (int stateId) {
        return budgetCrudRepository.findByStateId(stateId);
    }

    public Budget save(Budget budget) {
        return budgetCrudRepository.save(budget);
    }
    
    public Budget update (int id, String name, int stateId, LocalDateTime updatedAt) {
        Budget budget = new Budget();
        budget = getById(id).get();
        budget.setName(name);
        budget.setStateid(stateId);
        budget.setUpdatedat(updatedAt);
        return budgetCrudRepository.save(budget);
    }

    public void delete(int id){
        budgetCrudRepository.deleteById(id);
    }

}
