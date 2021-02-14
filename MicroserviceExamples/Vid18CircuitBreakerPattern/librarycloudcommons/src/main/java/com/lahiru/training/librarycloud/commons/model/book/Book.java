package com.lahiru.training.librarycloud.commons.model.book;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "name")
    String name;
    @Column(name = "author")
    String author;
    @Column(name = "category")
    String category;

}
