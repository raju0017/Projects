package com.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.dao.DataDao;
import com.student.domain.Student;

public class DataServiceImpl implements DataService {
	
	@Autowired
	DataDao dataDao;

	@Override
	public int insertRow(Student student) {
		return dataDao.insertRow(student);
	}

	@Override
	public List<Student> getList() {
		return dataDao.getList();
	}

	@Override
	public Student getRowById(int id) {
		return dataDao.getRowById(id);
	}

	@Override
	public int updateRow(Student student) {
		return dataDao.updateRow(student);
	}

	@Override
	public int deleteRow(int id) {
		return dataDao.deleteRow(id);
	}

}
