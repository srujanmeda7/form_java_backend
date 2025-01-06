package com.example.demo.service;

import com.example.demo.modal.Items;
import com.example.demo.respositry.Itemrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Itemservice {
    @Autowired
    private Itemrepo repo;

    public List<Items> getProducts() {
    return repo.findAll();
    }

    public Items getProduct(int id) {
        return repo.findById(id).orElse(new Items());
    }

    public void addItem(Items item) {
        repo.save(item);
    }

    public void updateItem(Items item) {
        repo.save(item);
    }

    public void deleteItem(int id) {
        repo.deleteById(id);
    }
}
