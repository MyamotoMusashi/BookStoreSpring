package com.knifed.bookstore.controllers;

import com.knifed.bookstore.entities.Book;
import com.knifed.bookstore.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    private final BookRepository bookRepository;

    public HomeController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/home")
    public String getHome() {
        return "index";
    }

    @GetMapping("/stores")
    public String getStores() {
        return "stores";
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return this.bookRepository.getBooksList();
    }

    @GetMapping("/authors")
    public String getAuthors(){
        return "authors";
    }

    @GetMapping("/contacts")
    public String getContacts(){
        return "contacts";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }
}
