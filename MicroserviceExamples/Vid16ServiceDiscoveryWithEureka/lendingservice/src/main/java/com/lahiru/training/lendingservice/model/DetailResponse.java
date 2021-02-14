package com.lahiru.training.lendingservice.model;

import com.lahiru.training.librarycloud.commons.model.book.Book;
import com.lahiru.training.librarycloud.commons.model.lend.Lend;
import com.lahiru.training.librarycloud.commons.model.student.Student;

public class DetailResponse implements Response {

    Lend lend;
    Student student;
    Book book;

    public DetailResponse(Lend lend, Student student, Book book) {
        this.lend = lend;
        this.student = student;
        this.book = book;
    }

    public Lend getLend() {
        return lend;
    }

    public void setLend(Lend lend) {
        this.lend = lend;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
