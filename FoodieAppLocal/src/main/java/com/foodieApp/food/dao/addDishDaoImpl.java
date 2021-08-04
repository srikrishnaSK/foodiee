package com.foodieApp.food.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodieApp.food.model.User;
import com.foodieApp.food.model.addDish;

@Service
public class addDishDaoImpl {
	
	@Autowired
	private addDishDao adddishDao;
	
	public void register(addDish addish) {
        adddishDao.save(addish);
    }

}
