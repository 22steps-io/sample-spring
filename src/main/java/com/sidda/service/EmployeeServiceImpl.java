package com.sidda.service;

import java.util.List;

import com.sidda.model.Employee;
import com.sidda.repository.EmployeeRepository;
import com.sidda.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	// This is where Spring is going to help us by resolving hardcoded declarations
	private EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.sidda.service.EmployeeService#findAll()
	 */
	@Override
	public List<Employee> findAll(){
		// Notice here we have Hardcoded a reference to employeeReference. 
		//		This is where our Spring starts into step in! It doesnot allow us to hardcode the stuff and does the work for us! 
		return employeeRepository.findAll();
	}
}
