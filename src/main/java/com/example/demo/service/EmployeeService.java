package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	public Employee insertEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public void deleteEmployee(Employee emp);
	public Employee findEmployee(int id);
	public List<Employee> FindAllEmployee();

}
