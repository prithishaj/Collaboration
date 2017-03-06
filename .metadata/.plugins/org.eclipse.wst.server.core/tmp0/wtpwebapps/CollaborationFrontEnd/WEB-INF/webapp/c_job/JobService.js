app.service('JobService', function() {
	var self=this
	
	self.job={id:"", title:""}
	
	self.jobs=[]
	
	self.getAllJobs = getAllJobs

	function getAllJobs()
	{
		console.log("Second")
	     self.jobs=
	    [ 
	      {id:"JD001", title:"Technical Lead"},
	      {id:"JD002", title:"Technical Architect"},
	      {id:"JD003", title:"Technical Manager"},
	      ]
		console.log("Third")
		return self.jobs
	}
		   
});
