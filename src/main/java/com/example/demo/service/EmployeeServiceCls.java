package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceCls implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
    @Override
	public Employee insertEmployee(Employee emp) {
    	return employeeRepository.save(emp);
		
	}
    @Override
	public Employee updateEmployee(Employee emp) {
    	return employeeRepository.save(emp);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		employeeRepository.delete(emp);

	}

	@Override
	public Employee findEmployee(int id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> FindAllEmployee() {
		return employeeRepository.findAll();
	}

}
