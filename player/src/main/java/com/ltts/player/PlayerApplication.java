package com.ltts.player;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class PlayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerApplication.class, args);
	}
	
	

}
