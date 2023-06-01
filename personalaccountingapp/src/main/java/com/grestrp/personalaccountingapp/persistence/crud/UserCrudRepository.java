package com.grestrp.personalaccountingapp.persistence.crud;

import com.grestrp.personalaccountingapp.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer> {
}
