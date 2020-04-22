package com.library.springboot.controller;

import java.util.List;

import com.library.springboot.exception.RecordNotFoundException;
import com.library.springboot.model.Book;
import com.library.springboot.model.Library;
import com.library.springboot.model.LibraryRepository;
import com.library.springboot.service.LibraryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
@CrossOrigin("*")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @Autowired
    private LibraryRepository libraryRepository;

    @GetMapping("/home")
    public String welcome() {
        return "Welcome to the Library Management API Service..!";
    }

    @GetMapping
    public List<Library> getLibrary() {
        return libraryService.getAllLibraries();
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return libraryService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    Book getBook(@PathVariable Integer id) {
        return libraryService.getSingleBookDetails(id);
    }

    @GetMapping("/{id}")
    Library getLibrary(@PathVariable Integer id) {
        return libraryService.getSingleLibraryDetails(id);
    }

    @PostMapping
    Library addLibrary(@RequestBody Library library) {
        Library savedEmployee = libraryRepository.save(library);
        return savedEmployee;
    }

    @PutMapping
    Library updateLibrary(@RequestBody Library library) {
        Library updatedEmployee = libraryRepository.save(library);
        return updatedEmployee;
    }

    @DeleteMapping("/{id}")
    public String deleteLibraryById(@PathVariable("id") Integer id) throws RecordNotFoundException {
        libraryRepository.deleteById(id);
        return "Deleted Library id " + id;
    }

}