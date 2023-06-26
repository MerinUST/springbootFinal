 package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.person;
import com.example.demo.repository.repository;


@Service
public class service {

@Autowired
repository repo;
public person addperson(person person) {
	return repo.save(person);
}
public person getperson(int id) {
	Optional<person> optional=repo.findById(null);
	if(optional.isPresent()) {
		return optional.get();
	}
	else {
		return null;
	}
}
public List<person> getperson() {
	return repo.findAll();
}
public String deleteperson(int id)
{
	repo.deleteById(id);
	return "deleted";
}
public person updatepers(person person) {
	return repo.save(person);
}

}
