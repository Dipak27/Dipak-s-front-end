
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>

	<head>
		<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
	
		<title>Training Management System</title>
		<link rel="stylesheet" type="text/css" href="css/960_24_col.css" />
		<link rel="stylesheet" type="text/css" href="css/fonts.css" charset="utf-8" />
		<link href="css/validationEngine.jquery.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/forms.css" />
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript">
		var relTag = "home";
		</script>
		<script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
      	<script type="text/javascript" src="angularjs/angular.min.js"></script>
      <script type="text/javascript" src="angularjs/module/mainApp.js"></script> 

		<script type="text/javascript" src="angularjs/controller/controllerjs.js"></script>
		<script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular-route.min.js"></script>
	</head>
<body ng-app="mainApp">
	
	<!-- HEADER START -->
			
	<div class="header">
		<div ng-include="'headerstrip.jsp'"></div>
		
		<div ng-include="'logotitle.jsp'"></div>
		<div ng-include="'adminmenustrip.jsp'"></div>
		
	</div>
	<!-- HEADER END -->
	
	<!-- CONTENTS START -->
	<div ng-view>
	
	</div>
	<!-- CONTENTS END -->

	<!-- FOOTER START -->
	<div ng-include="'footer.jsp'"></div>
	<!-- FOOTER START -->
	 
</body>
	
</html>
