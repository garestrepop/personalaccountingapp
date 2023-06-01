package com.grestrp.personalaccountingapp.persistence;

import com.grestrp.personalaccountingapp.persistence.crud.TypeTransactionCruedRespository;
import com.grestrp.personalaccountingapp.persistence.entity.TypeTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class TypeTransactionRepository implements com.grestrp.personalaccountingapp.domain.repository.TypeTransactionRepository {
    @Autowired
    private TypeTransactionCruedRespository typeTransactionCruedRespository;


    @Override
    public List<TypeTransaction> getAll() {
        return (List<TypeTransaction>) typeTransactionCruedRespository.findAll();
    }

    @Override
    public Optional<TypeTransaction> getById(int id) {
        return typeTransactionCruedRespository.findById(id);
    }

    @Override
    public TypeTransaction save(TypeTransaction typeTransaction) {
        return typeTransactionCruedRespository.save(typeTransaction);
    }

    @Override
    public TypeTransaction update(int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    }

    @Override
    public void delete(int id) {
        typeTransactionCruedRespository.deleteById(id);
    }
}
