package com.example.tmc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.tmc.model.Customer;

@Repository
public class ICustomerDAOImpl implements ICustomerDao {

	@Autowired
	private MongoTemplate mt;
	
	@Override
	public List<Customer> getAllCust() {
		// TODO Auto-generated method stub
		return mt.findAll(Customer.class);
	}

	@Override
	public Customer getCustbyId(int id) {
		// TODO Auto-generated method stub
		return mt.findById(id, Customer.class);
	}

	@Override
	public Customer createCust(Customer cust) {
		// TODO Auto-generated method stub
		mt.save(cust);
		return cust;
	}

}
