package com.foodieApp.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodieApp.food.model.User;

public interface UserDao extends JpaRepository<User,String> {
}
