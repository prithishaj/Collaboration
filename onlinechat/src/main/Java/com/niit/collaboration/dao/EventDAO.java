package com.niit.collaboration.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.collaboartion.model.Event;

@Repository("eventDAO")
public interface EventDAO {

	public List<Event> list();

	public Event get(String id, String password);

	public Event get(String id);

	// public void saveOrUpdate(UserDetails UserDetails);

	public boolean save(Event eventDetailsDetails);

	public boolean update(Event eventDetailsDetails);

	public void delete(String id);

	public Event authenticate(String id, String name);

	public void setOnline(String eventID);

	public void setOffLine(String eventID);

}
