'use strict';
 
mainApp.factory('TrainerService', ['$http', '$q', function($http, $q){
 
    var REST_SERVICE_URI = 'http://localhost:8080/Spring4MVCAngularJSExample/trainer/';
 
    var factory = {
    	fetchAllTrainers: fetchAllTrainers,
    	createTrainer: createTrainer,
        updateTrainer: updateTrainer,
        deleteTrainer: deleteTrainer
    };
 
    return factory;
 
    function fetchAllTrainers() {
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
 
    function createTrainer(trainer) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI, trainer)
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
 
 
    function updateTrainer(trainer, trainer_id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI+trainer_id, trainer)
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
 
    function deleteTrainer(trainer_id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI+trainer_id, trainer)
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