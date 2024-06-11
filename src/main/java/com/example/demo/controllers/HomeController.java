
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Dao;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;



@RestController
public class HomeController {
	@Autowired
	Dao dao;
	
	//private EmployeeService empservice;
	/*
	 * @GetMapping("/employee") public String insertEmployee(Model model) { Employee
	 * emp=new Employee(); emp.setName("Meghana"); emp.setAge(21);
	 * emp.setLocation("CTR"); Employee upemp=empservice.insertEmployee(emp); String
	 * msg= "Employee "+upemp.getName()+" Added successfully";
	 * model.addAttribute("employee",upemp); model.addAttribute("message",msg);
	 * return "home";
	 * 
	 * }
	 */
	
	@PostMapping("/kk")
	public void save(@RequestParam String name, @RequestParam int age, @RequestParam String loc)
	{
		Employee e=new Employee();
		
		System.out.println(name);
		System.out.println(age);
		e.setAge(age);
		e.setLocation(loc);
		e.setName(name);
		dao.save(e);
	}
	
	@DeleteMapping("/delete")
	public void delete(int i)
	{
		dao.delete(i);
		
	}
	@PutMapping("/update")
	public void update(@RequestBody Employee emp )
	{
		dao.save(emp);
	}
	@GetMapping("/fetch")
	public List<Employee> fetch()
	{
		List<Employee> e=dao.fetch();
		return e;
		
	}
	

}
