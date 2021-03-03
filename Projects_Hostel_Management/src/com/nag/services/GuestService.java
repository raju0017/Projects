package com.nag.services;

import java.util.List;

import com.nag.model.Guest;

public interface GuestService {
	
	int saveGuest(Guest guest);
	int updateGuest(Guest guest);
	void deleteGuest(Guest guest);
	Guest getById(int id);
	Guest getByName(String name);
	List<Guest> getAll();

}
