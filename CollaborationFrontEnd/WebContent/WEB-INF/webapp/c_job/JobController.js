var app = angular.module('myApp', []);


app.controller('jobController', ['JobService','$scope',
                 function(DummyJobService,$scope) {
	
	var self = this;
	
	self.job={id:"", title:""}  //json object
	
	self.jobs=[]   //json array
	
	self.allJobs = function getAllJobs()
	{
		
		self.jobs = DummyJobService.getAllDummyJobs()
		
	}

	self.allJobs()
	   
}]);
