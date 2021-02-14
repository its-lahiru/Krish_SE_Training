package com.lahiru.training.librarycloud.commons.model.lend;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "lend")
@Data
public class Lend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int lendId;

    int studentId;
    int bookId;
    LocalDateTime lendFrom;
    LocalDateTime lendTill;

}
