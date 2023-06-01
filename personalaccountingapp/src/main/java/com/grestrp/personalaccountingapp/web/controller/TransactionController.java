package com.grestrp.personalaccountingapp.web.controller;

import com.grestrp.personalaccountingapp.domain.service.TransactionService;
import com.grestrp.personalaccountingapp.persistence.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping()
    public List<Transaction> getAll () {
        return transactionService.getAll();
    };

    @GetMapping("/{id}")
    public Optional<Transaction> getById(@PathVariable("id") int id) {
        return transactionService.getById(id);
    };

    @PostMapping()
    public Transaction save (@RequestBody Transaction transaction){
        return transactionService.save(transaction);
    };

    public Transaction update (int id, String name, int stateId, LocalDateTime updatedAt) {
        return null;
    };

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int id){
        return transactionService.delete(id);
    };


}
