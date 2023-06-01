package com.grestrp.personalaccountingapp.domain.service;

import com.grestrp.personalaccountingapp.domain.repository.TypeTransactionRepository;
import com.grestrp.personalaccountingapp.persistence.entity.TypeTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeTransactionService {
    @Autowired
    private TypeTransactionRepository typeTransactionRepository;

    public List<TypeTransaction> getAll () {
        return typeTransactionRepository.getAll();
    };

    public Optional<TypeTransaction> getById(int id) {
        return  typeTransactionRepository.getById(id);
    };

}
