package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.BillingAddress;
import com.example.demo.model.Product;

public interface BillingAddressService {

	//Add billing address
	BillingAddress addBillingAddresss(BillingAddress billingAddress);
	
	//List of Billing address
	ArrayList<BillingAddress> listOfBillingAddress();
	
	//Delete of Billing
	void deleteBillingAddressById(Integer id);
	
	//Update billing address
	BillingAddress updateBillingAddress(BillingAddress billingAddress);
	
}