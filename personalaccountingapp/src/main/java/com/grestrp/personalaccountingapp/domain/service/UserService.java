package com.grestrp.personalaccountingapp.domain.service;

import com.grestrp.personalaccountingapp.domain.repository.UserRepository;
import com.grestrp.personalaccountingapp.persistence.entity.Budget;
import com.grestrp.personalaccountingapp.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll () {
        return userRepository.getAll();
    };

    public Optional<User> getById(int id) {
        return  userRepository.getById(id);
    };

    public User save (User user){
        return userRepository.save(user);
    };

    public Budget update (int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    };

    public boolean delete(int id){
        return getById(id).map(User -> {
            userRepository.delete(id);
            return true;
        }).orElse(false);
    };
    
    
}