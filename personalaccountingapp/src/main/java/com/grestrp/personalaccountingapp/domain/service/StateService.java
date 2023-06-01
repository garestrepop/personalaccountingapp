package com.grestrp.personalaccountingapp.domain.service;

import com.grestrp.personalaccountingapp.domain.repository.StateRepository;
import com.grestrp.personalaccountingapp.persistence.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public List<State> getAll () {
        return stateRepository.getAll();
    };

    public Optional<State> getById(int id) {
        return  stateRepository.getById(id);
    };

}
