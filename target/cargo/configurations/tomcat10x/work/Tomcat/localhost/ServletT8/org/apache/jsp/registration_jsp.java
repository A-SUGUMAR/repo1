/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.16
 * Generated at: 2024-08-07 02:23:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("<title>Sign Up Form by Colorlib</title>\n");
      out.write("\n");
      out.write("<!-- Font Icon -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\n");
      out.write("\n");
      out.write("<!-- Main css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	<div class=\"main\">\n");
      out.write("\n");
      out.write("		<!-- Sign up form -->\n");
      out.write("		<section class=\"signup\">\n");
      out.write("			<div class=\"container\">\n");
      out.write("				<div class=\"signup-content\">\n");
      out.write("					<div class=\"signup-form\">\n");
      out.write("						<h2 class=\"form-title\">Sign up</h2>\n");
      out.write("					\n");
      out.write("						<form method=\"\" action=\"\" class=\"register-form\"\n");
      out.write("							id=\"register-form\">\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("								<label for=\"name\"><i\n");
      out.write("									class=\"zmdi zmdi-account material-icons-name\"></i></label> <input\n");
      out.write("									type=\"text\" name=\"name\" id=\"name\" placeholder=\"Your Name\" />\n");
      out.write("							</div>\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("								<label for=\"email\"><i class=\"zmdi zmdi-email\"></i></label> <input\n");
      out.write("									type=\"email\" name=\"email\" id=\"email\" placeholder=\"Your Email\" />\n");
      out.write("							</div>\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("								<label for=\"pass\"><i class=\"zmdi zmdi-lock\"></i></label> <input\n");
      out.write("									type=\"password\" name=\"pass\" id=\"pass\" placeholder=\"Password\" />\n");
      out.write("							</div>\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("								<label for=\"re-pass\"><i class=\"zmdi zmdi-lock-outline\"></i></label>\n");
      out.write("								<input type=\"password\" name=\"re_pass\" id=\"re_pass\"\n");
      out.write("									placeholder=\"Repeat your password\" />\n");
      out.write("							</div>\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("								<label for=\"contact\"><i class=\"zmdi zmdi-lock-outline\"></i></label>\n");
      out.write("								<input type=\"text\" name=\"contact\" id=\"contact\"\n");
      out.write("									placeholder=\"Contact no\" />\n");
      out.write("							</div>\n");
      out.write("							<div class=\"form-group\">\n");
      out.write("								<input type=\"checkbox\" name=\"agree-term\" id=\"agree-term\"\n");
      out.write("									class=\"agree-term\" /> <label for=\"agree-term\"\n");
      out.write("									class=\"label-agree-term\"><span><span></span></span>I\n");
      out.write("									agree all statements in <a href=\"#\" class=\"term-service\">Terms\n");
      out.write("										of service</a></label>\n");
      out.write("							</div>\n");
      out.write("							<div class=\"form-group form-button\">\n");
      out.write("								<input type=\"submit\" name=\"signup\" id=\"signup\"\n");
      out.write("									class=\"form-submit\" value=\"Register\" />\n");
      out.write("							</div>\n");
      out.write("						</form>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"signup-image\">\n");
      out.write("						<figure>\n");
      out.write("							<img src=\"images/signup-image.jpg\" alt=\"sing up image\">\n");
      out.write("						</figure>\n");
      out.write("						<a href=\"login.jsp\" class=\"signup-image-link\">I am already\n");
      out.write("							member</a>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("	<!-- JS -->\n");
      out.write("	<script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("	<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
