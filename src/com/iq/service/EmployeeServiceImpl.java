package com.iq.service;

import java.util.ArrayList;
import java.util.List;

import com.iq.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private static List<Employee>employees=null;
	
	static {
		
		employees=new ArrayList<Employee>();
		employees.add(new Employee(100, "vennela", 10000.00));
		employees.add(new Employee(101, "navya", 20000.00));
		employees.add(new Employee(102, "sarita", 30000.00));
		employees.add(new Employee(103, "indu", 40000.00));
		employees.add(new Employee(104, "vani", 50000.00));

		
		
		
	}
	@Override
	public List<Employee> findAll() {
	
		return employees;
	}



	
}


