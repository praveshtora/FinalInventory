package com.cdk.learn.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdk.learn.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
	
}
