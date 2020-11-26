package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
