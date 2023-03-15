package com.university.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.entity.Address;
import com.university.request.AddressRequest;
import com.university.response.AdressResponse;
import com.university.reporsitroy.AdressRepository;
@Service
public class AdressService {
	Logger logger=LoggerFactory.getLogger(AdressService.class);
	
	@Autowired
	AdressRepository adressRepository;
	
	public AdressResponse createAddress(AddressRequest addressRequest)
	{
		Address address=new Address();
		address.setCity(addressRequest.getCity());
		address.setStreet(addressRequest.getStreet());
		
		adressRepository.save(address);
		
		return new AdressResponse(address);
		
	}
	public AdressResponse getById(long id)
	{
		logger.info("Inside getById"+id);


		Address address=adressRepository.findById(id).get();
		
		return new AdressResponse(address);
		
	}
}
