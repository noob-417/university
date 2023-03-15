package com.university.request;


public class StudentRequest {

	private String first_name;
	private String last_name;
	private long adress_id;
	private String email;

	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getAdress_id() {
		return adress_id;
	}
	public void setAdress_id(long adress_id) {
		this.adress_id = adress_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
