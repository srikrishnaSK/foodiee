package com.foodieApp.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodieApp.food.dao.onlineorderDaoImpl;
import com.foodieApp.food.model.onlineOrders;


@RestController
@CrossOrigin()
public class onlineOrdersController {
	
	@Autowired
    private onlineorderDaoImpl onlineorderdao;


    @PostMapping("/addOrder")
    public onlineOrders updateOrders(@RequestBody onlineOrders onlineorder) {
        System.out.println(onlineorder.toString());
        onlineorderdao.register(onlineorder);
        return onlineorder;
    }
    

}