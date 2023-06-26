package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data//adds set get methods
@NoArgsConstructor
@AllArgsConstructor
public class Product {//Auto is the default generation type or strategy
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//the strategy which the jpa should use or follow to generate primary key values
	//when the strategy is not specified jpa uses auto strategy.when the underline database is Mysql generatio type.auto means the jpa will create a hybernate sequence in the database for generation of primary keys.
	// select next_val as id_val from hibernate_sequence for update
	
	//@GeneratedValue(strategy=GenerationType.IDENTITY)//for this strategy to wprk first we have to create a table in Mysql database
	//and explicitily specifies the autoincrement(AI) as checked for the primary key column.
	//and in application.property file:#spring.jpa.hibernate.ddl-auto=update this should not be set.
	//if it is set it should have value as update.
	private String _id;
	private String name;
	private String description;
	private BigDecimal price;
	private int qty;
	
//	public int getQty() {
//		return qty;
//	}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//	
//	public String get_Id() {
//		return _Id;
//	}
//	public void set_Id(String _Id) {
//		this._Id = _Id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}
//	

}
