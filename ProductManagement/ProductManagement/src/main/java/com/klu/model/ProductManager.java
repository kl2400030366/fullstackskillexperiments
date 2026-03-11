package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.repository.ProductRepository;

@Service
public class ProductManager {
	
	@Autowired
	ProductRepository PR;
	
	public String insertData(Product P) throws Exception
	{
		PR.save(P);
		return "Product saved sucess...";
	}

}
