'use strict';
 
mainApp.factory('EmployeeService', ['$http', '$q', function($http, $q){
 
    var REST_SERVICE_URI = 'http://localhost:8080/Spring4MVCAngularJSExample/user/';
 
    var factory = {
        fetchAllEmployees: fetchAllEmployees,
        createEmployee: createEmployee,
        updateEmployee: updateEmployee,
        deleteEmployee: deleteEmployee
    };
 
    return factory;
 
    function fetchAllEmployees() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Users');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
 
    function createEmployee(employee) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI, employee)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while creating User');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
 
 
    function updateEmployee(employee, emp_id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI+emp_id, employee)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while updating User');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
 
    function deleteEmployee(emp_id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI+emp_id, employee)
        .then(
        function (response) {
            deferred.resolve(response.data);
        },
        function(errResponse){
            console.error('Error while deletion Employee');
            deferred.reject(errResponse);
        }
    );
        return deferred.promise;
    }
   
 
}]);