	<!-- CONTENTS START -->
	
		<div class="container_24" ng-controller="SessionController as ses">
			<div class="grid_24">
			
				<div class="contents">
				
					<div class="padding_20">
						<h1>Session</h1>
					</div>
						<div class="grid_6 alpha">
						
								<div class="padding_20 text-justify" ng-controller="">
									<form ng-submit="submit()" name="sesfrm">
									<table class="form-table" style="width:auto">
										<tr>
                        						<td><input type="hidden" ng-model="session.session_id"></td>
                        					</tr>
                        					<tr>
												<th>
														Batch Id
												</th>
												<td>
													<select id="select1"  class="validate[required]" ng-model="ses.session.batch_id" style="width:120%"  >
													<option value="null">----Select-----</option>
                                        			
                                        			</select>												</td>
																	
											</tr>
											
												<tr>
												<th>
														Technology
												</th>
												<td>
													<select id="select1"  class="validate[required]" ng-model="ses.session.tech_id" style="width:120%"  >
													<option value="null">----Select-----</option>
                                        			</select>											</td>
																	
											</tr>
												<tr>
												<th>
														Trainer
												</th>
												<td>
													<select id="select1"  class="validate[required]" ng-model="ses.session.trainer_id" style="width:120%"  >
													<option value="null">----Select-----</option>
                                        			
													</select>	
												</td>
																	
											</tr>
											
												<tr>
												<th>
														Date
												</th>
												<td>
													<input id="sessiondate" type="date"  class="validate[required]" ng-model="ses.session.session_date style="width:120%" placeholder="Enter new email id" value=""  />
												</td>
																	
											</tr>
												<tr>
												<th>
														Start Time
												</th>
												<td>
														<input id="sessionstarttime" type="text"  class="validate[required]" ng-model="ses.session.session_start_time" style="width:120%" placeholder="Enter start time" value=""  />
														
												</td>
																	
											</tr>
													
												<tr>
												<th>
														End Time
												</th>
												<td>
														<input id="sessionendtime" type="text"  class="validate[required]" ng-model="ses.session.session_end_time" style="width:120%" placeholder="Enter end time" value=""  />
														
												</td>
																	
											</tr>
                        				
										<tr>
											<th>
												&nbsp;
											</th>
											<td>
												<input id="Submit1" type="submit" value="Sumbit"  />
												<input id="Reset1" type="reset" value="Reset" onclick="this.form.clear();" />
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
													Search By Session Id
												</th>
												<td><input type="text" class="validate[required]" ng-model="session.session_id" style="width:120%" value=""></td>
											
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
														<th>Session id</th>
														<th>Session Name</th>
														<th>Date</th>
														<th>Start Time</th>
														<th>End Time</th>
														<th>Trainer</th>
														<th>Edit</th>
														<th>Delete</th>
														
												</tr>
											
														   	
													<tr>
														<tr ng-repeat="s in ses.sessions">
														
														<td><span ng-bind="s.session_id"></span></td>
							                              <td><span ng-bind="s.session_name"></span></td>
							                              <td><span ng-bind="s.session_date"></span></td>
							                              <td><span ng-bind="s.session_start_time"></span></td>
							                               <td><span ng-bind="s.session_end_time"></span></td>
							                              <td><span ng-bind="s.trainer_id"></span></td>
							                             
							                              <td>
							                              <button type="button" ng-click="ses.edit(s.session_id)" >Edit</button>  
							                              <button type="button" ng-click="ses.remove(s.session_id)">Remove</button>
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