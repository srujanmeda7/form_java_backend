package com.example.demo.controller;

import com.example.demo.modal.Items;
import com.example.demo.service.Itemservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class Homecontroller {
    @Autowired
    private Itemservice service;

    @GetMapping("/getproducts")
    public List<Items> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/getproduct/{item}")
    public Items getProduct(@PathVariable int item){
        return service.getProduct(item);
    }
    @PostMapping("/additem")
    public void addItems(@RequestBody Items item){
        service.addItem(item);
    }
@PutMapping("/updateitem")
    public void updateItem(@RequestBody Items item){
        service.updateItem(item);
}
@DeleteMapping("/deleteitem/{item}")
    public void deleteItem(@PathVariable int item){
        service.deleteItem(item);
}

}
