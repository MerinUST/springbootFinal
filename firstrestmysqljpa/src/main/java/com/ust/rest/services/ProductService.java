package com.ust.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.repository.UserRepository;
import com.ust.rest.resource.Product;
import com.ust.rest.resource.User;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	UserRepository userRepository;

	public Product getProduct(long productId) {
		Optional<Product> optional = productRepository.findById(productId);
		if (optional.isPresent())
			return optional.get();
		else
			return null;

	}

//	public Product getProduct(long productId) {
//		return repository.getProduct(productId);
//	}
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	@Transactional//(propagation=Propagation.REQUIRED)// to wrap a method in a databases transaction.
	// it allow us to use :propagation:isolation:timeout:tead-only:callback
//	public Product add(Product product) {
//		if(validate(product)) {//cannot create dupicate products
//		
//		return false;
//		}
//		else {
//			productRepository.save(product);
//			return true;
//		}
//	}
//	public boolean validate(Product product) {
//		if(product.getName().equals("Camera")) {
//			return true;
//		}
//			else {
//				return false;
//			}
	public Product add(Product product) {
		Product productT=productRepository.save(product);
		User user = new User();
		user.setUserId(5L);
		user.setDateTime(System.currentTimeMillis() + "76767676767676767676767676767676767676767");
		
		
		//User userT=userRepository.save(user);
//		//System.out.println(userT);
//		RuntimeException exception=null;
//		User userT=null;
		
		
		User userT=userRepository.save(user);
		
//		if(userT !=null && productT!=null) {
//			return true;
//		}
//		else {
//			throw new RuntimeException("record not inserted...");
//		}
		//return true;
		return productT;
	}

	public Product updateProduct(Product product) {
		Optional<Product> optional=productRepository.findById(product.getProductId());
		Product tempproduct=optional.get();
		tempproduct.setName(product.getName());
		tempproduct.setDescription(product.getDescription());
		tempproduct.setPrice(product.getPrice());
		tempproduct.setQty(product.getQty());
		return productRepository.save(tempproduct);
	}

	public void deleteProduct(long productId) {
		productRepository.deleteById(productId);
	}
}
