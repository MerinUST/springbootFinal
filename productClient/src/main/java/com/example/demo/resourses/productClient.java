package com.example.demo.resourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class productClient {
	@Autowired
	RestTemplate template;
	@GetMapping
	public String testMethod() {
		//String url="http://localhost:8080/product/api.2.0";
		String url="http://localhost:8080/product/api.2.0/retrieve/all";
		//String result=template.getForObject(url,String.class);
		Object result=template.getForObject(url,Object.class);
		return "working..."+result;
	}
	

}
