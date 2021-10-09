package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.ProblemReporter;
import org.springframework.stereotype.Service;

import com.example.demo.JpaRepositories.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		Product addProduct=productRepository.save(product);
		return addProduct;
	}

	@Override
	public ArrayList<Product> ListOfProducts() {
		// TODO Auto-generated method stub\
		ArrayList<Product> getproduct=(ArrayList<Product>) productRepository.findAll();
		return getproduct;
	}

	@Override
	public void deleteProductById(Integer id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
		
	}
	
	public Product updateProduct(Product product) {
		Product product2=productRepository.save(product);
		return product2;
	}

	

}