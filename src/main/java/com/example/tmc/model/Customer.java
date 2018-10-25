package com.example.tmc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	
	@Id
	private int custID;
	private String custName;
	private String dateOfJoining;
	private City city;
	private String contactNo;
	
	public Customer() { }
	
	public Customer(int custID, String custName, String dateOfJoining, City city, String contactNo) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.dateOfJoining = dateOfJoining;
		this.city = city;
		this.contactNo = contactNo;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	
	
	
}
