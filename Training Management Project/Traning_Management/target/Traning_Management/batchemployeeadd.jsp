	<!-- CONTENTS START -->
	
		<div class="container_24">
			<div class="grid_24">
			
				<div class="contents">
				
					<div class="padding_20">
						<h1>Add Emplyee Batch</h1>
					</div>
						<div class="grid_6 alpha">
						
								<div class="padding_20 text-justify" ng-controller="">
									<form ng-submit="myMethod()">
									<table class="form-table" style="width:auto">
										<tr>
                        						<td><input type="hidden" ng-model="batch.batchId"></td>
                        					</tr>
                        					<tr>
												<th>
														Batch Name
												</th>
												<td>
													<select id="select1"  class="validate[required]" ng-model="" style="width:120%"  >
													<option value="null">----Select-----</option>
                                        			
                                        			</select>												</td>
																	
											</tr>
											
												<tr>
												<th>
													Employee Id
												</th>
												<td>
													<select id="select1"  class="validate[required]" ng-model="" style="width:120%"  >
													<option value="null">----Select-----</option>
                                        			</select>											</td>
																	
											</tr>
										
										<tr>
											<th>
												&nbsp;
											</th>
											<td>
												<input id="Submit1" type="submit" value="Sumbit"  />
											</td>
										</tr>
										
									</table>
								</form>
							</div>
							
						</div>	
			
						<div class="grid_28 omega">
						
							<div class="padding_20 text-justify" ng-controller="">
								<form id="frmMain"  class="frmMain" action="#" method="post">
								
											
												<table border='0' style="width:70%" class='table11'>
												<tr>
														<th>Employee id</th>
														<th>Batch Name</th>
														<th>Edit</th>
														<th>Delete</th>
														
												</tr>
											
														   	
													<tr>
														
														<td></td>
														<td></td>
														<td></td>
														<td></td>
													
														</tr>
												
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