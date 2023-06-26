package com.example.demo.exception;

public class IdNotFoundException extends RuntimeException 
{
public IdNotFoundException(String noId) {
	super(noId);
}
}
