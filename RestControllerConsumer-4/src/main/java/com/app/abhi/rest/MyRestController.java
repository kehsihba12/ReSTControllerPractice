package com.app.abhi.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.abhi.entity.Book;

@RestController
@RequestMapping("/main")
public class MyRestController {
	
	
	@GetMapping("/first")
	public ResponseEntity<String> getMessage() {

		return ResponseEntity.ok("im here");
	}

	@GetMapping("/second/{id}/{name}")
	public ResponseEntity<String> getMessageA(

			@PathVariable("id") Integer id, @PathVariable("name") String name) {

		return ResponseEntity.ok("User id => " + id + " => user name " + name);
	}

	@GetMapping("/third")
	public ResponseEntity<Book> getMessageB() {

		return ResponseEntity.ok(new Book(123, "java", 500.0, "Raghu"));
	}

	@PostMapping("/1")
	public ResponseEntity<String> getMessageC(@RequestBody Book book) {

		return ResponseEntity.ok("new book ==> " + book);
	}

	@PutMapping("/2")
	public ResponseEntity<Book> getMessageD(@RequestBody Book book) {

		return ResponseEntity.ok(new Book(123, "java", 500.0, "Raghu"));
	}

	@DeleteMapping("/3/{id}")
	public ResponseEntity<String> getMessageF(@PathVariable Integer id) {

		return ResponseEntity.ok("From Delete ==> " + id);
	}

}
