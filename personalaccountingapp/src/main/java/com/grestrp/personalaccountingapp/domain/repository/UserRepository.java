package com.grestrp.personalaccountingapp.domain.repository;

import com.grestrp.personalaccountingapp.persistence.entity.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAll();
    Optional<User> getById(int id);
    User save(User user);
    User update (int id, String name, int stateId, LocalDateTime updatedAt);
    void delete(int id);
}
