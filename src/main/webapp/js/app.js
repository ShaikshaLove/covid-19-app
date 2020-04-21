var app=angular.module("MyApp",[]);
app.controller("StateWiseDataCtrl",function($scope,$http) {
    $scope.isLoaded=false;
    $scope.showLoader=false;
    $scope.statewiseData=[];
    $scope.getStateWiseData=function(){
        $scope.showLoader=true;
        $http.get("https://api.covid19india.org/v2/state_district_wise.json").then(
             function(response){
                $scope.statewiseData=response.data;
                $scope.statewiseData=$scope.statewiseData[12].districtData;
                 $scope.statewiseData.sort(function(a,b){return b.confirmed-a.confirmed})
                $scope.isLoaded=true;
                $scope.showLoader=false;
             },
             function(error){
                $scope.isLoaded=false;
                $scope.showLoader=flase;
                 console.log(error);
             }
        );
        
    }
  });

  app.s
