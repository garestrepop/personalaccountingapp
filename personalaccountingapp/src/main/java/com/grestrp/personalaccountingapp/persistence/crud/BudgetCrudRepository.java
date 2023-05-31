package com.grestrp.personalaccountingapp.persistence.crud;

import com.grestrp.personalaccountingapp.persistence.entity.Budget;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BudgetCrudRepository extends CrudRepository<Budget, Integer> {
    List<Budget> findByStateId(int stateId);
}
