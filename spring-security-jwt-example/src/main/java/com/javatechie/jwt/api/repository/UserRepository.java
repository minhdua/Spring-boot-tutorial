package com.javatechie.jwt.api.repository;

import com.javatechie.jwt.api.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<MyUser,Integer> {
    MyUser findByUserName(String username);
}
