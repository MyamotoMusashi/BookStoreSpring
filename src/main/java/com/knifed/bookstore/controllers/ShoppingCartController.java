package com.knifed.bookstore.controllers;

import com.knifed.bookstore.entities.Order;
import com.knifed.bookstore.entities.ShoppingCart;
import com.knifed.bookstore.repositories.ShoppingCartRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ShoppingCartController {

    private final ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartController(ShoppingCartRepository shoppingCartRepository){
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @GetMapping("/shopping-cart")
    public ShoppingCart getShoppingCart(){
        return this.shoppingCartRepository.getShoppingCart();
    }

    @PostMapping("/shopping-cart")
    public void addToShoppingCart(@RequestBody Order order){
        this.shoppingCartRepository.addToShoppingCard(order);
    }

    @PutMapping("/shopping-cart")
    public void clearShoppingCart(@RequestParam(required = false, name="clear") Optional<String> query){
        if (query.isPresent())
        {
            this.shoppingCartRepository.clearShoppingCart();
        }
    }
}