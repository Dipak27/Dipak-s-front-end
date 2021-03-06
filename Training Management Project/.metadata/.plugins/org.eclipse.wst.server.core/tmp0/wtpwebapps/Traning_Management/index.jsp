
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"  ng-app="mainApp">
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
		
	</head>
<body ng-controller="AppController as ctrl">
	
	<!-- HEADER START -->
		<div ng-include="'header.jsp'"></div>
	<!-- HEADER END -->
	
	
	<!-- CONTENTS START -->
	
	<div ng-include="'maincontent.jsp'"></div>
	
	<!-- CONTENTS END -->
	

	
	<!-- FOOTER START -->
	<div ng-include="'footer.jsp'"></div>
	<!-- FOOTER START -->
	 
</body>
	
</html>
