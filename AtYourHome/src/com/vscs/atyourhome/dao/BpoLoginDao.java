package com.vscs.atyourhome.dao;

import java.util.List;

import com.vscs.atyourhome.bean.EmployeeBPO;

public interface BpoLoginDao {
	
	public  List<EmployeeBPO> validate(String username , String password);

}
