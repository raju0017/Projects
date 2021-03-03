package com.vscs.atyourhome.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vscs.atyourhome.model.Employee;


/**
 * @author Dinesh Rajput
 *
 */
@Repository("employeeDao1")
public class EmployeeDaoImpl implements EmployeeDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
DataSource dataSource;
	
	public DataSource getDataSource()
	{
			return this.dataSource;
	}

	public void setDataSource(DataSource dataSource)
	{
			this.dataSource = dataSource;
	}
	
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> listEmployeess() {
		return (List<Employee>) sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	public Employee getEmployee(int empid) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, empid);
	}

	@Override
	public boolean isValidAdmin(String emp_name, String address) throws SQLException {
		String query = "Select count(1) from employee where emp_name = ? and address = ?";
		PreparedStatement pstmt = dataSource.getConnection().prepareStatement(query);
		pstmt.setString(1, emp_name);
		pstmt.setString(2, address);
		ResultSet resultSet = pstmt.executeQuery();
		if (resultSet.next())
				return (resultSet.getInt(1) > 0);
		else
				return false;
	}

	/*public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Employee WHERE empid = "+employee.getEmpId()).executeUpdate();
	}*/

}
