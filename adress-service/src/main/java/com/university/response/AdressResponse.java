package com.university.response;

import com.university.entity.Address;

public class AdressResponse {

	
	private long address_Id;
	private String street;
	private String city;
	
	public AdressResponse(Address adress) {
		super();
		this.address_Id = adress.getId();
		this.street = adress.getStreet();
		this.city = adress.getCity();
	}
	
	public long getAddress_Id() {
		return address_Id;
	}
	public void setAddress_Id(long address_Id) {
		this.address_Id = address_Id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}




}
