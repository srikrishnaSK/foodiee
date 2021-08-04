package com.foodieApp.food.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodieApp.food.model.feedback;


@Service
public class feedbackDaoImpl {
	
	@Autowired
	private feedbackDao feedbackdao;
	
	public void register(feedback fdback) {
		feedbackdao.save(fdback);
    }

}