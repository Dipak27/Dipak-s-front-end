/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-11-10 09:56:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class batchcreate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<div class=\"container_24\" ng-controller=\"BatchController as bat\">\r\n");
      out.write("\t\t\t<div class=\"grid_24\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"padding_20\">\r\n");
      out.write("\t\t\t\t\t\t<h1>Batch</h1>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid_6 alpha\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"padding_20 text-justify\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form ng-submit=\"submit()\" name=\"btcfrm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"form-table\" style=\"width:auto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("                        \t\t\t\t\t<tr>\r\n");
      out.write("                        \t\t\t\t\t\t<td><input type=\"hidden\" ng-model=\"batch.batch_id\"></td>\r\n");
      out.write("                        \t\t\t\t\t</tr>\r\n");
      out.write("                        \t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tBatch Name\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"batchname\" type=\"text\"  class=\"validate[required]\" ng-model=\"bat.batch.batch_name\" style=\"width:120%\" placeholder=\"Enter Batch Name\" value=\"\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tBatch Start Date\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"batchstartdate\" type=\"date\"  class=\"validate[required]\" ng-model=\"bat.batch.batch_start_date\" style=\"width:120%\"  value=\"\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tBatch End Date\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"batchenddate\" type=\"date\"  class=\"validate[required]\" ng-model=\"bat.batch.batch_end_date\" style=\"width:120%\" value=\"\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("                        \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tBatch Type\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"select1\"  class=\"validate[required]\" ng-model=\"bat.batch.batch_type\" style=\"width:120%\"  >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"null\">----Select-----</option>\r\n");
      out.write("                                        \t\t\t<option value=\"Technical\">Technical</option>\r\n");
      out.write("                                        \t\t\t<option value=\"softskill\">Soft Skill</option>\r\n");
      out.write("                                        \t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tBatch Location\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"select1\"  class=\"validate[required]\" ng-model=\"bat.batch.batch_location\" style=\"width:120%\"  >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"null\">----Select-----</option>\r\n");
      out.write("                                        \t\t\t<option value=\"pune\">Pune</option>\r\n");
      out.write("                                        \t\t\t<option value=\"hyderabad\">Hyderabad</option>\r\n");
      out.write("                                        \t\t\t<option value=\"gandhinagar\">Gandinagar</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tBatch Technology\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" ng-model=\"bat.batch.batch_technology\" value=\"java\"> Java<br>\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" ng-model=\"bat.batch.batch_technology\" value=\"php\">Php<br>\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" ng-model=\"bat.batch.batch_technology\" value=\"angularjs\">Angular Js<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"Submit1\" type=\"submit\" value=\"Sumbit\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid_28 omega\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"padding_20 text-justify\" ng-controller=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form id=\"frmMain\"  class=\"frmMain\" ng-submit=\"submitsearch()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"form-table\" style=\"width:auto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tSearch By Batch Id\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"batch\" ng-model=\"batch.batch_id\" style=\"width:120%\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:red\" ng-show=\"trnfrm.trn.trainer.trainer_id.$dirty && trnfrm.trn.trainer.trainer_id.$invalid\">\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t\t\t\t\t\t<span ng-show=\"trnfrm.trn.trainer.trainer_id.$error.required\">Trainer id is required.</span>\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input id= \"Submit1\" type=\"submit\" value=\"Submit\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"Reset1\" type=\"reset\" value=\"Reset\" onclick=\"this.form.clear();\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<table border='0' width='100%' class='table11'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Batch id</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Start Date</th>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>End Date</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Batch Type</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Location</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t   \t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr ng-repeat=\"b in bat.batches\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><span ng-bind=\"b.batch_id\"></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t                              <td><span ng-bind=\"b.batch_name\"></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t                              <td><span ng-bind=\"b.batch_start_date\"></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t                              <td><span ng-bind=\"b.batch_end_date\"></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t                              <td>\r\n");
      out.write("\t\t\t\t\t\t\t                              <button type=\"button\" ng-click=\"bat.edit(b.batch_id)\" >Edit</button>  \r\n");
      out.write("\t\t\t\t\t\t\t                              <button type=\"button\" ng-click=\"bat.remove(b.batch_id)\">Remove</button>\r\n");
      out.write("\t\t\t\t\t\t\t                              </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t     </table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
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
