myApp.controller('FileUploadController', ['$scope', 'FileUploadService', function($scope, FileUploadService){
	 console.log("FileUploadController")
     $scope.uploadFile = function(){
		 console.log('uploadFile')
        var file = $scope.myFile;
        
        console.log('file is ' );
        console.dir(file);
        
        var uploadUrl = "http://localhost:8089/FileUpload/Ex1";
        console.log("upload url is : "+uploadUrl)
        FileUploadService.uploadFileToUrl(file, uploadUrl);
     };
  }]);
