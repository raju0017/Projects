package com.nag.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nag.dao.GuestDao;
import com.nag.model.Guest;

@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	GuestDao dao;

	@Transactional
	public int saveGuest(Guest guest) {

		int i = dao.saveGuest(guest);
		return i;
	}

	@Transactional
	public int updateGuest(Guest guest) {

		int i = dao.updateGuest(guest);
		return i;
	}

	@Transactional
	public void deleteGuest(Guest guest) {
		

		dao.deleteGuest(guest);
	}

	@Transactional
	public Guest getById(int id) {

		Guest guest = dao.getById(id);
		return guest;
	}

	@Transactional
	public Guest getByName(String name) {
		

		return dao.getByName(name);
	}

	@Transactional
	public List<Guest> getAll() {
		return dao.getAll();
	}
	
	
	
}
