package com.example.demo.dao;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Repository
public class Dao {
	
	@Autowired
	 EmployeeRepository em;
	
	public void save(Employee e)
	{
		em.save(e);
	}
	
	public void delete(int id)
	{
		Optional<Employee> o=em.findById(id);
		if(o.isPresent())
			em.deleteById(id);
		
		
	}
	public List<Employee> fetch()
	{
		List<Employee> e=em.findAll();
		return e;
	
	}
	

}
