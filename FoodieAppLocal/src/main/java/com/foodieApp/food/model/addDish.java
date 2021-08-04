package com.foodieApp.food.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class addDish {
	
	@Id
	private String resturantname;
	private String dishtype;
	private String cusine;
	private String dishname;
	private String dishprice;
	private String description;
	private String availabletime;
	private String enabledish = "Enable";

    public addDish() {

    }


	public addDish(String resturantname, String dishtype, String cusine, String dishname, String dishprice, String description, String availabletime) {
    	
        this.resturantname = resturantname;
        this.dishtype = dishtype;
        this.cusine = cusine;
        this.dishname = dishname;
        this.dishprice = dishprice;
        this.description = description;
        this.availabletime = availabletime;
    }
	
	
    public String getEnabledish() {
		return enabledish;
	}

	public void setEnabledish(String enabledish) {
		this.enabledish = enabledish;
	}

	public String getResturantname() {
		return resturantname;
	}
	public void setResturantname(String resturantname) {
		this.resturantname = resturantname;
	}
	public String getDishtype() {
		return dishtype;
	}
	public void setDishtype(String dishtype) {
		this.dishtype = dishtype;
	}
	public String getCusine() {
		return cusine;
	}
	public void setCusine(String cusine) {
		this.cusine = cusine;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public String getDishprice() {
		return dishprice;
	}
	public void setDishprice(String dishprice) {
		this.dishprice = dishprice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAvailabletime() {
		return availabletime;
	}
	public void setAvailabletime(String availabletime) {
		this.availabletime = availabletime;
	}
	
	@Override
    public String toString() {
        return "Dish{" +
                "resturantname='" + resturantname + '\'' +
                ", dishtype='" + dishtype + '\'' +
                ", cusine='" + cusine + '\'' +
                ", dishname='" + dishname + '\'' +
                ", dishprice='" + dishprice + '\'' +
                ", description='" + description + '\'' +
                ", availabletime=" + availabletime +
                ", enabledish=" + enabledish +
                '}';
    }
}
