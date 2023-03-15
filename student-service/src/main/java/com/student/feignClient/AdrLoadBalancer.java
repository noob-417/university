package com.student.feignClient;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

@LoadBalancerClient(value = "adress-serivce") 	
public class AdrLoadBalancer {

	@LoadBalanced
	@Bean
	public Feign.Builder feignBuilder()
	{
		return Feign.builder();
	}
}
