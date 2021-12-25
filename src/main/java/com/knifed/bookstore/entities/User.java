package com.knifed.bookstore.entities;

public class User {

    private String name;
    private ShoppingCart shoppingCart;

    public User(String name, ShoppingCart shoppingCart){
        this.setName(name);
        this.setShoppingCart(shoppingCart);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
