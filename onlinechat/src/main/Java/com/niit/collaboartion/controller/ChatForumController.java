package com.niit.collaboartion.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.niit.collaboartion.model.Message;
import com.niit.collaboartion.model.OutputMessage;

@Controller
public class ChatForumController {
	private static Logger logger=LoggerFactory.getLogger(ChatForumController.class);
	
	@MessageMapping("/chat_forum")//send msg
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message){
		logger.debug("Calling the method sendMessage");
		logger.debug("Message:",message.getMessage());
		
		return new OutputMessage(message,new Date());
	}

}
