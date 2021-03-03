package com.vscs.atyourhome.dao;

import java.util.List;

public interface DropDownDao {
	
	@SuppressWarnings("rawtypes")
	public List list();
	@SuppressWarnings("rawtypes")
	public List list(int id);

}
