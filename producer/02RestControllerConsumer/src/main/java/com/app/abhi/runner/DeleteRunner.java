package com.app.abhi.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class DeleteRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		String url = "http://localhost:8080/main/3/{id}";

		RestTemplate template = new RestTemplate();

		ResponseEntity<String> exchange = template.exchange(url, HttpMethod.DELETE, null, String.class, 101);
		System.out.println(exchange.getBody());
	}

}
