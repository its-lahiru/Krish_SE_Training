package com.lahiru.training.librarycloud.commons.model.lend;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "lend")
@Data
public class Lend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int lend_id;

    @Column(name = "student_id")
    int student_id;
    @Column(name = "book_id")
    int book_id;
    @Column(name = "lend_from")
    LocalDateTime lend_from;
    @Column(name = "lend_till")
    LocalDateTime lend_till;

}
