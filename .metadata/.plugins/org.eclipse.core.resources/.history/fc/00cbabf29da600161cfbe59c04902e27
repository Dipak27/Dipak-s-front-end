	<!-- CONTENTS START -->
	
	<script>
	mainApp.controller('myCtrl', function($scope, $http) {
		$scope.msg="hello";
		$scope.employee={empId:null,empEmailId:"",empName:"",empLocation:""};
		$scope.fetchData=function()
		{
			 $http.get("http://localhost:8808/TrainingManagementSystem/employee/list")
			  .then(function(response) {
				  alert("response called...");
			      $scope.myWelcome = response.data;
			  });	
		}
		 $scope.myMethod=function(){
			alert("method called...");
			 $http.post("http://localhost:8808/TrainingManagementSystem/employee/create/",$scope.employee)
			  .then(function(response) {
				  alert("response called...");
				  $scope.fetchData();
			      $scope.myWelcome = response.data;
			  });
		}  
		
	 
	});
	
	</script>
		<div class="container_24">
			<div class="grid_24">
				<div class="contents">
					<div class="padding_20">
						
					</div>
						<div class="grid_6 alpha">
							<div class="padding_20">
								<div class="accordion nav-sidebar">
									<h3>Batch</h3>
										<div>
											<ul>
														<li><a href="#batchcreate">Create Batch</a></li>
													<li><a href="#batchview">View Batch</a></li>
													<li><a href="#batchsearch">Search Batch</a></li>
								
								
											</ul>
										</div>
										
								</div>
							</div>
						</div>	
			
						<div class="grid_18 omega">
						 &nbsp;&nbsp;<h2>Batch</h2>
							<div class="padding_20 text-justify" ng-controller="">
								<form id="frmMain" action="#" method="post">
									<table class="form-table" style="width:auto">
									
									<table border='0' width='100%' class='table11'>
												<tr>
														<th>Batch Id</th>
														<th>Batch Name</th>
														<th>Batch Location</th>	
														<th>Batch Technology</th>
												</tr>
												
									</table>
												

									</table>
								</form>
							</div>
						</div>
					
					<div class="clear"></div>
				</div>
			</div>
		</div>
		<div class="clear"> </div>

		<!-- CONTENTS END -->