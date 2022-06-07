package com.knifed.bookstore.entities;

import javax.persistence.*;

@Entity()
@Table(name = "book")
public class Paper {

    @Column(name = "book_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String title;


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
