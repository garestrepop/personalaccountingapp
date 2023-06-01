package com.grestrp.personalaccountingapp.web.controller;

import com.grestrp.personalaccountingapp.domain.service.BudgetService;
import com.grestrp.personalaccountingapp.persistence.entity.Budget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/budget")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @GetMapping()
    public List<Budget> getAll () {
        return budgetService.getAll();
    };

    @GetMapping("/{id}")
    public Optional<Budget> getById(@PathVariable("id") int id) {
        return budgetService.getById(id);
    };

    @PostMapping()
    public Budget save (@RequestBody Budget budget){
        return budgetService.save(budget);
    };

    public Budget update (int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    };

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int id){
        return budgetService.delete(id);
    };

}
