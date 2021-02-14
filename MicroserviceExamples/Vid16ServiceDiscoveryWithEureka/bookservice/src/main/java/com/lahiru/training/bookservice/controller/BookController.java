package com.lahiru.training.bookservice.controller;

import com.lahiru.training.bookservice.service.BookService;
import com.lahiru.training.librarycloud.commons.model.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public Book save(@RequestBody Book book){
        return bookService.save(book);
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    public Book findBookById(@PathVariable(value = "id") int bookId){
        return bookService.findBookById(bookId);
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

}
