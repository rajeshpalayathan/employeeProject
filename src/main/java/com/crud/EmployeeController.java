package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value="/EmployeeRM")
public class EmployeeController {
	@Autowired
	EmployeeService es;

	@PostMapping(value = "/postEmployee")
	// http://localhost:8080/EmployeeRM/postEmployee
	public String postThis(@RequestBody Employee e) {
		return es.postThis(e);
	}

	@GetMapping(value = "/mapAllEmployee")
	// http://localhost:8080/EmployeeRM/mapAllEmployee
	public List<Employee> findAllEmployee() {
		return es.findAllEmployeeService();
	}

	@PostMapping(value = "/postExtra5Employee")
//http://localhost:8080/EmployeeRM/postExtra5Employee
	public String add5MoreEmployeeController(@RequestBody List<Employee> e) {
		return es.add5MoreEmployeeService(e);
	}

@GetMapping(value="/mapmaxsalaryemployee")
//http://localhost:8080/EmployeeRM/mapmaxsalaryemployee
public List<Employee> findall()
{
	return es.findmaxSalaryService();
}
@GetMapping(value="/mapid/{variable}")
//http://localhost:8080/EmployeeRM/mapid/2
public Employee findEmployeebyid(@PathVariable int variable)
{
	return es.findIdbyIdinService(variable);   }

@GetMapping("/mapdeleteoneelement/{variable}")
//http://localhost:8080/EmployeeRM/mapdeleteoneelement/3
public String deleteoneObject(@PathVariable int variable)
{
	return es.deleteoneObjectService(variable); }


}


	


