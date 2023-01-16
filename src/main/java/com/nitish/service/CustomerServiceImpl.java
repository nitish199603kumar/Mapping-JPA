package com.nitish.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitish.dto.OrderRequest;
import com.nitish.dto.OrderResponse;
import com.nitish.entity.Customer;
import com.nitish.repository.CustomerRepository;
import com.nitish.repository.ProductRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	
	public Customer placeOrder(OrderRequest orderRequest) {
	
	//	 return (Customer) customerRepository.saveAll(Arrays.asList(orderRequest.getCustomer()));
		
		return customerRepository.save(orderRequest.getCustomer());
		
	}



	
	public List<Customer> findAllOrders() {
		
		
//		List<Customer> al=new ArrayList<Customer>();
		
		
		return (List<Customer>) customerRepository.findAll();
//		 Iterable<Customer> findAll = customerRepository.findAll();
//	  return (List<Customer>) customerRepository.findAll(); 
//	
//	 Object allData1=null;
//	 for(Object allData:findAll)
//	 {
//		 allData1=allData;
//		 
//		System.out.println(allData);
//	 }
	 
//	 return al;
	 
	}

	@Override
	public List<OrderResponse> getJoinInformation() {
		
		return customerRepository.getJoinInformation();
		
	}

	
	
	
	
}
