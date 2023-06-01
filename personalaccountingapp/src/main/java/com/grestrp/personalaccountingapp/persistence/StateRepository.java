package com.grestrp.personalaccountingapp.persistence;

import com.grestrp.personalaccountingapp.persistence.crud.StateCrudRespository;
import com.grestrp.personalaccountingapp.persistence.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class StateRepository implements com.grestrp.personalaccountingapp.domain.repository.StateRepository {
    @Autowired
    private StateCrudRespository stateCrudRespository;

    @Override
    public List<State> getAll() {
        return (List<State>) stateCrudRespository.findAll();
    }

    @Override
    public Optional<State> getById(int id) {
        return stateCrudRespository.findById(id);
    }

    @Override
    public State save(State state) {
        return stateCrudRespository.save(state);
    }

    @Override
    public State update(int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    }

    @Override
    public void delete(int id) {
        stateCrudRespository.deleteById(id);
    }
}
