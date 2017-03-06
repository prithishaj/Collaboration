package com.niit.collaboartion.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Entity
@Table(name = "JOB_APPLIED")
@Component
public class JobApplication extends BaseDomain{

	@Id
	private long id;
 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public String getJob_Id() {
		return job_Id;
	}

	public void setJob_Id(String job_Id) {
		this.job_Id = job_Id;
	}

	public Date getDate_applied() {
		return date_applied;
	}

	public void setDate_applied(Date date_applied) {
		this.date_applied = date_applied;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	private String user_Id;
	
	private String job_Id;

	private Date date_applied;
	
	private char status;
	
	private String remarks;
	

	
}
