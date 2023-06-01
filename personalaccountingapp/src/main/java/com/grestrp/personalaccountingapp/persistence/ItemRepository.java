package com.grestrp.personalaccountingapp.persistence;

import com.grestrp.personalaccountingapp.persistence.crud.ItemCrudRepository;
import com.grestrp.personalaccountingapp.persistence.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class ItemRepository implements com.grestrp.personalaccountingapp.domain.repository.ItemRepository {
    @Autowired
    private ItemCrudRepository itemCrudRepository;

    @Override
    public List<Item> getAll() {
        return (List<Item>) itemCrudRepository.findAll();
    }

    @Override
    public Optional<Item> getById(int id) {
        return itemCrudRepository.findById(id);
    }

    @Override
    public Item save(Item item) {
        return itemCrudRepository.save(item);
    }

    @Override
    public Item update(int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    }

    @Override
    public void delete(int id) {
        itemCrudRepository.deleteById(id);

    }
}
