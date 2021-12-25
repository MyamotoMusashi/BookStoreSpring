package com.knifed.bookstore.controllers;

import com.knifed.bookstore.entities.Book;
import com.knifed.bookstore.repositories.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return this.bookRepository.getBooksList();
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book){
        this.bookRepository.addBook(book);
    }

    @PutMapping("/books")
    public void updateBook(@RequestBody Book book) {
        this.bookRepository.updateBook(book);
    }
    
    @DeleteMapping("/books")
    public void deleteBook(@RequestBody Book book){
        this.bookRepository.deleteBook(book);
    }
}
