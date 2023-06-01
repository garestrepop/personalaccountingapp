package com.grestrp.personalaccountingapp.domain.repository;

import com.grestrp.personalaccountingapp.persistence.entity.State;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface StateRepository {
    List<State> getAll();
    Optional<State> getById(int id);
    State save(State state);
    State update (int id, String name, int stateId, LocalDateTime updatedAt);
    void delete(int id);
}
