package com.knifed.bookstore.entities;

import java.util.List;

public class ShoppingCart {
    private List<Book> books;

    public ShoppingCart(List<Book> books){
        this.setBooks(books);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
