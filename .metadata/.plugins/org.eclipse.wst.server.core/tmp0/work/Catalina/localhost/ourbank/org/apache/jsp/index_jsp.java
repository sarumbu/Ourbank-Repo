/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2017-11-28 00:49:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Arumbu/Others/Learning/Learning_Workspace/JavaBuildCodeQuality/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ourbank/WEB-INF/lib/struts2-core-2.3.8.jar!/META-INF/struts-tags.tld", Long.valueOf(1355717946000L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.8.jar", Long.valueOf(1511446693018L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Our Bank</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\"\r\n");
      out.write("\tmedia=\"screen\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Modifications to Some Class-->\r\n");
      out.write("<!--Insert After Main CSS-->\r\n");
      out.write("<link href=\"css/basic.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\r\n");
      out.write("\t<section>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"myCarousel\" class=\"carousel slide\">\r\n");
      out.write("\t\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/slide-01.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/slide-02.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/slide-03.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<a class=\"left carousel-control\" href=\"#myCarousel\"\r\n");
      out.write("\t\t\t\t\t\tdata-slide=\"prev\">&lsaquo;</a> <a class=\"right carousel-control\"\r\n");
      out.write("\t\t\t\t\t\thref=\"#myCarousel\" data-slide=\"next\">&rsaquo;</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.carousel -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"container\" style=\"margin-top: 50px;\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"span2\" style=\"margin-left: 20px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"well sidebar-nav\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-list\">\r\n");
      out.write("                            <li class=\"nav-header\">Quick Links</li>\r\n");
      out.write("                            <li class=\"active\">\r\n");
      out.write("                                <a href=\"#\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">About Us</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">Contact Us</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">Safe Banking</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"span9\" style=\"margin-left: 50px;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"well\">\r\n");
      out.write("\t\t\t\t\t\t\t<div align=\"justify\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong style=\"color: red;\">The Strength and Integrity of Relationships</strong><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<b>Our Bank</b> believes in the strength and integrity of\r\n");
      out.write("\t\t\t\t\t\t\t\trelationships built with its customers like you. With over 102\r\n");
      out.write("\t\t\t\t\t\t\t\tyears of experience in the banking industry and a wide network\r\n");
      out.write("\t\t\t\t\t\t\t\tof over <a href=\"\" class=\"toplinks3\"><strong>4180&nbsp;branches</strong></a>\r\n");
      out.write("\t\t\t\t\t\t\t\tall over the country, we have always been active in extending\r\n");
      out.write("\t\t\t\t\t\t\t\tfinancial support and adapting to your changing needs.\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<p align=\"justify\">\r\n");
      out.write("\t\t\t\t\t\t\t\tOur <a href=\"\" class=\"toplinks3\"><strong>Deposit\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tProducts</strong></a>, <a href=\"\" class=\"toplinks3\"><strong>Retail\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tLoans</strong></a>, <a href=\"\" class=\"toplinks3\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"_new\"><strong>Credit Cards</strong></a> and <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"\" class=\"toplinks3\"><strong>Debit\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tCards</strong></a> help you with your growing financial needs. With\r\n");
      out.write("\t\t\t\t\t\t\t\tfacilities like <a href=\"\" class=\"toplinks3\"><strong>Lockers</strong></a>\r\n");
      out.write("\t\t\t\t\t\t\t\twe ensure that your valuables are safe with us.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p align=\"justify\">Our countrywide branches offer you\r\n");
      out.write("\t\t\t\t\t\t\t\tconvenience and ease in operating your account wherever you are.\r\n");
      out.write("\t\t\t\t\t\t\t\tOur 24-hour ATMs enable you to withdraw cash, check your account\r\n");
      out.write("\t\t\t\t\t\t\t\tbalance and request for a new chequebook even after banking\r\n");
      out.write("\t\t\t\t\t\t\t\thours.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p align=\"justify\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span >Faster technology for better\r\n");
      out.write("\t\t\t\t\t\t\t\t\tservice</span><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p align=\"justify\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\" class=\"toplinks3\"><strong>Our Bank\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tInternet Banking / Our Bank Mobile Banking</strong></a>, our latest Internet\r\n");
      out.write("\t\t\t\t\t\t\t\tand Mobile banking initiatives enable you to operate your\r\n");
      out.write("\t\t\t\t\t\t\t\taccount just as you would in any of our branches. You can\r\n");
      out.write("\t\t\t\t\t\t\t\tthrough the Internet check your balance, request for chequebooks\r\n");
      out.write("\t\t\t\t\t\t\t\tand print account details.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p align=\"justify\">\r\n");
      out.write("\t\t\t\t\t\t\t\tChoose from our various products and services, that we sincerely\r\n");
      out.write("\t\t\t\t\t\t\t\tfeel will put a smile on your face; an investment we would like\r\n");
      out.write("\t\t\t\t\t\t\t\tto bank on forever. <br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"bootstrap/js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("      !function ($) {\r\n");
      out.write("        $(function(){\r\n");
      out.write("          // carousel demo\r\n");
      out.write("          $('#myCarousel').carousel()\r\n");
      out.write("        })\r\n");
      out.write("      }(window.jQuery)\r\n");
      out.write("    </script>\r\n");
      out.write("\t<script src=\"bootstrap/js/holder.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
