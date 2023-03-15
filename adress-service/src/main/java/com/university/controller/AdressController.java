package com.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.request.AddressRequest;
import com.university.response.AdressResponse;
import com.university.service.AdressService;

@RestController
@RequestMapping("/api/address")
public class AdressController {
	@Autowired
	AdressService addressSvc;
	
	@PostMapping("/create")
	public AdressResponse createAddress(@RequestBody AddressRequest  addressRequest)
	{
		return addressSvc.createAddress(addressRequest);
		
	}
	
	@GetMapping("/getById/{id}")
	public AdressResponse getById(@PathVariable long id)
	{
		return addressSvc.getById(id);
	}

}
