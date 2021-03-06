'use strict';
 
mainApp.controller('BatchController', ['$scope', 'BatchService', function($scope, BatchService) {
   
    this.batch={batch_id:null,batch_name:'',batch_start_date:'',batch_end_date:'',batch_type:'',batch_location:'',created:'2016-10-11',created_by:'1',modified:'',modified_by:'2016-10-11'};
    this.batches=[];
 
    this.submit = submit;
    this.edit = edit;
    this.remove = remove;
    this.search=search;
    this.reset = reset;
 
 
    fetchAllBatches();
 
    function fetchAllBatches(){
        BatchService.fetchAllBatches()
            .then(
            function(d) {
            	this.batches = d;
            },
            function(errResponse){
                console.error('Error while fetching Users');
            }
        );
    }
 
    function createBatch(batch){
    	BatchService.createBatch(batch)
            .then(
            		fetchAllBatches,
            function(errResponse){
                console.error('Error while creating User');
            }
        );
    }
 
    function updateBatch(batch, batch_id){
    	BatchService.updateBatch(batch, batch_id)
            .then(
            		fetchAllBatches,
            function(errResponse){
                console.error('Error while updating User');
            }
        );
    }
 
    function deleteBatch(batch_id){
    	BatchService.deleteBatch(batch_id)
            .then(
            		fetchAllBatches,
            function(errResponse){
                console.error('Error while deleting User');
            }
        );
    }
    

    
 
    function edit(batch_id){
        console.log('id to be edited', batch_id);
        for(var i = 0; i < this.batches.length; i++){
            if(this.batches[i].batch_id === batch_id) {
            	this.batch = angular.copy(this.batches[i]);
                break;
            }
        }
    }
 
    function remove(batch_id){
        console.log('id to be deleted', batch_id);
        if(this.batch.batch_id === batch_id) {//clean form if the user to be deleted is shown there.
            reset();
        }
        deleteBatch(batch_id);
    }
    function submitsearch(batch_id){
        console.log('id to be edited', batch_id);
        for(var i = 0; i < this.batches.length; i++){
            if(this.batches[i].batch_id === batch_id) {
            	this.batch = angular.copy(this.batches[i]);
                break;
            }
        }
    }
 
    function reset(){
    	this.batch={batch_id:null,batch_name:'',batch_start_date:'',batch_end_date:'',batch_type:'',batch_location:'',created:'2016-10-11',created_by:'1',modified:'',modified_by:'2016-10-11'};
        
        $scope.btcfrm.$setPristine(); //reset Form
    }
 
}]);