package com.university.response;

import com.university.entity.Student;

public class StudentResponse {

	
	private long id;
	private String first_name;
	private String last_name;
	private AdressResponse adressResponse;
	private String email;
	
	public StudentResponse(Student student) {
		super();
		this.id = student.getId();
		this.first_name = student.getFirst_name();
		this.last_name = student.getLast_name();
		//this.adressResponse=student.g();
		this.email=student.getEmail();
		
	}


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

		 
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public AdressResponse getAdressResponse() {
		return adressResponse;
	}


	public void setAdressResponse(AdressResponse adressResponse) {
		this.adressResponse = adressResponse;
	}


}
