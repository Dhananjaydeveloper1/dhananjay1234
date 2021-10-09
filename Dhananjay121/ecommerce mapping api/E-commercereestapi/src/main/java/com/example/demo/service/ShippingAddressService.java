package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.BillingAddress;
import com.example.demo.model.ShippingAddress;

public interface ShippingAddressService {

	//Add Shipping Address
	ShippingAddress addShippingAddress(ShippingAddress shippingAddress);
	
	//List of Shipping Address
	ArrayList<ShippingAddress> listOfShippingAddress();

	//Update Shipping Address
	ShippingAddress updateShippingAddress(ShippingAddress shippingAddress);
	
	//Delete of ShippingAddress
	void deleteShippingAddress(Integer id);
	
	
}