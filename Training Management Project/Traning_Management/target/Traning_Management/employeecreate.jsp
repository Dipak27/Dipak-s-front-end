	<!-- CONTENTS START -->
	
		<div class="container_24" ng-controller="EmployeeController as emp">
			<div class="grid_24">
			
				<div class="contents">
				
					<div class="padding_20">
						<h1>Employee</h1>
					</div>
						<div class="grid_6 alpha">
						
								<div class="padding_20 text-justify">
									<form ng-submit="submit()" name="empfrm">
									<table class="form-table" style="width:auto">
									

                        					<tr>
                        						<td><input type="hidden" ng-model="emp.employee.emp_id"></td>
                        					</tr>
                        					<tr>
												<th>
														Employee Name
												</th>
												<td>
													<input id="employeename" type="text" required name="emp.employee.emp_name" ng-model="emp.employee.emp_name" style="width:120%" placeholder="Enter Employee Name" value="">
														<span style="color:red" ng-show="empfrm.emp.employee.emp_name.$dirty && empfrm.emp.employee.emp_name.$invalid">
  														<span ng-show="empfrm.emp.employee.emp_name.$error.required">Name is required.</span>
  												</span>
												</td>
																	
											</tr>
											
												<tr>
												<th>
														Employee emailId
												</th>
												<td>
													<input id="employeeemail" type="text" name="emp.employee.emp_email_id" required ng-model="emp.employee.emp_email_id" style="width:120%" placeholder="Enter new email id" value=""  />
													<span style="color:red" ng-show="empfrm.emp.employee.emp_email_id.$dirty && empfrm.emp.employee.emp_email_id.$invalid">
													<span ng-show="empfrm.emp.employee.emp_email_id.$error.required">Email is required.</span>
													<span ng-show="empfrm.emp.employee.emp_email_id.$error.email">Invalid email address.</span>
													</span>
												</td>
																	
											</tr>
                        					
										<tr>
											<th>
												Employee Job Location
											</th>
											<td>
												<select id="select1"  class="validate[required]" ng-model="emp.employee.emp_location" style="width:120%"  >
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
												<input type="submit" ng-disabled="empfrm.emp.employee.emp_name.$dirty && empfrm.emp.employee.emp_name.$invalid || empfrm.emp.employee.emp_email_id.$dirty && empfrm.emp.employee.emp_email_id.$invalid value="Sumbit" />
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
													Employee Id
												</th>
												<td><input type="text" name="emp.employee.emp_id" placeholder="Enter Employee Id" ng-model="emp.employee.emp_id" style="width:120%" value="">
													<span style="color:red" ng-show="empfrm.emp.employee.emp_id.$dirty && empfrm.emp.employee.emp_id.$invalid">
  														<span ng-show="empfrm.emp.employee.emp_id.$error.required">Employee id is required.</span>
  												</span>
												</td>
											
											</tr>
											
										<tr>
											<th>
												&nbsp;
											</th>
											<td>
												<input id= "Submit1" type="submit" value="Submit"/>
												<input id="Reset1" type="reset" value="Reset" onclick="this.form.clear();" />
										</td>
										</tr>
											
											
												<table border='0' width='100%' class='table11'>
												<tr>
														<th>Id</th>
														<th>Name</th>
														<th>Email Id</th>
														<th>Location</th>
														
														
												</tr>
											
														   	
													<tr ng-repeat="e in emp.employees">
														
														<td><span ng-bind="e.emp_id"></span></td>
							                              <td><span ng-bind="e.emp_name"></span></td>
							                              <td><span ng-bind="e.emp_email_id"></span></td>
							                              <td><span ng-bind="e.emp_location"></span></td>
							                              <td>
							                              <button type="button" ng-click="emp.edit(e.emp_id)" >Edit</button>  
							                              <button type="button" ng-click="emp.remove(e.emp_id)">Remove</button>
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