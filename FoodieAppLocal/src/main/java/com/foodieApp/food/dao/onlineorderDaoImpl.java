package com.foodieApp.food.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.foodieApp.food.model.onlineOrders;

@Service
public class onlineorderDaoImpl {
	
	@Autowired
	private onlineorderDao onlineorderdao;
	
	public void register(onlineOrders onlineorders) {
		onlineorderdao.save(onlineorders);
    }
}

