'use strict';
 
mainApp.controller('TrainerController', ['$scope', 'TrainerService', function($scope, TrainerService) {
   
    this.trainer={trainer_id:null,trainer_name:'',trainer_location:'',trainer_email_id:'',trainer_password:'Cybage@123',created:'2016-10-11',created_by:'1',modified:'',modified_by:'2016-10-11'};
    this.trainers=[];
 
    this.submit = submit;
    this.edit = edit;
    this.remove = remove;
    this.search=search;
    this.reset = reset;
 
 
    fetchAllTrainers();
 
    function fetchAllTrainers(){
        TrainerService.fetchAllTrainers()
            .then(
            function(d) {
            	this.trainers = d;
            },
            function(errResponse){
                console.error('Error while fetching Users');
            }
        );
    }
 
    function createTrainer(trainer){
        TrainerService.createTrainer(trainer)
            .then(
            fetchAllTrainers,
            function(errResponse){
                console.error('Error while creating User');
            }
        );
    }
 
    function updateTrainer(trainer, trainer_id){
    	TrainerService.updateTrainer(trainer, trainer_id)
            .then(
            fetchAllTrainers,
            function(errResponse){
                console.error('Error while updating User');
            }
        );
    }
 
    function deleteTrainer(trainer_id){
    	TrainerService.deleteTrainer(trainer_id)
            .then(
            fetchAllTrainers,
            function(errResponse){
                console.error('Error while deleting User');
            }
        );
    }
    

    
 
    function edit(trainer_id){
        console.log('id to be edited', trainer_id);
        for(var i = 0; i < this.trainers.length; i++){
            if(this.trainers[i].trainer_id === trainer_id) {
            	this.trainer = angular.copy(this.trainers[i]);
                break;
            }
        }
    }
 
    function remove(trainer_id){
        console.log('id to be deleted', trainer_id);
        if(this.trainer.trainer_id === trainer_id) {//clean form if the user to be deleted is shown there.
            reset();
        }
        deleteTrainer(trainer_id);
    }
    function submitsearch(trainer_id){
        console.log('id to be edited', trainer_id);
        for(var i = 0; i < this.trainers.length; i++){
            if(this.trainers[i].trainer_id === trainer_id) {
            	this.trainer = angular.copy(this.trainers[i]);
                break;
            }
        }
    }
 
    function reset(){
    	this.trainer={trainer_id:null,trainer_name:'',trainer_location:'',trainer_email_id:'',trainer_password:'Cybage@123',created:'2016-10-11',created_by:'1',modified:'',modified_by:'2016-10-11'};
    	   
        $scope.trnfrm.$setPristine(); //reset Form
    }
 
}]);