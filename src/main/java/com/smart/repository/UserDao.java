package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.entities.User;

public interface UserDao  extends JpaRepository<User,Integer> {

}
