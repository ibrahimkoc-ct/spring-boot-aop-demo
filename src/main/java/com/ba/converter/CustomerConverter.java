package com.ba.converter;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.ba.dto.CustomerDTO;
import com.ba.entity.Customer;

public class CustomerConverter {

	public static Customer toCustomer(CustomerDTO dto) {
		Customer customer = new Customer();
		customer.setId(dto.getId());
		customer.setLastname(dto.getLastname());
		customer.setName(dto.getName());
		return customer;
	}

	public static CustomerDTO toDto(Customer customer) {
		CustomerDTO dto = new CustomerDTO();
		dto.setId(customer.getId());
		dto.setLastname(customer.getLastname());
		dto.setName(customer.getName());
		return dto;
	}

	public static List<Customer> toCustomerList(List<CustomerDTO> dtoList) {
		List<Customer> customers = new ArrayList<Customer>();
		dtoList.forEach(dto -> {
			Customer customer = new Customer();
			customer.setId(dto.getId());
			customer.setLastname(dto.getLastname());
			customer.setName(dto.getName());
			customers.add(customer);
		});
		return customers;
	}

	public static List<CustomerDTO> toDTOList(List<Customer> customers) {
		List<CustomerDTO> dtoList = new ArrayList<CustomerDTO>();
		customers.forEach(customer -> {
			CustomerDTO dto = new CustomerDTO();
			dto.setId(customer.getId());
			dto.setLastname(customer.getLastname());
			dto.setName(customer.getName());
			dtoList.add(dto);
		});
		return dtoList;
	}
}