package com.klu.model;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.repository.FacultyRepository;



@Service
public class FacultyManager {
	
	@Autowired
	FacultyRepository FR;
	
	public String insertData(Faculty F) throws Exception
	{
		FR.save(F);
		return "Faculty data added...";
	}
	
	public List<Faculty> readData() throws Exception
	{
		return FR.findAll();
		
	}
	
	public String updateData(Faculty F) throws Exception
	{
		Faculty temp = FR.findById(F.getId()).get();
		temp.setName(F.getName());
		temp.setDept(F.getDept());
		FR.save(temp);
		return "Data Updated..";
	}
	
	public String deleteData(Long id)throws Exception
	{
		Faculty temp = FR.findById(id).get();
		FR.delete(temp);
		return "Faculty data has been deleted";
	}
	

}
