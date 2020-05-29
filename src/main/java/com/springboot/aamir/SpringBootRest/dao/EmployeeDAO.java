package com.springboot.aamir.SpringBootRest.dao;

import java.util.List;

import com.springboot.aamir.SpringBootRest.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

}
