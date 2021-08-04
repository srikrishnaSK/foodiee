package com.foodieApp.food.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restuarant {

	@Id
    private String username;
    private String password;
    private String resturantname;
    private String category;
    private String location;
    private String contactdetails;
  
    public Restuarant() {

    }
    
	public Restuarant(String username,String password, String resturantname, String category, String location, String contactdetails) {
    	this.username = username;
    	this.password = password;
    	this.resturantname = resturantname;
    	this.category = category;
    	this.location = location;
    	this.contactdetails = contactdetails;
    
    }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getResturantName() {
		return resturantname;
	}

	public void setResturantname(String resturantname) {
		this.resturantname = resturantname;
	}

	public String getContactdetails() {
		return contactdetails;
	}

	public void setContactdetails(String contactdetails) {
		this.contactdetails = contactdetails;
	}

	public void setResturantName(String resturantName) {
		this.resturantname = resturantName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactDetails() {
		return contactdetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactdetails = contactDetails;
	}
	 @Override
	    public String toString() {
	        return "Restuarant{" +
	                "username='" + username + '\'' +
	                ", password='" + password + '\'' +
	                ", resturantname='" + resturantname + '\'' +
	                ", category='" + category + '\'' +
	                ", location='" + location + '\'' +
	                ", contactDetails='" + contactdetails + '\''+
	                '}';
	    }
}
