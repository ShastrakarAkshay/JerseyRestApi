package com.rest.JerseyRestApi;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/emp")
public class EmployeeResource {
	
	EmployeeDao empRepo = new EmployeeDao();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployees() {
		return empRepo.getEmployees();
	}
	
	@GET
	@Path("/{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeById(@PathParam("empId") int id) {
		return empRepo.getEmployeeById(id);
	}
	
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee addEmployee(Employee e){
		empRepo.addEmployee(e);
		return e;
	}
	
	@DELETE
	@Path("/delete/{empId}")
	public void deleteEmployee(@PathParam("empId") int id){
		empRepo.deleteEmployee(id);
	}
	
	@PUT
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee updateEmployee(Employee e) {
		empRepo.updateEmployee(e);
		return e;
	}
	
	

}
