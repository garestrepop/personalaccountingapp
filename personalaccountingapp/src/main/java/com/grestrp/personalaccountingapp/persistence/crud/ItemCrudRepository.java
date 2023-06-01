package com.grestrp.personalaccountingapp.persistence.crud;

import com.grestrp.personalaccountingapp.persistence.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemCrudRepository extends CrudRepository<Item, Integer> {
}
