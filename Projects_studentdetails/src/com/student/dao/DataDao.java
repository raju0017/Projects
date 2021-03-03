package com.student.dao;

import java.util.List;

import com.student.domain.Student;

public interface DataDao
{
	public int insertRow(Student student);

	public List<Student> getList();

	public Student getRowById(int id);

	public int deleteRow(int id);

	int updateRow(Student student);

}
