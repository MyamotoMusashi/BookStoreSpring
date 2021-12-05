package com.knifed.bookstore.repositories;

import com.knifed.bookstore.entities.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {
    private List<Book> booksList = new ArrayList<Book>();

    public BookRepository(){
        Book book1 = new Book("50 Shades of Gray", "Dorian Gray", 50, "data:image/jpeg;base64,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", "nice description");
        Book book2 = new Book("Amazing Adventures of Spider-Man", "Stan Lee", 60, "data:image/jpeg;base64,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", "even better description");
        this.booksList.add(book1);
        this.booksList.add(book2);
    }

    public List<Book> getBooksList(){
        return this.booksList;
    }
}
