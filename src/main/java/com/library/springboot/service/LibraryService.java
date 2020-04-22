package com.library.springboot.service;

import java.util.List;

import com.library.springboot.model.Library;
import com.library.springboot.model.LibraryRepository;
import com.library.springboot.model.Book;
import com.library.springboot.model.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    @Autowired
    private BookRepository bookRepository;

    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getSingleBookDetails(Integer id) {
        return bookRepository.findById(id).get();
    }

    public Library getSingleLibraryDetails(Integer id) {
        return libraryRepository.findById(id).get();
    }

    public Library createLibrary(Library library) {
        Library savedlibrary = libraryRepository.save(library);
        return savedlibrary;
    }

}