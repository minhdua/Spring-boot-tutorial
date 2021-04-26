package com.javatechie.jwt.api;

import com.javatechie.jwt.api.entity.MyUser;
import com.javatechie.jwt.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<MyUser> myUsers = Stream.of(
                new MyUser(101, "phuongnh20", "password", "phuongnh@gmail.com"),
                new MyUser(102, "user1", "pwd1", "user1@gmail.com"),
                new MyUser(103, "user2", "pwd2", "user2@gmail.com"),
                new MyUser(104, "user3", "pwd3", "user3@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(myUsers);
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}
