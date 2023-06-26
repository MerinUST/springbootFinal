package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.book.Book;
import com.example.demo.bookRepository.BookRepository;

//import jakarta.persistence.Entity;
@RestController
public class controller {
@Autowired
private BookRepository repo;



@RequestMapping("/book")
@PostMapping
public ResponseEntity<Book> create(@RequestBody Book book){

	return ResponseEntity.ok().body(repo.save(book));
	
}
@GetMapping("/book/{id}") 
public ResponseEntity<?> get(@PathVariable Long id){
	Optional<Book> op=repo.findById(id);//orElseThrow(()->new ResourseNotFoundException("Book not found"));
	Book u=null;
	
	if(op.isEmpty()) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		
		
	}
	else {
		u=op.get();
		return ResponseEntity.status(HttpStatus.OK).body(u);
		
	}
}
@DeleteMapping
@RequestMapping("/book/{id}")
public ResponseEntity<?> deletee(@PathVariable Long id){
	repo.deleteById(id);
	return ResponseEntity.ok().body(null);
}
@PutMapping
@RequestMapping("/update")
public ResponseEntity<?> update(@RequestBody Book book ){
	Optional<Book> opt=repo.findById(book.getId());
Book u=null;
	
	if(opt.isPresent()) {
		
		u.setId(book.getId());
		u.setAuther(book.getAuther());
		u.setName(book.getName());
		
	
		return ResponseEntity.ok().body(repo.save(u));
		
		
	}
	else {
		
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		
	}
	
	
	
}


}



