package com.ba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ba.converter.CustomerConverter;
import com.ba.dto.CustomerDTO;
import com.ba.entity.Customer;
import com.ba.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;

	@Override
	public List<CustomerDTO> getAllCustomer() {
		List<Customer> customers = repository.findAll();
		return CustomerConverter.toDTOList(customers);
	}

	@Override
	public CustomerDTO addCustomer(CustomerDTO dto) {
		Customer customer = repository.save(CustomerConverter.toCustomer(dto));
		dto.setId(customer.getId());
		return dto;
	}

	@Override
	public void deleteCustomer(Long id) {
		repository.deleteById(id);
	}

	@Override
	public CustomerDTO updateCustomer(CustomerDTO dto) {
		repository.save(CustomerConverter.toCustomer(dto));
		return dto;

	}

}
