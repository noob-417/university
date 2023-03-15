package com.university.response;

public class AdressResponse {

	
	private long address_Id;
	private String street;
	private String city;

	
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
	@Override
	public String toString() {
		return "AdressResponse [address_Id=" + address_Id + ", street=" + street + ", city=" + city + "]";
	}




}
