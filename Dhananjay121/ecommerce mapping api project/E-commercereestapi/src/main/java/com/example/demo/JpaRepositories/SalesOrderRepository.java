package com.example.demo.JpaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SalesOrder;
@Repository
public interface SalesOrderRepository extends JpaRepository<SalesOrder, Integer>{

}