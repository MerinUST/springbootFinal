package com.example.demo.book;

import jakarta.persistence.Entity;

@Entity

public class Book {
private Long id;
private String name;
private String auther;
public Book() {
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuther() {
	return auther;
}
public void setAuther(String auther) {
	this.auther = auther;
}
public Book(Long id, String name, String auther) {
	super();
	this.id = id;
	this.name = name;
	this.auther = auther;
}


}
