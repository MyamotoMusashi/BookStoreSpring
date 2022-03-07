package com.knifed.bookstore.entities;

public class Book {
    public static Integer currentCount = 0;
    private Integer id;
    private String name;
    private String author;
    private Integer price;
    private String url;
    private String description;
    private Integer quantity;

    public Book(String name, String author, Integer price, String url, String description, Integer quantity){
        this.setName(name);
        this.setAuthor(author);
        this.setPrice(price);
        this.setUrl(url);
        this.setDescription(description);
        this.setQuantity(quantity);
        this.setId(Book.currentCount+1);
        Book.currentCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }
}
