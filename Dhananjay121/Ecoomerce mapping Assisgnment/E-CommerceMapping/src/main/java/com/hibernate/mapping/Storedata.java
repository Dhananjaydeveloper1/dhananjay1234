package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.example.demo.BillingAddress;
import com.example.demo.Cart;
import com.example.demo.CartItem;
import com.example.demo.Customer;
import com.example.demo.Product;
import com.example.demo.SalesOrder;
import com.example.demo.ShippingAddress;
import com.example.demo.User;

public class Storedata {

	public static void main(String args[]) {
		
		StandardServiceRegistry standardServiceRegistryObj=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(standardServiceRegistryObj).getMetadataBuilder().build();
		
		SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		//creating object for mapping
		Customer customer=new Customer();
		
		ShippingAddress shippingAddress=new ShippingAddress();
		
		BillingAddress billingAddress=new BillingAddress();
		
		User user=new User();
		
		Cart cart=new Cart();
		
		SalesOrder salesOrder=new SalesOrder();
		
		Product product=new Product();
		
		CartItem cartItem=new CartItem();
		
		transaction.commit();
		session.close();
		System.out.println("Success");
	}
}