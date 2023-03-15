package com.student.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ComponentScan({"com.university.controller","com.university.service"})
@EntityScan({"com.university.entity"})
@EnableJpaRepositories({"com.university.reporsitroy"})
@EnableFeignClients({"com.student.feignClient"})
@EnableDiscoveryClient
public class StudentServiceApplication {

	@Value("${address.service.url}")
	private String addressUrl;
	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}
	@Bean
	public WebClient webClient()
	{
		WebClient webClient=WebClient.builder().baseUrl(addressUrl).build();
		return webClient;
	}
	

}
