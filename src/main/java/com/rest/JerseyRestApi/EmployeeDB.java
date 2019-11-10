package com.rest.JerseyRestApi;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDB {

	public static Map<Integer, Employee> map = new HashMap<>();
	
	public static Map<Integer, Employee> getEmployees(){
		return map;
	}
	
}
