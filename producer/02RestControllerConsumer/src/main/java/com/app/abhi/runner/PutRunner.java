package com.app.abhi.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.app.entity.Bool;

@Component
public class PutRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		String url = "http://localhost:8080/main/2";

		String body = "{\"id\":101,\"name\":\"abc\",\"price\":600.0}";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<>(body, headers);

		RestTemplate template = new RestTemplate();

		ResponseEntity<Bool> exchange = template.exchange(url, HttpMethod.PUT, entity, Bool.class);

		System.out.println(exchange.getBody());

	}

}
