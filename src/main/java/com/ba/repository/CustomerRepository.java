package com.ba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ba.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
