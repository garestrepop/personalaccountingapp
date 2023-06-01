package com.grestrp.personalaccountingapp.web.controller;

import com.grestrp.personalaccountingapp.domain.service.UserService;
import com.grestrp.personalaccountingapp.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService UserService;

    @GetMapping()
    public List<User> getAll () {
        return UserService.getAll();
    };

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable("id") int id) {
        return UserService.getById(id);
    };

    @PostMapping()
    public User save (@RequestBody User user){
        return UserService.save(user);
    };

    public User update (int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    };

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int id){
        return UserService.delete(id);
    };

}
