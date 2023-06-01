package com.grestrp.personalaccountingapp.web.controller;

import com.grestrp.personalaccountingapp.domain.service.ItemService;
import com.grestrp.personalaccountingapp.persistence.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping()
    public List<Item> getAll () {
        return itemService.getAll();
    };

    @GetMapping("/{id}")
    public Optional<Item> getById(@PathVariable("id") int id) {
        return itemService.getById(id);
    };

    @PostMapping()
    public Item save (@RequestBody Item item){
        return itemService.save(item);
    };

    public Item update (int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    };

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int id){
        return itemService.delete(id);
    };

}
