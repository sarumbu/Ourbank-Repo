/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2017-11-28 00:49:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class interest_002drate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\r\n");
      out.write("    <title>Our Bank || Interest Rate</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("    <link href=\"bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("   \t\r\n");
      out.write("   \t\r\n");
      out.write("   \t<!--Modifications to Some Class--><!--Insert After Main CSS-->\r\n");
      out.write("   \t<link href=\"css/basic.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("   \t<link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\r\n");
      out.write("   <section>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 50px;\">\r\n");
      out.write("\t\t\t<div class=\"span1\"></div>\r\n");
      out.write("\t\t\t<div class=\"span10\">\r\n");
      out.write("\t\t\t<div class=\"well\"><img  src=\"img/Interest.jpg\"></div>\r\n");
      out.write("\t\t\t<div class=\"well\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <strong style=\"color: red; margin-left: 250px;\">Deposit Rate of Interest</strong>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\t\t\t<table style=\" margin-top: 50px; WIDTH: 496px; HEIGHT: 232px;\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" width=\"496\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td rowspan=\"3\" colspan=\"4\" align=\"center\">Period</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"7\" align=\"center\">&nbsp;General</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"8\" align=\"center\">Up to&nbsp; Rs.15 Lakhs</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"4\" align=\"center\">&nbsp;</td>\r\n");
      out.write("                        <td align=\"center\">General </td>\r\n");
      out.write("                        <td align=\"center\">Senior Citizens</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"4\" align=\"center\">7 days to 180 days</td>\r\n");
      out.write("                        <td align=\"center\">7.00%</td>\r\n");
      out.write("                        <td align=\"center\">7.00%</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"4\" align=\"center\">181 days to 270 days</td>\r\n");
      out.write("                        <td align=\"center\">7.50%</td>\r\n");
      out.write("                        <td align=\"center\">7.50%</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"4\" align=\"center\">271 days to 364 days</td>\r\n");
      out.write("                        <td align=\"center\">7.75%</td>\r\n");
      out.write("                        <td align=\"center\">7.75%</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"4\" align=\"center\">365 days to 499 days</td>\r\n");
      out.write("                        <td align=\"center\">9.50%</td>\r\n");
      out.write("                        <td align=\"center\">10.00%</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"4\" align=\"center\"><strong>500 days</strong></td>\r\n");
      out.write("                        <td align=\"center\">10.00%</td>\r\n");
      out.write("                        <td align=\"center\">10.00%</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"4\" align=\"center\">501 days to 5 years</td>\r\n");
      out.write("                        <td align=\"center\">9.25%</td>\r\n");
      out.write("                        <td align=\"center\">9.75%</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"4\" align=\"center\">Above 5 years and upto 10 years</td>\r\n");
      out.write("                        <td align=\"center\">8.75%</td>\r\n");
      out.write("                        <td align=\"center\">9.00%</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"12\" align=\"center\">Tax Saver Schemes (both for General and Senoir citizens) ROI p.a&nbsp; 9.50%</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            <p><strong>Terms :</strong>&nbsp;&nbsp; Senior citizens:&nbsp;&nbsp;&nbsp; Age- Completed age of 60 years.<br>\r\n");
      out.write("            </p>\r\n");
      out.write("            <p>&nbsp;</p>\r\n");
      out.write("            <table style=\"WIDTH: 504px; HEIGHT: 232px\" cellspacing=\"0\" cellpadding=\"0\" width=\"504\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td style=\"PADDING-BOTTOM: 10px; PADDING-LEFT: 10px; PADDING-RIGHT: 10px; PADDING-TOP: 10px\">\r\n");
      out.write("                        <table style=\"WIDTH: 483px; HEIGHT: 193px; BEHAVIOR: url(http://172.17.1.150/CMSEditor/editor/css/behaviors/showtableborders.htc)\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" width=\"483\">\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td colspan=\"7\" align=\"center\"><strong>NRE TERM DEPOSITS</strong> </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td colspan=\"7\" align=\"center\"><strong>From 01-01-2013</strong></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td width=\"300\"><strong>PERIOD </strong></td>\r\n");
      out.write("                                    <td width=\"476\" colspan=\"6\" align=\"center\"><strong>Rate of Interest % p.a</strong></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td width=\"300\">&nbsp;</td>\r\n");
      out.write("                                    <td width=\"476\" colspan=\"5\" align=\"center\">Upto&nbsp;5 Cr</td>\r\n");
      out.write("                                    <td>Above&nbsp;5&nbsp;Cr</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>1 Year</td>\r\n");
      out.write("                                    <td colspan=\"5\" align=\"center\">9.50%</td>\r\n");
      out.write("                                    <td>9.00%</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>Above 1 Year and upto 5 Years</td>\r\n");
      out.write("                                    <td colspan=\"5\" align=\"center\">9.25%</td>\r\n");
      out.write("                                    <td>8.75%</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>Above 5 years and upto 10 Years</td>\r\n");
      out.write("                                    <td colspan=\"5\" align=\"center\">8.75%</td>\r\n");
      out.write("                                    <td>8.50%</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            <p><br>\r\n");
      out.write("            NRE Savings A/C: From 03-05-2011&nbsp; rate of interest will be 4.00% P.a <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            </p>\r\n");
      out.write("            <table style=\"WIDTH: 496px; HEIGHT: 247px\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" width=\"496\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td style=\"WIDTH: 765px; HEIGHT: 47px\" colspan=\"9\" align=\"center\"><strong>Interest rates for FCNR (B) Deposits<br>\r\n");
      out.write("                        for the period 01.03.2013 to 31.03.2013</strong></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td align=\"left\"><strong>PERIOD </strong></td>\r\n");
      out.write("                        <td align=\"center\">USD</td>\r\n");
      out.write("                        <td align=\"center\">GBP</td>\r\n");
      out.write("                        <td align=\"center\">EUR</td>\r\n");
      out.write("                        <td align=\"center\">YEN</td>\r\n");
      out.write("                        <td align=\"center\">CAD </td>\r\n");
      out.write("                        <td align=\"center\">AUD</td>\r\n");
      out.write("                        <td align=\"center\">&nbsp;SEK </td>\r\n");
      out.write("                        <td align=\"center\">SGD</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td align=\"left\">1 Year and above but less than 2 Years</td>\r\n");
      out.write("                        <td align=\"center\">2.75</td>\r\n");
      out.write("                        <td align=\"center\">2.93</td>\r\n");
      out.write("                        <td align=\"center\">2.45</td>\r\n");
      out.write("                        <td align=\"center\">2.46</td>\r\n");
      out.write("                        <td align=\"center\">3.82</td>\r\n");
      out.write("                        <td align=\"center\">5.55</td>\r\n");
      out.write("                        <td align=\"center\">&nbsp;3.74</td>\r\n");
      out.write("                        <td align=\"center\">2.50</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td align=\"left\">2 Year and above but less than 3 Years</td>\r\n");
      out.write("                        <td align=\"center\">2.40</td>\r\n");
      out.write("                        <td align=\"center\">2.63</td>\r\n");
      out.write("                        <td align=\"center\">2.48</td>\r\n");
      out.write("                        <td align=\"center\">2.22</td>\r\n");
      out.write("                        <td align=\"center\">3.30</td>\r\n");
      out.write("                        <td align=\"center\">4.88</td>\r\n");
      out.write("                        <td align=\"center\">&nbsp;3.38</td>\r\n");
      out.write("                        <td align=\"center\">2.54</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td align=\"left\">3 Year and above but less than 4 Years</td>\r\n");
      out.write("                        <td align=\"center\">3.51</td>\r\n");
      out.write("                        <td align=\"center\">3.72</td>\r\n");
      out.write("                        <td align=\"center\">3.62</td>\r\n");
      out.write("                        <td align=\"center\">3.23</td>\r\n");
      out.write("                        <td align=\"center\">4.40</td>\r\n");
      out.write("                        <td align=\"center\">6.05</td>\r\n");
      out.write("                        <td align=\"center\">&nbsp;4.54</td>\r\n");
      out.write("                        <td align=\"center\">3.63</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td align=\"left\">4 Year and above but less than 5 Years</td>\r\n");
      out.write("                        <td align=\"center\">3.69</td>\r\n");
      out.write("                        <td align=\"center\">3.88</td>\r\n");
      out.write("                        <td align=\"center\">3.78</td>\r\n");
      out.write("                        <td align=\"center\">3.25</td>\r\n");
      out.write("                        <td align=\"center\">4.54</td>\r\n");
      out.write("                        <td align=\"center\">6.27</td>\r\n");
      out.write("                        <td align=\"center\">&nbsp;4.68</td>\r\n");
      out.write("                        <td align=\"center\">3.79</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td align=\"left\">5 Years only</td>\r\n");
      out.write("                        <td align=\"center\">3.92</td>\r\n");
      out.write("                        <td align=\"center\">4.08</td>\r\n");
      out.write("                        <td align=\"center\">3.96</td>\r\n");
      out.write("                        <td align=\"center\">3.30</td>\r\n");
      out.write("                        <td align=\"center\">4.68</td>\r\n");
      out.write("                        <td align=\"center\">6.41</td>\r\n");
      out.write("                        <td align=\"center\">&nbsp;4.83</td>\r\n");
      out.write("                        <td align=\"center\">3.98</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td># Libor Rates as Declared&nbsp; by FEDAI #<br>\r\n");
      out.write("            * Penal interest of 1 % for premature closure of Deposits</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("            <table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>&nbsp;</td>\r\n");
      out.write("                        <td align=\"right\">&nbsp;</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"span1\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script src=\"bootstrap/js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("  </body>\r\n");
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
