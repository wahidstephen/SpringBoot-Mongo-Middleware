package com.example.tmc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.tmc.dao.ICustomerDao;
import com.example.tmc.model.Customer;

// Controller class
@RestController
@RequestMapping(value="/")
@CrossOrigin
public class CustomerController {

	@Autowired
	ICustomerDao custdao; // Object of Customer DAO
	int CustID;
	
	// To retrieve all the customers
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	public List<Customer> getAllCustomers(){
		return custdao.getAllCust();
	}
	
	// To create a customer
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer cust) {
		
		// To auto generate ID for new customer
		List<Customer> customers = new ArrayList<Customer>();
		customers = custdao.getAllCust();
		customers.forEach((cst) -> {
			CustID+=1;
		});
		cust.setCustID(CustID);
		return custdao.createCust(cust);
	}
	
	// To retrieve a customer by customer ID
	@RequestMapping(value="/getcust/{id}", method=RequestMethod.GET)
		public Customer getCustomer(@PathVariable("id") int id) {
			return custdao.getCustbyId(id);
		}
}
