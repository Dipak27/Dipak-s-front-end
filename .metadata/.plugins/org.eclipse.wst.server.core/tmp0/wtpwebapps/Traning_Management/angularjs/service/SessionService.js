'use strict';
 
mainApp.factory('SessionService', ['$http', '$q', function($http, $q){
 
    var REST_SERVICE_URI = 'http://localhost:8080/Spring4MVCAngularJSExample/session/';
 
    var factory = {
        fetchAllSessions: fetchAllSessions,
        createSession: createSession,
        updateSession: updateSession,
        deleteSession: deleteSession
    };
 
    return factory;
 
    function fetchAllSessions() {
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
 
    function createSession(session) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI, session)
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
 
 
    function updateSession(session, session_id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI+session_id, session)
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
 
    function deleteSession(session_id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI+session_id, session)
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