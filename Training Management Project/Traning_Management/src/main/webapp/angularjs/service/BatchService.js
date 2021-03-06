'use strict';
 
mainApp.factory('BatchService', ['$http', '$q', function($http, $q){
 
    var REST_SERVICE_URI = 'http://localhost:8080/Spring4MVCAngularJSExample/user/';
 
    var factory = {
        fetchAllBatches: fetchAllBatches,
        createBatch: createBatch,
        updateBatch: updateBatch,
        deleteBatch: deleteBatch
    };
 
    return factory;
 
    function fetchAllBatches() {
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
 
    function createBatch(batch) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI, batch)
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
 
 
    function updateBatch(batch, batch_id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI+batch_id, batch)
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
 
    function deleteBatch(batch_id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI+batch_id, batch)
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