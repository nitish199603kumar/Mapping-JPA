package com.nitish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nitish.dto.OrderRequest;
import com.nitish.dto.OrderResponse;
import com.nitish.entity.Customer;
import com.nitish.service.CustomerServiceImpl;

@RestController
public class OrderController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest orderRequest)
	{
		return customerServiceImpl.placeOrder(orderRequest);
	}
	
	@GetMapping("/allOrder")
	public List<Customer> findAllOrders()
	{
		return customerServiceImpl.findAllOrders();
	}
	

	@GetMapping("/getJoinInformation")
	public List<OrderResponse> getJoinInformation()
	{
		 List<OrderResponse> joinInformation = customerServiceImpl.getJoinInformation();
		 System.out.println("JoinInformation from controller" +joinInformation);
		 return joinInformation;
	}
	
	
}
