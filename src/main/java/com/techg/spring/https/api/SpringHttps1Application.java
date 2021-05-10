package com.techg.spring.https.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHttps1Application {
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Tried HTTPS Message";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringHttps1Application.class, args);
	}

}
