package com.nitish.service;

import java.util.List;

import com.nitish.dto.OrderRequest;
import com.nitish.dto.OrderResponse;
import com.nitish.entity.Customer;

public interface CustomerService {

	public Customer placeOrder(OrderRequest orderRequest);
	public List<Customer> findAllOrders();
	public List<OrderResponse> getJoinInformation();
}
