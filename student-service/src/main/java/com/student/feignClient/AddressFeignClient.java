package com.student.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.university.response.AdressResponse;

//@FeignClient(url = "${address.service.url}", value = "address-feign-client", path = "/api/address")

//with eureka server
@FeignClient( value = "adress-serivce", path = "/api/address")

public interface AddressFeignClient {

	@GetMapping("/getById/{id}")
	public AdressResponse getById(@PathVariable long id);

}
