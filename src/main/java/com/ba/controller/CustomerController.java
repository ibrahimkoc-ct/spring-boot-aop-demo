package com.ba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ba.dto.CustomerDTO;
import com.ba.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl service;
	
	
	@GetMapping
	public ResponseEntity<List<CustomerDTO>> getAllCustomer(){
		return ResponseEntity.ok(service.getAllCustomer());
	}
	
	@PostMapping
	public ResponseEntity<CustomerDTO> addCustomer(@RequestBody CustomerDTO dto){
		return ResponseEntity.ok(service.addCustomer(dto));
	}
	
	@PutMapping
	public ResponseEntity<CustomerDTO> update(@RequestBody CustomerDTO dto){
		return ResponseEntity.ok(service.updateCustomer(dto));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Long id){
		service.deleteCustomer(id);
		return ResponseEntity.ok("Customer is deleted");
	}

}
