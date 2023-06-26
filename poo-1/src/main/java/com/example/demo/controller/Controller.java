package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.BookRepository;
import com.example.demo.book.Book;

@RestController
public class Controller {
	@Autowired
	private BookRepository repo;
	@RequestMapping("/creat")
	@PutMapping
	public ResponseEntity<?> create(@RequestBody Book book){
		return ResponseEntity.ok().body(repo.save(book));
	}
	@GetMapping("/book/{id}")
	public ResponseEntity<?> gett(@PathVariable Long id){
		Optional<Book> op=repo.findById(id);
		Book b=null;
		if(op.isPresent()) {
			b=op.get();
			return ResponseEntity.ok().body(b);
		}
		else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
	}
	@DeleteMapping("{id}")
	public ResponseEntity<?> dele(@PathVariable Long id){
		repo.deleteById(id);
	}
	@PostMapping("/book/{id}")
	public ResponseEntity<?> update(@RequestBody Book book){
		Optional<Book> op=repo.findById(book.getId());
		Book b=null;
		if(op.isPresent()) {
			b.setId(book.getId());
			b.setName(book.getName());
			b.setAge(book.getAge());
			}
		else {
			return ResponseEntity.noContent().build();
		}
}
