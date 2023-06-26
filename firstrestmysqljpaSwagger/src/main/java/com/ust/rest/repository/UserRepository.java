package com.ust.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.rest.resource.User;

@Repository
//telling spring boot system to auto configure and inject the data 
//auto wire - injects
//suto configure creates the object
public interface UserRepository extends JpaRepository<User,Long> {
	
}