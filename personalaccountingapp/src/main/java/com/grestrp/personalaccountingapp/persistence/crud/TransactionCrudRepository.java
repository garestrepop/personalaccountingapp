package com.grestrp.personalaccountingapp.persistence.crud;

import com.grestrp.personalaccountingapp.persistence.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionCrudRepository extends CrudRepository<Transaction, Integer> {
}
