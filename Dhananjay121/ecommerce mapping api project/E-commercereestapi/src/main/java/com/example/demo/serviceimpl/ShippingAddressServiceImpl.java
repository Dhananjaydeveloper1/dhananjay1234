package com.example.demo.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.JpaRepositories.ShippingAddressRepository;
import com.example.demo.model.ShippingAddress;
import com.example.demo.service.ShippingAddressService;

@Service
public class ShippingAddressServiceImpl implements ShippingAddressService{

	@Autowired
	ShippingAddressRepository shippingAddressRepository;
	@Override
	public ShippingAddress addShippingAddress(ShippingAddress shippingAddress) {
		// TODO Auto-generated method stub
		ShippingAddress shippingAddress2=shippingAddressRepository.save(shippingAddress);
		return shippingAddress2;
	}

	@Override
	public ArrayList<ShippingAddress> listOfShippingAddress() {
		// TODO Auto-generated method stub
		ArrayList<ShippingAddress> shippingAddresslist=(ArrayList<ShippingAddress>) shippingAddressRepository.findAll();
		return shippingAddresslist;
	}

	@Override
	public void deleteShippingAddress(Integer id) {
		// TODO Auto-generated method stub
		shippingAddressRepository.deleteById(id);
	}

	@Override
	public ShippingAddress updateShippingAddress(ShippingAddress shippingAddress) {
		// TODO Auto-generated method stub
		ShippingAddress shippingAddress2=shippingAddressRepository.save(shippingAddress);
		return shippingAddress2;
	}

}