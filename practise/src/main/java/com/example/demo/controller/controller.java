package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.person;
import com.example.demo.service.service;




@RestController
@RequestMapping("/person/api.1.0")
public class controller {
	@Autowired
	private service serv;
	@PostMapping
	@RequestMapping("/create")
		public person add(@RequestBody person p) {
			return serv.addperson(p);
			
			
		}
	@GetMapping
	@RequestMapping("/retrieve/{id}")
	
	public person fetchperson(@PathVariable int id) {
		return serv.getperson(id);
		
	}
	@GetMapping
	@RequestMapping("/retrieve/all")
	public List<person> fetchperson(){
		return serv.getperson();
	}
	@DeleteMapping
	@RequestMapping(value="delete/{id}")
	public void deleteper(@PathVariable int id) {
		serv.deleteperson(id);

	}
	@PutMapping 
	@RequestMapping(value="/update",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public person updateperson(@RequestBody person person) {
		return serv.updatepers(person);
	}
}

		
	
	
	
	


