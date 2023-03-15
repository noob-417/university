package com.university.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.student.feignClient.AddressFeignClient;
import com.university.entity.Student;
import com.university.request.StudentRequest;
import com.university.response.AdressResponse;
import com.university.response.StudentResponse;

import reactor.core.publisher.Mono;

import com.university.reporsitroy.StudentRepository;

@Service
public class StudentService {
	Logger logger = LoggerFactory.getLogger(StudentService.class);

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	WebClient webClient;
	
	@Autowired
	AddressFeignClient addressFeignClient;

	public StudentResponse createAddress(StudentRequest studentReq) {
		Student student = new Student();
		student.setEmail(studentReq.getEmail());
		student.setFirst_name(studentReq.getFirst_name());
		student.setLast_name(studentReq.getLast_name());
		student.setAdress_id(studentReq.getAdress_id());
		studentRepository.save(student);

		StudentResponse studentResponse = new StudentResponse(student);
		
		//this call is using webclient
		//studentResponse.setAdressResponse(getAddressById(student.getAdress_id()));
		System.out.println("Address ID:   --->"+ student.getAdress_id()+ ""+addressFeignClient.getById(student.getAdress_id()).toString());
		
		//this call is using feignclient
		studentResponse.setAdressResponse(addressFeignClient.getById(student.getAdress_id()));
		return  studentResponse;

	}

	public StudentResponse getById(long id) {
		logger.info("Inside getById" + id);

		Student student = studentRepository.findById(id).get();

		StudentResponse studentResponse = new StudentResponse(student);
		
		//this call is using webclient
		
		//studentResponse.setAdressResponse(getAddressById(student.getAdress_id()));
		//this call is using feignclient
		
		studentResponse.setAdressResponse(addressFeignClient.getById(student.getAdress_id()));
		
		
		return studentResponse;

	}

	public AdressResponse getAddressById(long addressId) {
		Mono<AdressResponse> adressResponse = webClient.get().uri("/getById/" + addressId).retrieve()
				.bodyToMono(AdressResponse.class);
		return adressResponse.block();
	}
}
