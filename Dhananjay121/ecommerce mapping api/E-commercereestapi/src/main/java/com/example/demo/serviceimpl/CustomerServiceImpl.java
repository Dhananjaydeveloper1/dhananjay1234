package com.example.demo.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.JpaRepositories.CustomerRepository;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer addcustomer=customerRepository.save(customer);
		return addcustomer;
	}

	@Override
	public ArrayList<Customer> getListOfCustomer() {
		// TODO Auto-generated method stub
		ArrayList<Customer> getlist=(ArrayList<Customer>) customerRepository.findAll();
		
		return getlist;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer updatecustomer=customerRepository.save(customer);
		return updatecustomer;
	}

	@Override
	public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}

}