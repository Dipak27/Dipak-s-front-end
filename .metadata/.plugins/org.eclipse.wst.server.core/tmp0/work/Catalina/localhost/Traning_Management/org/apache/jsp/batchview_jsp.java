/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-11-09 17:01:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class batchview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\t<!-- CONTENTS START -->\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\tmainApp.controller('myCtrl', function($scope, $http) {\r\n");
      out.write("\t\t$scope.msg=\"hello\";\r\n");
      out.write("\t\t$scope.employee={empId:null,empEmailId:\"\",empName:\"\",empLocation:\"\"};\r\n");
      out.write("\t\t$scope.fetchData=function()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t $http.get(\"http://localhost:8808/TrainingManagementSystem/employee/list\")\r\n");
      out.write("\t\t\t  .then(function(response) {\r\n");
      out.write("\t\t\t\t  alert(\"response called...\");\r\n");
      out.write("\t\t\t      $scope.myWelcome = response.data;\r\n");
      out.write("\t\t\t  });\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t $scope.myMethod=function(){\r\n");
      out.write("\t\t\talert(\"method called...\");\r\n");
      out.write("\t\t\t $http.post(\"http://localhost:8808/TrainingManagementSystem/employee/create/\",$scope.employee)\r\n");
      out.write("\t\t\t  .then(function(response) {\r\n");
      out.write("\t\t\t\t  alert(\"response called...\");\r\n");
      out.write("\t\t\t\t  $scope.fetchData();\r\n");
      out.write("\t\t\t      $scope.myWelcome = response.data;\r\n");
      out.write("\t\t\t  });\r\n");
      out.write("\t\t}  \r\n");
      out.write("\t\t\r\n");
      out.write("\t \r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\t<div class=\"container_24\">\r\n");
      out.write("\t\t\t<div class=\"grid_24\">\r\n");
      out.write("\t\t\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t\t\t<div class=\"padding_20\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid_6 alpha\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"padding_20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"accordion nav-sidebar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Batch</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#batchcreate\">Create Batch</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#batchview\">View Batch</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#batchsearch\">Search Batch</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid_18 omega\">\r\n");
      out.write("\t\t\t\t\t\t &nbsp;&nbsp;<h2>Batch</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"padding_20 text-justify\" ng-controller=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form id=\"frmMain\" action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"form-table\" style=\"width:auto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table border='0' width='100%' class='table11'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Batch Id</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Batch Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Batch Location</th>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Batch Technology</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clear\"> </div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- CONTENTS END -->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
