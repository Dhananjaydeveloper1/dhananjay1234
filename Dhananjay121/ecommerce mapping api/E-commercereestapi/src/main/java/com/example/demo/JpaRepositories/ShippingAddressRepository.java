package com.example.demo.JpaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ShippingAddress;
@Repository
public interface ShippingAddressRepository extends JpaRepository<ShippingAddress, Integer>{

}