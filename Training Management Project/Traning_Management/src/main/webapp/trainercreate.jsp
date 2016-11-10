	<!-- CONTENTS START -->
	
		<div class="container_24" ng-controller="TrainerController as trn">
			<div class="grid_24">
			
				<div class="contents">
				
					<div class="padding_20">
						<h1>Trainer</h1>
					</div>
						<div class="grid_6 alpha">
						
								<div class="padding_20 text-justify">
										<form ng-submit="submit()" name="trnfrm">
									<table class="form-table" style="width:auto">
									

                        					<tr>
                        						<td><input type="hidden" ng-model="trn.trainer.trainer_id"></td>
                        					</tr>
                        					<tr>
												<th>
														Trainer Name
												</th>
												<td>
													<input id="trainername" type="text"  class="validate[required]" ng-model="trn.trainer.trainer_name" style="width:120%" placeholder="Enter Name" value=""  />
												</td>
																	
											</tr>
											
												<tr>
												<th>
														Trainer emailId
												</th>
												<td>
													<input id="traineremail" type="text"  class="validate[required]" ng-model="trn.trainer.trainer_email_id" style="width:120%" placeholder="Enter email id" value=""  />
												</td>
																	
											</tr>
                        					<tr>
												<th>
														Trainer Technology
												</th>
												<td>
													<input type="checkbox" ng-model="trn.trainer.trainer_technology" value="java"> Java<br>
  													<input type="checkbox" name="trn.trainer.trainer_technology" value="php">Php<br>
  													<input type="checkbox" name="trn.trainer.trainer_technology" value="angularjs">Angular Js<br>
												</td>
																	
											</tr>
										<tr>
											<th>
												Trainer Job Location
											</th>
											<td>
												<select id="select1"  class="validate[required]" ng-model="trn.trainer.trainer_location" style="width:120%"  >
													<option value="null">----Select-----</option>
                                        			<option value="pune">Pune</option>
                                        			<option value="hyderabad">Hyderabad</option>
                                        			<option value="gandhinagar">Gandinagar</option>

												</select>
											</td>
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
								<form id="frmMain"  class="frmMain" ng-submit="submitsearch()">
									<table class="form-table" style="width:auto">
									
											<tr>
												<th>
													Search By Trainer Id
												</th>
												<td><input type="text" placeholder="Enter Trainer Id" name="trn.trainer.trainer_id" style="width:120%" ng-model="trn.trainer.trainer_id" value="">
												<span style="color:red" ng-show="trnfrm.trn.trainer.trainer_id.$dirty && trnfrm.trn.trainer.trainer_id.$invalid">
  														<span ng-show="trnfrm.trn.trainer.trainer_id.$error.required">Trainer id is required.</span>
  												</span>
												</td>
											
											</tr>
											
										<tr>
											<th>
												&nbsp;
											</th>
											<td>
												<input type="submit" ng-disabled="trnfrm.trn.trainer.trainer_id.$dirty && trnfrm.trn.trainer.trainer_id.$invalid" value="Sumbit" />
												<input id="Reset1" type="reset" value="Reset" onclick="this.form.clear();" />
										</td>
										</tr>
											
											
												<table border='0' width='100%' class='table11'>
												<tr>
														<th> Id</th>
														<th>Name</th>
														<th>Email Id</th>
														<th>Technology</th>
														<th>Location</th>
														
														
												</tr>
											
													<tr ng-repeat="t in trn.employees">
														
														<td><span ng-bind="t.trainer_id"></span></td>
							                              <td><span ng-bind="t.trainer_name"></span></td>
							                              <td><span ng-bind="t.trainer_email_id"></span></td>
							                              <td><span ng-bind="t.trainer_technology"></span></td>
							                              <td>
							                              <button type="button" ng-click="trn.edit(t.trainer_id)" >Edit</button>  
							                              <button type="button" ng-click="trn.remove(t.trainer_id)">Remove</button>
							                              </td>
																					
													
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