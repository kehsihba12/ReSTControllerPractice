package com.app.abhi.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class MyRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		// String url = "http://localhost:8080/main/first";
		String url = "http://localhost:8080/main/1";

		String body = "{\"id\":101,\"name\":\"abc\"}";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<>(body, headers);

		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.postForEntity(url, entity, String.class);

		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusCode());

	}

}
