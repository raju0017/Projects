package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vscs.atyourhome.dao.ServiceRequestDao;
import com.vscs.atyourhome.model.ServiceRequest;

/**
 * @author Dinesh Rajput
 *
 */
@Service("srService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ServiceRequestServiceImpl implements ServiceRequestService {

	@Autowired
	private ServiceRequestDao srDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addSr(ServiceRequest sr) {
		srDao.addSr(sr);
	}
	
	public List<ServiceRequest> listSr() {
		return srDao.listSr();
	}

	public ServiceRequest getSr(int empid) {
		return srDao.getSr(empid);
	}
	
	/*public void deleteEmployee(Employee employee) {
		employeeDao.deleteEmployee(employee);
	}
*/
}
