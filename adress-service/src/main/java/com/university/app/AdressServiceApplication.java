package com.university.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.university.controller","com.university.service"})
@EntityScan({"com.university.entity"})
@EnableJpaRepositories({"com.university.reporsitroy"})
public class AdressServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdressServiceApplication.class, args);
	}

}
	