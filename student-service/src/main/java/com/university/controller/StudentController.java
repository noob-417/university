package com.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.request.StudentRequest;
import com.university.response.StudentResponse;
import com.university.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	StudentService studentSvc;
	
	@PostMapping("/create")
	public StudentResponse createAddress(@RequestBody StudentRequest  studentRequest)
	{
		return studentSvc.createAddress(studentRequest);
		
	}
	
	@GetMapping("/getById/{id}")
	public StudentResponse getById(@PathVariable long id)
	{
		return studentSvc.getById(id);
	}

}
