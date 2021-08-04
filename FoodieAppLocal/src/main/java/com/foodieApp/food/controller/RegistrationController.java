package com.foodieApp.food.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.foodieApp.food.dao.RestuarantDaoImpl;
import com.foodieApp.food.dao.UserDaoImpl;
import com.foodieApp.food.model.User;
import com.foodieApp.food.model.Restuarant;

@RestController
@CrossOrigin()
public class RegistrationController {

    @Autowired
    private UserDaoImpl userDao;
    @Autowired
    private RestuarantDaoImpl restuarantDaoImpl;


    @PostMapping("/userregister")
    public User addDish(@RequestBody User user) {
        System.out.println(user.toString());
        userDao.register(user);
        return user;
    }

    @PostMapping("/checkUserName")
    public boolean checkAvailability(@RequestBody String username){
        return userDao.usernameExists(username);
    }
    
    @PostMapping("/registerRestuarant")
    public Restuarant addRestuarant(@RequestBody Restuarant restuarant) {
    	System.out.println(restuarant.toString());
    	restuarantDaoImpl.register(restuarant);
    	return restuarant;
    }
}
