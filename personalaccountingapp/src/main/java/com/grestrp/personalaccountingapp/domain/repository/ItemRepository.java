package com.grestrp.personalaccountingapp.domain.repository;

import com.grestrp.personalaccountingapp.persistence.entity.Item;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ItemRepository {
    List<Item> getAll();
    Optional<Item> getById(int id);
    Item save(Item item);
    Item update (int id, String name, int stateId, LocalDateTime updatedAt);
    void delete(int id);
}
