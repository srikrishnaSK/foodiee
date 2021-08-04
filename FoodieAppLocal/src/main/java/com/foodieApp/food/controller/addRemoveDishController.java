package com.foodieApp.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodieApp.food.dao.addDishDaoImpl;
import com.foodieApp.food.model.addDish;

@RestController
@CrossOrigin()
public class addRemoveDishController {
	
	@Autowired
    private addDishDaoImpl addishDao;


    @PostMapping("/addDish")
    public addDish addUser(@RequestBody addDish addish) {
        System.out.println(addish.toString());
        addishDao.register(addish);
        return addish;
    }
    

}
