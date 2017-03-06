app.service('ChatController', function($scope,ChatService){
	
	console.log("ChatController")
	$scope.messages=[];
	$scope.message="";
	$scope.max=140;
	
	$scope.addMessage=function(){
		console.log("addMessage")
		ChatService.send(message,$scope,friendID);
		$scope.message="";	
	};
	
	ChatService.receive().then(null,null,function(message){
		console.log("receive")
		$scope.messages.push(message);
	});
});