package com.nitish.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Integer Id;
	private String name;
	private String email;
	private String gender;
	
	@OneToMany(targetEntity=Product.class,cascade=CascadeType.ALL)
	@JoinColumn(name="cust_prod_fk",referencedColumnName="id")
	private List<Product> products;
}
