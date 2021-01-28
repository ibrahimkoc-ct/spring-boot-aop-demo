package com.ba.service;

import java.util.List;


import com.ba.dto.CustomerDTO;

public interface CustomerService {
	
	public List<CustomerDTO> getAllCustomer();
	
	public CustomerDTO addCustomer(CustomerDTO dto);
	
	public void deleteCustomer(Long id);
	
	public CustomerDTO updateCustomer(CustomerDTO dto);
	

}
