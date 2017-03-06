package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboartion.model.Friend;

public interface FriendDAO {
	
	public List<Friend>getMyFriend(String userID);
	
	public Friend get(String userID,String friendID);
	public boolean save(Friend friend);
	
	
	public boolean update(Friend friend);
	
	
	public  void delete(String userID,String friendID);
	
	public List<Friend>getNewFriendRequests(String userID);
	
	public void setOnLine(String userID);
	
	public void setOffLine(String userID);

}
