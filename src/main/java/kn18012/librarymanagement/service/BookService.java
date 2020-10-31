package kn18012.librarymanagement.service;

import kn18012.librarymanagement.domain.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findById(Long id);
}