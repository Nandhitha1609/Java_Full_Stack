package java_coding_exercise1;

import java.util.ArrayList;
import java.util.List;

	class AddEmployee {
	    private List<Employee> list = new ArrayList<>();

	    // Method to add a new employee
	    public void addEmployee(Employee emp) {
	        list.add(emp);
	    }

	    // Method to get employee by id
	    public Employee getEmployee(int id) {
	        for (Employee emp : list) {
	            if (emp.getId() == id) {
	                return emp;
	            }
	        }
	        return null; // Employee not found
	    }
	}



