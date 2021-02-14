package com.lahiru.training.bookservice.service;

import com.lahiru.training.librarycloud.commons.model.book.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);

    Book findBookById(int id);

    List<Book> getAllBooks();

}
