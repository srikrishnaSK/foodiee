package com.foodieApp.food.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class onlineOrders {
	
	@Id
	private String restuarantname;
	private String username;
	private String productdetails;
	private String totalvalue;
	private String orderstaus;
	
    public onlineOrders() {

    }
    
	public onlineOrders(String restuarantname,String username, String productdetails, String totalvalue, String orderstaus) {
    	this.restuarantname = restuarantname;
    	this.username = username;
    	this.productdetails = productdetails;
    	this.totalvalue = totalvalue;
    	this.orderstaus = orderstaus;
	}
	
	
	
	public String getOrderstaus() {
		return orderstaus;
	}
	public void setOrderstaus(String orderstaus) {
		this.orderstaus = orderstaus;
	}
	public String getRestuarantname() {
		return restuarantname;
	}
	public void setRestuarantname(String restuarantname) {
		this.restuarantname = restuarantname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProductdetails() {
		return productdetails;
	}
	public void setProductdetails(String productdetails) {
		this.productdetails = productdetails;
	}
	public String getTotalvalue() {
		return totalvalue;
	}
	public void setTotalvalue(String totalvalue) {
		this.totalvalue = totalvalue;
	}
	@Override
    public String toString() {
        return "Order Details{" +
                "restuarantname='" + restuarantname + '\'' +
                ", username='" + username + '\'' +
                ", productdetails='" + productdetails + '\'' +
                ", totalvalue='" + totalvalue + '\'' +
                ", orderstaus='" + orderstaus + '\'' +
                '}';
    }

}
