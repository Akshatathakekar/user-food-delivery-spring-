package com.capgemini.userdata.entity;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class Address {
	
//	@ManyToOne(cascade=CascadeType.ALL)
//	private Users user;
	
	private String addressLine;
	private String city;
	
	
	
//	
//	public Users getUser() {
//		return user;
//	}
//	public void setUser(Users user) {
//		this.user = user;
//	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address( String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + "]";
	}
	
	
}
