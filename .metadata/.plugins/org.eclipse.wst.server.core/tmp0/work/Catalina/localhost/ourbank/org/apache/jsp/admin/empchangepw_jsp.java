/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2017-11-28 00:54:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class empchangepw_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fid_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fa_0026_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody;

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
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005furl_0026_005fid_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005furl_0026_005fid_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.release();
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
      out.write("    <title></title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"../bootstrap/css/bootstrap.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("    <link href=\"../bootstrap/css/bootstrap-responsive.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("   \t\r\n");
      out.write("   \t\r\n");
      out.write("   \t<!--Modifications to Some Class--><!--Insert After Main CSS-->\r\n");
      out.write("   \t<link href=\"../css/basic.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("   \t<link rel=\"shortcut icon\" href=\"../favicon.ico\">\r\n");
      out.write("   \t<link href=\"../css/login.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
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
      out.write("\r\n");
      out.write("\t\t\t\t");
      //  s:if
      org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
      boolean _jspx_th_s_005fif_005f0_reused = false;
      try {
        _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
        _jspx_th_s_005fif_005f0.setParent(null);
        // /admin/empchangepw.jsp(26,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_s_005fif_005f0.setTest("#session.user != 'admin'");
        int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
        if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_s_005fif_005f0);
          }
          do {
            out.write("\r\n");
            out.write("         ");
  response.sendRedirect("login.jsp"); 
            out.write("\r\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
        _jspx_th_s_005fif_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fif_005f0_reused);
      }
      out.write(" \r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fset_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fset_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fset_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<ul class=\"nav nav-pills pull-right\">\r\n");
      out.write("  <li class=\"active\">\r\n");
      out.write("    ");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_s_005fa_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </li>\r\n");
      out.write("  \r\n");
      out.write("</ul>\r\n");
      out.write("     <ul class=\"nav nav-pills pull-right\">\r\n");
      out.write("  <li class=\"active\">\r\n");
      out.write("    <a href=\"welcome.jsp\">Home</a>\r\n");
      out.write("  </li>\r\n");
      out.write("  \r\n");
      out.write("</ul>\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 50px;\">\r\n");
      out.write("\t\t<div class=\"span1\"></div>\r\n");
      out.write("\t\t<div class=\"span10\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div class=\"alert alert-error\">\r\n");
      out.write("  <b>Do not Click on any External Links Or your session will be expired\r\n");
      out.write("  </b>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"alert alert-info\">\r\n");
      out.write("  <b>After changing the password successfully your account will be logout\r\n");
      out.write("  </b>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"alert alert-success\">\r\n");
      out.write(" Your Unique Bank ID is: <b>");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write(" </b>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span1\"></div>\r\n");
      out.write("</div>\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"container\" style=\"margin-top: 100px;\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"span2\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"span8\">\r\n");
      out.write("\t");
      if (_jspx_meth_s_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"span2\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"span3\"></div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("<div class=\"span8\">\t\t\t\t\t\r\n");
      out.write("<form class=\"form-horizontal\" action=\"adm_emp_changepw\" method=\"post\">\r\n");
      out.write("<fieldset>\r\n");
      out.write("\r\n");
      out.write("<!-- Form Name -->\r\n");
      out.write("<h4>Admin Employee Change Password</h4>\r\n");
      out.write("\r\n");
      out.write("<!-- Text input-->\r\n");
      out.write("<div class=\"control-group\">\r\n");
      out.write("  <label class=\"control-label\">Bank Employee Id</label>\r\n");
      out.write("  <div class=\"controls\">\r\n");
      out.write("    <input id=\"textinput\" name=\"chpw.bank_id\" type=\"text\" placeholder=\"Enter Employee Id\" class=\"input-xlarge\">\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Text input-->\r\n");
      out.write("<div class=\"control-group\">\r\n");
      out.write("  <label class=\"control-label\">New Password</label>\r\n");
      out.write("  <div class=\"controls\">\r\n");
      out.write("    <input id=\"textinput\" name=\"chpw.newpw\" type=\"password\" placeholder=\"Enter New Password\" class=\"input-xlarge\">\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Text input-->\r\n");
      out.write("<div class=\"control-group\">\r\n");
      out.write("  <label class=\"control-label\">Confirm Password</label>\r\n");
      out.write("  <div class=\"controls\">\r\n");
      out.write("    <input id=\"textinput\" name=\"chpw.cnewpw\" type=\"password\" placeholder=\"Enter Again New Password\" class=\"input-xlarge\">\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Button -->\r\n");
      out.write("<div class=\"control-group\">\r\n");
      out.write("  <label class=\"control-label\"></label>\r\n");
      out.write("  <div class=\"controls\">\r\n");
      out.write("    <button id=\"submit\" name=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</fieldset>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span1\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script src=\"../bootstrap/js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"../bootstrap/js/bootstrap.js\"></script>\r\n");
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

  private boolean _jspx_meth_s_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f0 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    boolean _jspx_th_s_005fset_005f0_reused = false;
    try {
      _jspx_th_s_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fset_005f0.setParent(null);
      // /admin/empchangepw.jsp(29,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fset_005f0.setVar("user");
      // /admin/empchangepw.jsp(29,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fset_005f0.setValue("#session.user.toString()");
      int _jspx_eval_s_005fset_005f0 = _jspx_th_s_005fset_005f0.doStartTag();
      if (_jspx_th_s_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_s_005fset_005f0);
      _jspx_th_s_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f1 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    boolean _jspx_th_s_005fset_005f1_reused = false;
    try {
      _jspx_th_s_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005fset_005f1.setParent(null);
      // /admin/empchangepw.jsp(30,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fset_005f1.setVar("user0");
      // /admin/empchangepw.jsp(30,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fset_005f1.setValue("#session.user0.toString()");
      int _jspx_eval_s_005fset_005f1 = _jspx_th_s_005fset_005f1.doStartTag();
      if (_jspx_th_s_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_s_005fset_005f1);
      _jspx_th_s_005fset_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fset_005f1, _jsp_getInstanceManager(), _jspx_th_s_005fset_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fset_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f2 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    boolean _jspx_th_s_005fset_005f2_reused = false;
    try {
      _jspx_th_s_005fset_005f2.setPageContext(_jspx_page_context);
      _jspx_th_s_005fset_005f2.setParent(null);
      // /admin/empchangepw.jsp(31,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fset_005f2.setVar("user1");
      // /admin/empchangepw.jsp(31,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fset_005f2.setValue("#session.user1.toString()");
      int _jspx_eval_s_005fset_005f2 = _jspx_th_s_005fset_005f2.doStartTag();
      if (_jspx_th_s_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_s_005fset_005f2);
      _jspx_th_s_005fset_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fset_005f2, _jsp_getInstanceManager(), _jspx_th_s_005fset_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fset_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f3 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    boolean _jspx_th_s_005fset_005f3_reused = false;
    try {
      _jspx_th_s_005fset_005f3.setPageContext(_jspx_page_context);
      _jspx_th_s_005fset_005f3.setParent(null);
      // /admin/empchangepw.jsp(32,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fset_005f3.setVar("user2");
      // /admin/empchangepw.jsp(32,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fset_005f3.setValue("#session.user2.toString()");
      int _jspx_eval_s_005fset_005f3 = _jspx_th_s_005fset_005f3.doStartTag();
      if (_jspx_th_s_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_s_005fset_005f3);
      _jspx_th_s_005fset_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fset_005f3, _jsp_getInstanceManager(), _jspx_th_s_005fset_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fset_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:set
    org.apache.struts2.views.jsp.SetTag _jspx_th_s_005fset_005f4 = (org.apache.struts2.views.jsp.SetTag) _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.SetTag.class);
    boolean _jspx_th_s_005fset_005f4_reused = false;
    try {
      _jspx_th_s_005fset_005f4.setPageContext(_jspx_page_context);
      _jspx_th_s_005fset_005f4.setParent(null);
      // /admin/empchangepw.jsp(33,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fset_005f4.setVar("balance");
      // /admin/empchangepw.jsp(33,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fset_005f4.setValue("abc.getNamount()");
      int _jspx_eval_s_005fset_005f4 = _jspx_th_s_005fset_005f4.doStartTag();
      if (_jspx_th_s_005fset_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_s_005fset_005f4);
      _jspx_th_s_005fset_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fset_005f4, _jsp_getInstanceManager(), _jspx_th_s_005fset_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fid_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    boolean _jspx_th_s_005furl_005f0_reused = false;
    try {
      _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005furl_005f0.setParent(null);
      // /admin/empchangepw.jsp(36,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f0.setId("logout");
      // /admin/empchangepw.jsp(36,4) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f0.setAction("logout");
      int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
      if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005furl_0026_005fid_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      _jspx_th_s_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_s_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    boolean _jspx_th_s_005fa_005f0_reused = false;
    try {
      _jspx_th_s_005fa_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fa_005f0.setParent(null);
      // /admin/empchangepw.jsp(36,41) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fa_005f0.setHref("%{logout}");
      int _jspx_eval_s_005fa_005f0 = _jspx_th_s_005fa_005f0.doStartTag();
      if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_s_005fa_005f0);
        }
        do {
          out.write("Logout");
          int evalDoAfterBody = _jspx_th_s_005fa_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fa_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f0);
      _jspx_th_s_005fa_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fa_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fa_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    boolean _jspx_th_s_005fproperty_005f0_reused = false;
    try {
      _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fproperty_005f0.setParent(null);
      // /admin/empchangepw.jsp(62,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fproperty_005f0.setValue("user1");
      int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
      if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      _jspx_th_s_005fproperty_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fproperty_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fproperty_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    boolean _jspx_th_s_005fif_005f1_reused = false;
    try {
      _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005fif_005f1.setParent(null);
      // /admin/empchangepw.jsp(73,1) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fif_005f1.setTest("hasActionErrors()");
      int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_s_005fif_005f1);
        }
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<div class= \"alert alert-error\">\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_s_005factionerror_005f0(_jspx_th_s_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t \r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<meta http-equiv=\"refresh\" content=\"4; url=empchangepw.jsp\" />\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      _jspx_th_s_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_s_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005factionerror_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_005factionerror_005f0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    boolean _jspx_th_s_005factionerror_005f0_reused = false;
    try {
      _jspx_th_s_005factionerror_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005factionerror_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
      int _jspx_eval_s_005factionerror_005f0 = _jspx_th_s_005factionerror_005f0.doStartTag();
      if (_jspx_th_s_005factionerror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
      _jspx_th_s_005factionerror_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005factionerror_005f0, _jsp_getInstanceManager(), _jspx_th_s_005factionerror_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    boolean _jspx_th_s_005fif_005f2_reused = false;
    try {
      _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_s_005fif_005f2.setParent(null);
      // /admin/empchangepw.jsp(81,5) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fif_005f2.setTest("hasActionMessages()");
      int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_s_005fif_005f2);
        }
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class=\"alert alert-info\">\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_s_005factionmessage_005f0(_jspx_th_s_005fif_005f2, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<meta http-equiv=\"refresh\" content=\"6; url=welcome.jsp\" />\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_s_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
      _jspx_th_s_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_s_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005factionmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_s_005factionmessage_005f0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    boolean _jspx_th_s_005factionmessage_005f0_reused = false;
    try {
      _jspx_th_s_005factionmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005factionmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f2);
      int _jspx_eval_s_005factionmessage_005f0 = _jspx_th_s_005factionmessage_005f0.doStartTag();
      if (_jspx_th_s_005factionmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
      _jspx_th_s_005factionmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005factionmessage_005f0, _jsp_getInstanceManager(), _jspx_th_s_005factionmessage_005f0_reused);
    }
    return false;
  }
}
