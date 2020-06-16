package com.itutry.p2.service;

import com.itutry.p2.bean.Customer;

public class CustomerService {

	private Customer[] customers;
	private int total;
	
	
	public CustomerService(int capacity) {
		customers = new Customer[capacity];
		addCustomer(new Customer("佟刚", '男', 45, "010-12345678", "tong@gamil.com"));
	}
	
	public boolean addCustomer(Customer customer) {
		if (total >= customers.length) {
			return false;
		}
		
		customers[total++] = customer;
		return true;
	}
	
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total) {
			return false;
		}
		
		for (int i = index; i < total - 1; i++) {
			customers[i] = customers[i+1];
		}
		customers[--total] = null;
		return true;
	}
	
	public boolean replaceCustomer(int index, Customer customer) {
		if (index < 0 || index >= total) {
			return false;
		}
		
		customers[index] = customer;
		return true;
	}
	
	public Customer getCustomer(int index) {
		if (index < 0 || index >= total) {
			return null;
		}
		
		return customers[index];
	}
	
	public Customer[] getAllCustomers() {
		Customer[] results = new Customer[total];
		
		for (int i = 0; i < total; i++) {
			results[i] = customers[i];
		}
		
		return results;
	}
	
	public int getTotal() {
		return total;
	}
}
