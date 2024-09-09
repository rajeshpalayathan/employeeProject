package com.crud;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;
	public String postThis(Employee e) {
		return dao.postThis(e);
	}
public List<Employee> findAllEmployeeService()
{
	return dao.findAllemployeeDao();
}


public String add5MoreEmployeeService(List<Employee> e)
{
	return dao.add5moreEmployee(e);
}


public List<Employee> findmaxSalaryService()
{ List<Employee> employee=dao.CurrentDatabase();
	int max=employee.stream().map(x->x.getSalary()).max(Comparable::compareTo).get();
	//.map(x-> {x=x; return "Name= "+x.getName()+", Salary="+x.getSalary(); })
	List<Employee> resultlist= employee.stream().filter(x-> x.getSalary()==max).collect(Collectors.toList());
return resultlist;
	
}

public Employee findIdbyIdinService(int x)
{
	return dao.findbyIdDao(x);
}
public String deleteoneObjectService( int x)
{
	return dao.deleteoneObjectDao(x);
	
}


public List<Employee> findmaxsalary530(List<Employee> list)
{
	int max=list.stream().map(x->x.getSalary()).max(Comparable::compareTo).get();
	List<Employee> resultlist= list.stream().filter(x-> x.getSalary()==max).collect(Collectors.toList());
return dao.findmaxsalaryDao(resultlist);
	
}



}
