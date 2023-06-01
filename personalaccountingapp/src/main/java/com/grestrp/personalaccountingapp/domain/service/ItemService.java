package com.grestrp.personalaccountingapp.domain.service;

import com.grestrp.personalaccountingapp.domain.repository.ItemRepository;
import com.grestrp.personalaccountingapp.persistence.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAll () {
        return itemRepository.getAll();
    };

    public Optional<Item> getById(int id) {
        return  itemRepository.getById(id);
    };

    public Item save (Item item){
        return itemRepository.save(item);
    };

    public Item update (int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    };

    public boolean delete(int id){
        return getById(id).map(Item -> {
            itemRepository.delete(id);
            return true;
        }).orElse(false);
    };
}
