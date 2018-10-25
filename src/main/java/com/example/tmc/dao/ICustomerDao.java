package com.example.tmc.dao;

import java.util.List;

import com.example.tmc.model.Customer;

// Interface of Customer model to be implemented in Controller
public interface ICustomerDao {

	public List<Customer> getAllCust();
	public Customer getCustbyId(int id);
	public Customer createCust(Customer cust);
	
}
