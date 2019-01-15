/**
 * 
 */
package com.cg.rest.employeedemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.employeedemo.entity.Employee;
import com.cg.rest.employeedemo.repository.EmployeeRepository;

/**
 * @author ugawari
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public void saveEmployee(Employee employee) {
		repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

}
