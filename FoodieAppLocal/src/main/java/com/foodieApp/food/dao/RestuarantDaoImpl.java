package com.foodieApp.food.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodieApp.food.model.Login;
import com.foodieApp.food.model.Restuarant;
import com.foodieApp.food.model.User;

@Service
public class RestuarantDaoImpl {
	
	@Autowired
	private RestuarantDao restuarantDao;
	
	public void register(Restuarant restuarant) {
		restuarantDao.save(restuarant);
    }
	
    public Restuarant validateUser(Login login) {
        Restuarant restuarant = null;
        if (restuarantDao.findById(login.getUsername()).isPresent()) {
        	restuarant = restuarantDao.findById(login.getUsername()).get();
            if(!restuarant.getPassword().equals(login.getPassword()))
            	restuarant=null;
        }
        return restuarant;
    }

    public Boolean usernameExists(String username){
       return restuarantDao.findById(username).isPresent();
    }
}
