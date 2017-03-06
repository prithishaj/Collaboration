package com.niit.collaboration.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.collaboartion.model.ChatForumComment;

@Repository("chatForumCommentDAO")
public interface ChatForumCommentDAO {

	public List<ChatForumComment> list();

	public ChatForumComment get(String id, String password);

	public ChatForumComment get(String id);

	// public void saveOrUpdate(chatForumCommentDetails chatForumCommentDetails);

	public boolean save(ChatForumComment chatForumCommentDetailsDetails);

	public boolean update(ChatForumComment chatForumCommentDetailsDetails);

	public void delete(String id);

	public ChatForumComment authenticate(String id, String name);

	public void setOnline(String chatForumCommentID);

	public void setOffLine(String chatForumCommentID);

}
