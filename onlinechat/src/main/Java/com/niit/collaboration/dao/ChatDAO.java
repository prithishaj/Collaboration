package com.niit.collaboration.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.collaboartion.model.Chat;

@Repository("chatDAO")
public interface ChatDAO {

	public List<Chat> list();

	public Chat get(String id, String password);

	public Chat get(String id);

	// public void saveOrUpdate(UserDetails UserDetails);

	public boolean save(Chat chatDetailsDetails);

	public boolean update(Chat chatDetailsDetails);

	public void delete(String id);

	public Chat authenticate(String id, String name);

	public void setOnline(String chatID);

	public void setOffLine(String chatID);

}
