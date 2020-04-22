package com.library.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIBRARY")
public class Library {

    @Id
    @Column(name = "library_id")
    private Integer library_id;

    @Column(name = "library_name")
    private String library_name;

    @Column(name = "library_place")
    private String library_place;

    @Column(name = "book_ids")
    private String book_ids;

    public Integer getLibraryId() {
        return library_id;
    }

    public void setLibraryId(Integer library_id) {
        this.library_id = library_id;
    }

    public String getLibraryName() {
        return library_name;
    }

    public void setLibraryName(String library_name) {
        this.library_name = library_name;
    }

    public String getLibraryPlace() {
        return library_place;
    }

    public void setLibraryPlace(String library_place) {
        this.library_place = library_place;
    }

    public String getBookIds() {
        return book_ids;
    }

    public void setBookIds(String book_ids) {
        this.book_ids = book_ids;
    }

}