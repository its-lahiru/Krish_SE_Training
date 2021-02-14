package com.lahiru.training.lendingservice.service;

import com.lahiru.training.lendingservice.hystrix.BookCommand;
import com.lahiru.training.lendingservice.hystrix.CommonHystrixCommand;
import com.lahiru.training.lendingservice.model.DetailResponse;
import com.lahiru.training.lendingservice.repository.LendRepository;
import com.lahiru.training.librarycloud.commons.model.book.Book;
import com.lahiru.training.librarycloud.commons.model.lend.Lend;
import com.lahiru.training.librarycloud.commons.model.student.Student;
import com.netflix.hystrix.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class LendServiceImpl implements LendService {

    @Autowired
    HystrixCommand.Setter setter;

    @Autowired
    LendRepository lendRepository;

    @LoadBalanced
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
    public DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException {

        Lend lend = findLendById(id);
        Student student = getStudent(lend.getStudent_id());
        Book book = getBook(lend.getBook_id());

        return new DetailResponse(lend, student, book);
    }

    private Student getStudent(int studentId) throws ExecutionException, InterruptedException {

        CommonHystrixCommand<Student> studentCommonHystrixCommand = new CommonHystrixCommand<Student>(/*"default"*/ setter, ()->
        {
            return restTemplate.getForObject("http://student/services/students/" + studentId, Student.class);
        }, ()->{
            return new Student();
        });

        Future<Student> studentFuture = studentCommonHystrixCommand.queue();
        return studentFuture.get();

//        Student student = restTemplate.getForObject("http://student/services/students/" + studentId, Student.class);
//        return student;

    }

    private Book getBook(int bookId){

//        return restTemplate.getForObject("http://book/services/books/" + bookId, Book.class);
        BookCommand bookCommand = new BookCommand(restTemplate, bookId);
        return bookCommand.execute();

    }
}
