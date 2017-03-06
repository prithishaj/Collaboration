app.service('ChatService', function($q,$timeout){
	
	console.log("ChatService...")
	var service = {},listener = $q.defer(),socket = {
		client:null,
		stomp:null
	},messageIds = [];
	
	service.RECONNECT_TIMEOUT = 30000;
	service.SOCKET_URL = "/onlinechat/chat";
	service.CHAT_TOPIC = "/queue/message";
	service.CHAT_BROKER = "/app/chat";
	
    service.receive=function(){
    	console.log("receive")
    	return listener.promise;
    };

    
    service.send=function(message,friendID){
    	console.log("send")
     var id=Math.floor(Math.random()*1000000);
    	socket.stomp.send(service.CHAT_BROKER,{
    		priority:9
    	},JSON.stringify({
    	message:message,
    	friendID:friendID,
    	id:id
    	}));
    	messageIds.push(id);
    };
    
   var reconnect=function(){
	   console.log("reconnect")
	   $timeout(function(){
		   initialize();
	   },this.RECONNECT_TIME_OUT);
   }; 
});