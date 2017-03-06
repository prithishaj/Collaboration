app.service('ChatForumController', function($scope,ChatForumService){
	
	console.log("ChatForumController")
	$scope.messages=[];
	$scope.message="";
	$scope.max=140;
	
	$scope.addMessage=function(){
		console.log("addMessage")
		ChatForumService.send(message,$scope,friendID);
		$scope.message="";	
	};
	
	ChatForumService.receive().then(null,null,function(message){
		console.log("receive")
		$scope.messages.push(message);
	});
});