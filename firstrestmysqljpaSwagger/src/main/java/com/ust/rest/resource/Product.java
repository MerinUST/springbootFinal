package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
// select next_val as id_val from hibernate_sequence for update
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	//@GeneratedValue
							// AUTO is the default generation type or strategy
	private long productid; // Generation strategy is the strategy that the jpa should follow to generate
							// the primary key values. The default generation type is auto.when no strategy
							// is given JPA uses auto strategy
	private String name; // when the underline database is mysql generation type, auto means, the jpa
							// will create a hibernate sequence, in the database or generation of primary
							// keys
	private String description;
	private BigDecimal price;
	private int qty;

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}