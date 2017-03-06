package com.niit.collaboration.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.collaboartion.model.ChatForum;

@Repository("chatForumDAO")
public interface ChatForumDAO {

	public List<ChatForum> list();

	public ChatForum get(String id, String password);

	public ChatForum get(String id);

	// public void saveOrUpdate(UserDetails UserDetails);

	public boolean save(ChatForum userDetailsDetails);

	public boolean update(ChatForum userDetailsDetails);

	public void delete(String id);

	public ChatForum authenticate(String id, String name);

	public void setOnline(String chatForumID);

	public void setOffLine(String chatForumID);

}
