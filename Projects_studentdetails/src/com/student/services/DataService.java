package com.student.services;

import java.util.List;

import com.student.domain.Student;

public interface DataService 
{
	public int insertRow(Student student);

	public List<Student> getList();

	public Student getRowById(int id);

	public int updateRow(Student student);

	public int deleteRow(int id);

}
