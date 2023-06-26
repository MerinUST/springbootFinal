  package com.ust.rest.resources;

import java.util.ArrayList;
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

import com.ust.rest.resource.Product;
import com.ust.rest.services.impl.ProductService;

//import antlr.collections.List;

@RestController

@RequestMapping("/product/api.3.0")
public class ProductResourse {
	@Autowired
	ProductService service;
	@GetMapping
	@RequestMapping("/retrieve/{productId}")
	
	
	public ResponseEntity<Product> fetchProduct(@PathVariable String productId) {
		return ResponseEntity.ok(service.getProduct(productId));
		
	}
	@GetMapping
	@RequestMapping("/retrieve/all")
	public ResponseEntity<List<Product>> fetchProducts(){
		List<Product>list= service.getProducts();
		return ResponseEntity.ok(list);
	}
	@PostMapping
	@RequestMapping(value="/create",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> addProduct(@RequestBody Product product){//objcet will be retrived as json
		//boolean result=service.add(product);
		return new ResponseEntity<Product>(service.add(product),HttpStatus.ACCEPTED);
//		if(result) {
//			return ResponseEntity.status(HttpStatus.CREATED).body(true);
//		}else {
//			return ResponseEntity.status(HttpStatus.CREATED).body(false);
//		}
	}
	// upating
@PutMapping 
@RequestMapping(value="/update",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
public Product updateProduct(@RequestBody Product product) {
	return service.updateProduct(product);
}

@DeleteMapping
@RequestMapping(value="delete/{productId}")
public void deleteProduct(@PathVariable String productId) {
	service.deleteProduct(productId);
}
}


