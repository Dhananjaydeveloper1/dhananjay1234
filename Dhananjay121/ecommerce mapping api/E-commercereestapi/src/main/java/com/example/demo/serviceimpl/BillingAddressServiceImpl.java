package com.example.demo.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.JpaRepositories.BillingAddressRepository;
import com.example.demo.model.BillingAddress;
import com.example.demo.service.BillingAddressService;
@Service
public class BillingAddressServiceImpl implements BillingAddressService{

	@Autowired
	BillingAddressRepository billingAddressRepository;
	@Override
	public BillingAddress addBillingAddresss(BillingAddress billingAddress) {
		// TODO Auto-generated method stub
		BillingAddress billingAddress2=billingAddressRepository.save(billingAddress);
		return billingAddress2;
	}

	@Override
	public ArrayList<BillingAddress> listOfBillingAddress() {
		// TODO Auto-generated method stub
		ArrayList<BillingAddress> billingAddress=(ArrayList<BillingAddress>) billingAddressRepository.findAll();
		return billingAddress;
	}

	@Override
	public void deleteBillingAddressById(Integer id) {
		// TODO Auto-generated method stub
		billingAddressRepository.deleteById(id);
	}

	@Override
	public BillingAddress updateBillingAddress(BillingAddress billingAddress) {
		// TODO Auto-generated method stub
		BillingAddress billingAddress2=billingAddressRepository.save(billingAddress);
		return billingAddress2;
	}

}