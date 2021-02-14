package com.lahiru.training.bookservice.repository;

import com.lahiru.training.librarycloud.commons.model.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
