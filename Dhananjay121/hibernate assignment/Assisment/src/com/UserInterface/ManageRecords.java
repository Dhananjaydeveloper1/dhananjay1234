package com.UserInterface;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.id.IntegralDataTypeHolder;

import com.hibernate.services.CustomerServices;
import com.hibernate.services.ProductServices;

public class ManageRecords {

	public static void main(String args[]) {
		
		/*---Product Crud Operation-----*/
		ProductServices productServices=new ProductServices();
		
		Integer product1=productServices.addProduct("Clothes", "L size", "T-Shirt", 200, 6);
		
		List<Integer> listProduct=new ArrayList<>();
		listProduct.add(product1);
		if(listProduct.size()!=0) {
			System.out.println("Record is inserted");
		}
		else
		{
			System.out.println("Record is not inserted");
		}
		
		/*List of product records in databse*/
		try {
			productServices.listOfAllProducts();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		/*Update product records in database*/
		try {
		productServices.updateProductDetails(3, 600);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/* delete product records in database by id */
		try {
			productServices.deleteProductById(2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		/*------------End of product crud operation--------*/
		
		/*------Customer crud operation-------*/
		CustomerServices customerServices=new CustomerServices();
		
		Integer customer1=customerServices.addCustomer("Dhananjay", "kumat", "766679237");
		Integer customer2=customerServices.addCustomer("Rahul", "kumar", "7667926376");
		List<Integer> listOfCustomer=new ArrayList<>();
		listOfCustomer.add(customer1);
		listOfCustomer.add(customer2);
		if(listOfCustomer.size()!=0) {
			System.out.println("Record is inserted ");
		}
		else {
			System.out.println("Record is not inserted ");
		}
		
		/*List of all customer*/
		try {
			customerServices.listOfAllCustomers();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*Update customer record in database*/
		try {
			customerServices.updateCustomerDetails(7, "76679161717");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*Delete customer record in database by id*/
		try {
			customerServices.deleteCustomerById(5);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*------End of crud operation-----*/
	}
}