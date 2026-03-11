package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Product;
import com.klu.model.ProductManager;

@RestController
@RequestMapping("product")
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductManager PM;
	
	@PostMapping("insert")
	public String save(@RequestBody Product P)
	{
		try {
			return PM.insertData(P);
		} 
		
		catch (Exception e) {
			return e.getMessage();
		}
		
		
	}
	

}
