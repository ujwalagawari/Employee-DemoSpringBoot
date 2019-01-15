/**
 * 
 */
package com.cg.rest.employeedemo.services;

import java.util.List;

import com.cg.rest.employeedemo.entity.Employee;

/**
 * @author ugawari
 *
 */
public interface EmployeeService {

	
	  void saveEmployee(Employee employee);
	  
	  List<Employee> getAllEmployees();
	 

}
