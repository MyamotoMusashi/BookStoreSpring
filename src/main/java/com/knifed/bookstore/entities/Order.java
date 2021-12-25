package com.knifed.bookstore.entities;

public class Order {

    private Book book;
    private User user;
    private OrderStatus status;

    public Order(Book book, User user){
        this.setBook(book);
        this.setUser(user);
        this.setStatus(OrderStatus.NotProcessed);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
