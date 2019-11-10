package com.rest.JerseyRestApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeDao {

	private Map<Integer, Employee> empList = EmployeeDB.getEmployees();
	
	public EmployeeDao() {
		empList.put(101, new Employee(101, "akshay", 25000));
		empList.put(102, new Employee(102, "nilesh", 35000));
	}

	public List<Employee> getEmployees() {
		return new ArrayList<Employee>(empList.values());
	}

	public Employee getEmployeeById(int id) {
		return empList.get(id);
	}

	public void addEmployee(Employee e) {
		empList.put(e.getEmpid(), e);
	}

	public Employee updateEmployee(Employee e) {
		empList.put(e.getEmpid(), e);
		return e;
	}

	public void deleteEmployee(int id) {
		empList.remove(id);
	}

}
