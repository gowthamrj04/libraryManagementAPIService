package com.library.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @Column(name = "book_id")
    private Integer book_id;

    @Column(name = "book_name")
    private String book_name;

    @Column(name = "author")
    private String author;

    public Integer getBookId() {
        return book_id;
    }

    public void setLBookId(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBookName() {
        return book_name;
    }

    public void setBookName(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}