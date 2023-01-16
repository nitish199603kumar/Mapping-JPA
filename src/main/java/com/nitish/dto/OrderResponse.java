package com.nitish.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown=true)  //Value is coming but we don't want in response/
//@JsonInclude(JsonInclude.Include.NON_NULL) //We want to see only non null value in response
public class OrderResponse {
	
	private String name;
	private String productName;
	
	public OrderResponse(String name, String productName) {
		super();
		this.name = name;
		this.productName = productName;
	}

	private Integer price;
}
