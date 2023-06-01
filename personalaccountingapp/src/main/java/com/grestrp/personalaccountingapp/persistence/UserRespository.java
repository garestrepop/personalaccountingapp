package com.grestrp.personalaccountingapp.persistence;

import com.grestrp.personalaccountingapp.domain.repository.UserRepository;
import com.grestrp.personalaccountingapp.persistence.crud.UserCrudRepository;
import com.grestrp.personalaccountingapp.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRespository implements UserRepository {
    @Autowired
    private UserCrudRepository userCrudRepository;

    @Override
    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }

    @Override
    public Optional<User> getById(int id) {
        return userCrudRepository.findById(id);
    }

    @Override
    public User save(User user) {
        return userCrudRepository.save(user);
    }

    @Override
    public User update(int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    }

    @Override
    public void delete(int id) {
        userCrudRepository.deleteById(id);
    }
}
