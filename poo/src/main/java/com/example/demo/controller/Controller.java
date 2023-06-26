package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.BookRepository;
import com.example.demo.book.Book;
import com.example.demo.exception.IdNotFoundException;

@RestController

public class Controller {
	@Autowired
	private BookRepository repo;
	@RequestMapping("/book")
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody Book book){
		return ResponseEntity.ok().body(repo.save(book));
	}
	public ResponseEntity<?> get(@PathVariable Long id)throws IdNotFoundException{
		Optional<Book> op=repo.findById(id);
		Book obj=null;
		if(op.isPresent()) {
			obj=op.get();
			return ResponseEntity.ok().body(obj);
		}
		else {
			throw new IdNotFoundException("id not fount");
			//return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
	}
	public ResponseEntity<?> delete(@PathVariable Long id){
		repo.deleteById(id);
		return ResponseEntity.ok().body(null);
	}
	public ResponseEntity<?> update(@RequestBody Book book)throws IdNotFoundException
	{
		Optional<Book> op=repo.findById(book.getId());
		Book obj=null;
		if(op.isPresent()) {
			obj.setId(book.getId());
			obj.setName(book.getName());
			obj.setAge(book.getAge());
			return ResponseEntity.ok().body(repo.save(obj));
		}
		else {
			throw new IdNotFoundException("id not found");
			//return ResponseEntity.noContent().build();
		}
	}
}
