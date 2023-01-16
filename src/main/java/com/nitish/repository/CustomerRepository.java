package com.nitish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nitish.dto.OrderResponse;
import com.nitish.entity.Customer;

@Repository
@EnableJpaRepositories 
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	
	
	@Query("select new com.nitish.dto.OrderResponse(c.name,p.productName) FROM Customer c JOIN c.products p ")
	public List<OrderResponse> getJoinInformation();
	
//	public Customer save();

}
