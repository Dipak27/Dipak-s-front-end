/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-11-09 12:09:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- CONTENTS START -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container_24\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"grid_24\">\r\n");
      out.write("\t\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"grid_24 omega\">\r\n");
      out.write("\t\t\t\t\t<div class=\"padding_20 text-justify\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"grid_18 omega\">\r\n");
      out.write("\t\t\t\t\t\t &nbsp;&nbsp;<h2>Admin Login</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"padding_20 text-justify\" ng-controller=\"AdminLoginController as ctrl\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form id=\"frmMain\" class=\"frmMain\" ng-submit=\"ctrl.submit()\" name=\"adminForm\" novalidate>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"form-table\" style=\"width:auto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tEmail Id\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"email\" type=\"text\"  class=\"validate[required]\" name=\"email\" style=\"width:120%\" placeholder=\"demo@cybage.com\" value=\"\" ng-model=\"ctrl.admin.email\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span ng-show=\"adminForm.$dirty && adminForm.email.$error.required\">This is a required field</span>\r\n");
      out.write("              \t\t\t\t\t\t\t\t<span ng-show=\"adminForm.$dirty && adminForm.email.$invalid\">This field is invalid </span><br/><br/>\r\n");
      out.write("           \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tPassword\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"password\" type=\"password\"  class=\"validate[required]\" name=\"password\" style=\"width:120%\" placeholder=\"password\" value=\"\" ng-model=\"ctrl.admin.password\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span ng-show=\"adminForm.$dirty && adminForm.password.$error.required\">This is a required field</span>\r\n");
      out.write("              \t\t\t\t\t\t\t\t\t\t<span ng-show=\"adminForm.$dirty && adminForm.password.$error.minlength\">Minimum length required is 4</span>\r\n");
      out.write("              \t\t\t\t\t\t\t\t\t\t<span ng-show=\"adminForm.$dirty && adminForm.password.$invalid\">This field is invalid </span><br/><br/>\r\n");
      out.write("             \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"Submit1\" type=\"submit\" value=\"Submit\"  ng-disabled=\"adminForm.$invalid\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"Reset1\" type=\"reset\" value=\"Reset\" onclick=\"this.form.clear();\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<script>\r\n");
      out.write("         \r\n");
      out.write("          mainApp.controller('AdminLoginController', [function() {\r\n");
      out.write("              var self = this;\r\n");
      out.write("              self.submit = function() {\r\n");
      out.write("                  console.log('Form is submitted with following user', self.admin);\r\n");
      out.write("            };\r\n");
      out.write("      }]);\r\n");
      out.write("  </script>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"padding_20 text-justify\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- CONTENTS END -->\r\n");
      out.write("\t");
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
