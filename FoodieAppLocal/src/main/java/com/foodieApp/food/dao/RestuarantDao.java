package com.foodieApp.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodieApp.food.model.Restuarant;

public interface RestuarantDao extends JpaRepository<Restuarant,String> {
}

