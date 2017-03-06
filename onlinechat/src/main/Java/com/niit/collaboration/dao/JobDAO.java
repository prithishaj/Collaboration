package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboartion.model.Job;
import com.niit.collaboartion.model.JobApplication;

public interface JobDAO {

public List<Job> getAllOpenJobs();

public Job getJobDetails(Long id);

public boolean updateJob(Job job);

public boolean updateJob(JobApplication jobApplication);

public boolean save(JobApplication jobApplication);

public boolean save(Job job);

public List<Job> getMyAppliedJobs(String userID);

public JobApplication getJobApplication(String userID,Long jobID);

public JobApplication getJobApplication(Long id);

}
