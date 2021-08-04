package com.foodieApp.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.foodieApp.food.model.onlineOrders;

public interface onlineorderDao extends JpaRepository<onlineOrders,String> {
}