package com.student.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.student.domain.Student;

public class DataDaoImpl implements DataDao
{

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public int insertRow(Student student) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(student);
		tx.commit();
		Serializable id = session.getIdentifier(student);
		session.close();
		return (Integer) id;
	}

	@Override
	public List<Student> getList() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Student> studentList = session.createQuery("from Student")
				.list();
		session.close();
		return studentList;
	}

	@Override
	public Student getRowById(int id) {
		Session session = sessionFactory.openSession();
		Student student = (Student) session.load(Student.class, id);
		return student;
	}

	@Override
	public int updateRow(Student student) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(student);
		tx.commit();
		Serializable id1 = session.getIdentifier(student);
		session.close();
		return (Integer) id1;
	}

	@Override
	public int deleteRow(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student student = (Student) session.load(Student.class, id);
		session.delete(student);
		tx.commit();
		Serializable ids = session.getIdentifier(student);
		session.close();
		return (Integer) ids;
	}

}
