package com.lahiru.training.lendingservice.service;

import com.lahiru.training.lendingservice.model.DetailResponse;
import com.lahiru.training.lendingservice.repository.LendRepository;
import com.lahiru.training.librarycloud.commons.model.book.Book;
import com.lahiru.training.librarycloud.commons.model.lend.Lend;
import com.lahiru.training.librarycloud.commons.model.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class LendServiceImpl implements LendService {

    @Autowired
    LendRepository lendRepository;

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Lend save(Lend lend) {
        return lendRepository.save(lend);
    }

    @Override
    public Lend findLendById(int id) {
        Optional<Lend> lend = lendRepository.findById(id);
        if (lend.isPresent()) {
            return lend.get();
        }
        return null;
    }

    @Override
    public List<Lend> getAllLends() {
        return lendRepository.findAll();
    }

    @Override
    public DetailResponse findDetailResponse(int id) {

        Lend lend = findLendById(id);
        Student student = getStudent(lend.getStudentId());
        Book book = getBook(lend.getBookId());

        return new DetailResponse(lend, student, book);
    }

    private Student getStudent(int studentId){
        Student student = restTemplate.getForObject("http://localhost:8080/services/students/" + studentId, Student.class);
        return student;
    }

    private Book getBook(int bookId){
        return restTemplate.getForObject("http://localhost:8080/services/books/" + bookId, Book.class);
    }
}
