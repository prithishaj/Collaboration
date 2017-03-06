package com.niit.collaboration.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.collaboartion.model.Blog;

@Repository("blogDAO")
public interface BlogDAO {

	public List<Blog> list();

	public Blog get(String id, String password);

	public Blog get(String id);

	// public void saveOrUpdate(UserDetails UserDetails);

	public boolean save(Blog blogDetailsDetails);

	public boolean update(Blog blogDetailsDetails);

	public void delete(String id);

	public Blog authenticate(String id, String name);

	public void setOnline(String blogID);

	public void setOffLine(String blogID);

}
