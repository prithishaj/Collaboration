app.service('FriendController', function($scope,FriendService){
	
	console.log("FriendController")
	$scope.messages=[];
	$scope.message="";
	$scope.max=140;
	
	$scope.addMessage=function(){
		console.log("addMessage")
		FriendService.send(message,$scope,friendID);
		$scope.message="";	
	};
	
	FriendService.receive().then(null,null,function(message){
		console.log("receive")
		$scope.messages.push(message);
	});
});