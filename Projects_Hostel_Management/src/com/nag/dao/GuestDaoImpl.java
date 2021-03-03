package com.nag.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nag.dao.GuestDao;
import com.nag.model.Guest;

@Repository
public class GuestDaoImpl implements GuestDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public int saveGuest(Guest guest) {

		Session session = sessionFactory.getCurrentSession();
		int i = (int) session.save(guest);
		session.close();
		return i;
	}

	@Override
	@Transactional
	public  void deleteGuest(Guest guest) {

		Session session = sessionFactory.getCurrentSession();
		session.delete(guest);
		session.close();
		
	}

	@Override
	@Transactional
	public int updateGuest(Guest guest) {
		Session session = sessionFactory.getCurrentSession();
		session.update(guest);// TODO Auto-generated method stub
		Serializable id1 = session.getIdentifier(guest);
		session.close();
		return (Integer) id1;
	}

	@Override
	@Transactional
	public Guest getById(int id) {

		Session session = sessionFactory.getCurrentSession();
		Guest guest = (Guest) session.load(Guest.class, id);// TODO Auto-generated method stub
		session.close();
		return guest;
	}

	@Override
	@Transactional
	public List<Guest> getAll() {
		
		
		return sessionFactory.getCurrentSession().createQuery("from guest").list();
	}

	@Override
	@Transactional
	public Guest getByName(String name) {
		
		Guest guest = (Guest) sessionFactory.getCurrentSession().get(Guest.class, name);
		
		
		// TODO Auto-generated method stub
		return guest;
	}

	@Override
	public int saveGuest(Guest guest) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateGuest(Guest guest) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteGuest(Guest guest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Guest getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guest getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
