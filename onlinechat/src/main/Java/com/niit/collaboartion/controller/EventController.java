package com.niit.collaboartion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.niit.collaboartion.model.Message;

@Controller
public class EventController {
	
	private static final Logger logger=LoggerFactory.getLogger(EventController.class);
	
	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;
	
	@MessageMapping("/event")
	@SendTo("/queue/message/(friendID)")
	public void sendMessage(Message message){
		logger.debug("Calling the method sendMessage");
		logger.debug("Message:",message.getMessage());
		logger.debug("Message ID:",message.getFriendID());
		simpMessagingTemplate.convertAndSend("/queue/message/"+message.getFriendID());
	}

}
