package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.bean.EmployeeBean1;
import com.vscs.atyourhome.dao.EmployeeDao1;

@Service("employeeService1")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true) 
public class EmployeeServiceImpl1 implements EmployeeService1 {

	
	@Autowired
	EmployeeDao1 employeeDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addEmployee(EmployeeBean1 employeeBean) {
		employeeDao.addEmployee(employeeBean);
		
	}

	@Override
	public List<EmployeeBean1> getEmployies() {
		
		return employeeDao.getEmployies();
	}

	@Override
	public EmployeeBean1 getEmployee(int emp_id) {
		
		return employeeDao.getEmployee(emp_id);
	}

	@Override
	public boolean verifyemail(String email) {
		System.out.println("hi");
		 List<EmployeeBean1>  emp =employeeDao.verifyemail(email);
		 if(emp.size()>0) return true;
		  else return false;
	}

	@Override
	public boolean verifymobile(int mobile) {
		 List<EmployeeBean1>  emp =employeeDao.verifymobile(mobile);
		 if(emp.size()>0) return true;
		  else return false;
	}

	/*@Override
	public void deleteEmployee(int emp_id) {
		employeeDao.deleteEmployee(emp_id);
		
	}*/
	
	
}
