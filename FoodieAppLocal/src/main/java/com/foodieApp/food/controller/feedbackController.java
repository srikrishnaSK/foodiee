package com.foodieApp.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodieApp.food.dao.feedbackDaoImpl;
import com.foodieApp.food.model.feedback;






@RestController
@CrossOrigin()
public class feedbackController {
	
	@Autowired
    private feedbackDaoImpl feedbackdao;


    @PostMapping("/feedback")
    public feedback addUser(@RequestBody feedback fdback) {
        System.out.println(fdback.toString());
        feedbackdao.register(fdback);
        return fdback;
    }
    

}