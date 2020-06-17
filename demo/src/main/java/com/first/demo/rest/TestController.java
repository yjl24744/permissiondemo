package com.first.demo.rest;

import com.first.demo.vo.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private Person person;

    @RequestMapping("/query")
    public String query(){
        return person.getName() + ":性别" + person.getGender() + ",年龄" + person.getAge();
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
