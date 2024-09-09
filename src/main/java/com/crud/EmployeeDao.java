package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
public String postThis(Employee e)
{
	er.save(e);
	return "Posted SuccessFully";
}

public List<Employee> findAllemployeeDao()
{
	return er.findAll();
}
public List<Employee> CurrentDatabase()
{
 return er.findAll();
}

public String add5moreEmployee(List<Employee> e5)
{
	er.saveAll(e5);
	return "5 More Employees Added";
}
public String findNameDao(List<Employee> e) {
	return e.get(0).getName();
}

public List<Employee> findall2()
{
	return er.findAll();
}

public Employee findbyIdDao(int y)
{
	return er.findById(y).get();
}
public String deleteoneObjectDao( int y)
{
 er.deleteById(y);
return "Object no" + y +" Deleted Successfully";

}

public List<Employee> findmaxsalaryDao(List<Employee> list)
{
	return er.findAll();
}


}
