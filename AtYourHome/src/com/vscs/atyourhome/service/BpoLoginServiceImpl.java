package com.vscs.atyourhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vscs.atyourhome.bean.EmployeeBPO;
import com.vscs.atyourhome.dao.BpoLoginDao;

@Service
public class BpoLoginServiceImpl implements BpoLoginService {
	
	@Autowired
	private BpoLoginDao bpoLoginDao;

	@Override
	public Boolean validate(String username, String password) {
		
		List<EmployeeBPO> employee = bpoLoginDao.validate(username, password);
		if(employee.size() == 1){
			return true;
		}
		else{
			return false;
		}
		
	}
}
