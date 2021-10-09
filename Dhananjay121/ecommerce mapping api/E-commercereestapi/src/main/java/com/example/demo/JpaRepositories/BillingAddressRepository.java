package com.example.demo.JpaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BillingAddress;
@Repository
public interface BillingAddressRepository extends JpaRepository<BillingAddress, Integer> {

}