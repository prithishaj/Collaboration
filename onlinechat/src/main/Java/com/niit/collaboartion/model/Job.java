package com.niit.collaboartion.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import oracle.sql.CLOB;

@Entity
@Table(name = "JOB")
@Component
public class Job extends BaseDomain{
	
	@Id
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJob_Id() {
		return job_Id;
	}

	public void setJob_Id(String job_Id) {
		this.job_Id = job_Id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public CLOB getDescription() {
		return description;
	}

	public void setDescription(CLOB description) {
		this.description = description;
	}

	public Date getLast_date() {
		return last_date;
	}

	public void setLast_date(Date last_date) {
		this.last_date = last_date;
	}

	private String job_Id;

	private String title;

	private String qualification;
	
	private char status;
	
	private CLOB description;
	
	private Date last_date;

}
