package com.knifed.bookstore.entities;

public class Book {
    private String name;
    private String author;
    private Integer price;
    private String url;
    private String description;

    public Book(String name, String author, Integer price, String url, String description){
        this.name = name;
        this.author = author;
        this.price = price;
        this.url = url;
        this.description = description;
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
}
