package com.niit.collaboartion.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.dao.JobDAO;
import com.niit.collaboartion.model.Job;
import com.niit.collaboartion.model.JobApplication;

@Repository("JobDAO")
public abstract class JobDAOImpl implements JobDAO {

	private static final Logger log = LoggerFactory.getLogger(JobDAOImpl.class);
	
	@Autowired(required = true)
	private SessionFactory sessionFactory;
	
	public JobDAOImpl(SessionFactory sessionFactory){
		try{
			this.sessionFactory = sessionFactory;
		} catch(Exception e){
		log.error("Unable to connect to db");
		e.printStackTrace();}
	}
		@Transactional
		public List<Job> getAllOpenJobs() {
			String hql = "from Job where status = '"+"V'";
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			return query.list();
		}
		
        @Transactional
        public Job getJobDetails(Long id) {
        	return (Job)
        			sessionFactory.getCurrentSession().get(Job.class,id);
        }
        
        @Transactional
        public JobApplication getJobApplication(String userID,Long jobID) {
        	String hql = "from JobApplied where userID = '"+"userID' and jobID = '"+jobID;
        	return (JobApplication)
        			sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
        	}

        @Transactional
        public JobApplication getJobApplication(long jobID) {
        	return (JobApplication) sessionFactory.getCurrentSession().get(JobApplication.class, jobID);
        }
         
        @Transactional
        public boolean updateJob(Job job){
        	try{
        		sessionFactory.getCurrentSession().update(job);
        		return true;
        	}catch (Exception e){
        		e.printStackTrace();
				return false;
        	  }
        }
        
        @Transactional
        public boolean updateJobApplication(Job jobapplication){
        	try{
        		sessionFactory.getCurrentSession().update(jobapplication);
        		return true;
        	}catch (Exception e){
        		e.printStackTrace();
				return false;
        	  }
        }
        
        
        private Long getMaxId()
        {
        	log.debug("Starting of the method getMaxId ");
        	Long maxID =100L;
        	try{
        		String hql="select max(id)from Job";
        		Query query=sessionFactory.getCurrentSession().createQuery(hql);
        		return maxID=(Long)query.uniqueResult();
        	}catch(Exception e){
        		log.debug("It seems this is first record");
        		maxID =100L;
        		e.printStackTrace();
				return maxID+1;
        	}
        	
        }
        
        
       @Transactional
       public boolean save(JobApplication Jobapplication){
       log.debug("Starting of the save Jobapplication");
       try{
       Jobapplication.setId(getMaxId());
       sessionFactory.getCurrentSession().save(Jobapplication);
       }catch(Exception e){
    	   e.printStackTrace();
       return false;
       }
       return true;
       }
        
        @Transactional
        public boolean save(Job job){
       log.debug("Starting of the save job");
       try{
    	  sessionFactory.getCurrentSession().save(job);
       }catch(Exception e){
    	   e.printStackTrace();
       return false;
       }
       return true;
       }

     @Transactional
     public List<Job>getMyAppliactionJobs(String userID){
    	 String hql="from JObApplication where userID='"+"userID'";
    	 Query query = sessionFactory.getCurrentSession().createQuery(hql);
			return query.list();
     }
        
}