var mainApp = angular.module("mainApp", ['ngRoute']);
mainApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
    when('/home', {
      templateUrl: 'maincontent.jsp',
      controller: 'HomeController'
    }).
    when('/login', {
      templateUrl: 'login.jsp',
      controller: 'LoginController'
    }).
    when('/trainingprogram', {
        templateUrl: 'trainingprogram.jsp',
        controller: 'TrainingProgramController'
      }).
   
          when('/employeecreate', {
              templateUrl: 'employeecreate.jsp',
              controller: 'EmployeeController'
            }).

      when('/trainercreate', {
               templateUrl: 'trainercreate.jsp',
               controller: 'TrainerController'
       }).
      
       when('/batchcreate', {
           templateUrl: 'batchcreate.jsp',
           controller: 'BatchController'
       }).
      
       when('/batchemployeeadd', {
           templateUrl: 'batchemployeeadd.jsp',
           controller: 'BatchEmployeeAddController'
       }).
       
       when('/sessioncreate', {
           templateUrl: 'sessioncreate.jsp',
           controller: 'SessionController'
       }).
            
            
                
    otherwise({
      redirectTo: '/employeecreate'
    });
  }
]);