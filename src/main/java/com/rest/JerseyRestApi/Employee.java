package com.rest.JerseyRestApi;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private int empid;
	private int salary;
	private String name;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int salary){
		this.empid = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", name=" + name + "]";
	}
	
	

}
