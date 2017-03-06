package com.niit.collaboartion.model;

import java.util.Date;

public class OutputMessage extends Message{
	
	private Date time;
	
	public OutputMessage(Message original, Date time){
		//super(original.getMessage());
		this.time=time;
		
		Date currentdate=new Date();
		this.time=currentdate;
	}

	public Date getTime(){
		return time;
	}
	
	public void setTime(Date time){
		this.time=time;
	}
}
