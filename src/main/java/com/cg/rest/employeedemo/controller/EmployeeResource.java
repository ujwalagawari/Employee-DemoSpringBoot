/**
 * 
 */
package com.cg.rest.employeedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.employeedemo.entity.Employee;
import com.cg.rest.employeedemo.services.EmployeeService;

/**
 * @author ugawari
 *
 */
@RestController
@RequestMapping("/employees") // Addressable resource
public class EmployeeResource {

	@Autowired
	private EmployeeService service;

	@PostMapping //Uniform Constraint interface 
	public void saveEmployee(@RequestBody Employee employee) {
		service.saveEmployee(employee);
	}

	/*
	 * @RequestMapping(method = RequestMethod.GET, produces = {"application/json",
	 * "application/xml"})
	 */

	@GetMapping // Uniform Constraint interface
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

}
