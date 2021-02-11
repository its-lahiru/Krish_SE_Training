package com.lahiru.training.libraryui.controller;

import com.lahiru.training.librarycloud.commons.model.Student;
import com.lahiru.training.libraryui.config.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@EnableOAuth2Sso
public class UIController extends WebSecurityConfigurerAdapter {

    @Autowired
    RestTemplate restTemplate;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/")
                .permitAll()
                .anyRequest()
                .authenticated();
    }

    @RequestMapping(value = "/")
    public String loadUI(){
        return "home";
    }

    @RequestMapping(value = "/secure")
    public String loadSecuredUI(){
        return "home-secured";
    }

    @RequestMapping(value = "students")
    public String loadStudents(Model model){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", AccessToken.getAccessToken());

        HttpEntity<Student> studentHttpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<Student[]> responseEntity = restTemplate.exchange("http://localhost:8181/services/students",
                HttpMethod.GET, studentHttpEntity, Student[].class);

        model.addAttribute("students", responseEntity.getBody());

        return "home-secured";
    }

}
