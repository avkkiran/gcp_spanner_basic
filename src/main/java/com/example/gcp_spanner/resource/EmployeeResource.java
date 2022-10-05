package com.example.gcp_spanner.resource;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gcp_spanner.model.Employee;
import com.example.gcp_spanner.repo.EmployeeRepository;

@RestController
public class EmployeeResource {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		logger.info("Entering GET employees end point");
		List<Employee> employeeList = new ArrayList<>();
		employeeRepository.findAll().forEach(emp -> employeeList.add(emp));
		logger.info("Found employees: "+employeeList.toString());
		return employeeList;
	}
	
	@PostMapping("/employee")
	public void createEmployee(@RequestBody Employee employee) {
		logger.info("Entering POST employee end point with body: "+employee.toString());
		employeeRepository.save(employee);
	}
}
