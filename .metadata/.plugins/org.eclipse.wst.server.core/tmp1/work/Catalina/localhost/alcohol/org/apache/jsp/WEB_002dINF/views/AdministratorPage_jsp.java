/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.8
 * Generated at: 2023-05-26 08:34:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class AdministratorPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1684123211379L));
    _jspx_dependants.put("jar:file:/C:/team/middlePj/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/alcohol/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c-1_2.tld", Long.valueOf(1664421078000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;

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

  public boolean getErrorOnELNotFound() {
    return false;
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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Administrator Page</title>\r\n");
      out.write("<link\r\n");
      out.write("    href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("    rel=\"stylesheet\"\r\n");
      out.write("    integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\"\r\n");
      out.write("    crossorigin=\"anonymous\">\r\n");
      out.write("    <link href=\"../assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"sidebars.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("    <header class=\"d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom\">\r\n");
      out.write("      <a href=\"/\" class=\"d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none\">\r\n");
      out.write("        <svg class=\"bi me-2\" width=\"40\" height=\"32\"><use xlink:href=\"#bootstrap\"></use></svg>\r\n");
      out.write("        <span class=\"fs-4\">관리자 페이지</span>\r\n");
      out.write("      </a>\r\n");
      out.write("\r\n");
      out.write("      <ul class=\"nav nav-pills\">\r\n");
      out.write("        <li class=\"nav-link px-2 link-dark\">\r\n");
      out.write("        <a href=\"#\" class=\"nav-link active\" aria-current=\"page\">Home</a></li>\r\n");
      out.write("        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">Features</a></li>\r\n");
      out.write("        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">Pricing</a></li>\r\n");
      out.write("        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">FAQs</a></li>\r\n");
      out.write("        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">About</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </header>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"flex-shrink-0 p-3 bg-white\" style=\"width: 280px;\">\r\n");
      out.write("            <a href=\"/\"\r\n");
      out.write("                class=\"d-flex align-items-center pb-3 mb-3 link-dark text-decoration-none border-bottom\">\r\n");
      out.write("                <svg class=\"bi pe-none me-2\" width=\"30\" height=\"24\">\r\n");
      out.write("                    <use xlink:href=\"#bootstrap\"></use></svg> <span\r\n");
      out.write("                class=\"fs-5 fw-semibold\">Collapsible</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"list-unstyled ps-0\">\r\n");
      out.write("                <li class=\"mb-1\">\r\n");
      out.write("                    <button\r\n");
      out.write("                        class=\"btn btn-toggle d-inline-flex align-items-center rounded border-0\"\r\n");
      out.write("                        data-bs-toggle=\"collapse\"\r\n");
      out.write("                        data-bs-target=\"#home-collapse\"\r\n");
      out.write("                        aria-expanded=\"true\">경매</button>\r\n");
      out.write("                    <div class=\"collapse show\" id=\"home-collapse\"\r\n");
      out.write("                        style=\"\">\r\n");
      out.write("                        <ul\r\n");
      out.write("                            class=\"btn-toggle-nav list-unstyled fw-normal pb-1 small\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ auctionProduct }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">경매상품관리</a></li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ auctionManagement }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">경매관리</a></li>\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">Reports</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mb-1\">\r\n");
      out.write("                    <button\r\n");
      out.write("                        class=\"btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed\"\r\n");
      out.write("                        data-bs-toggle=\"collapse\"\r\n");
      out.write("                        data-bs-target=\"#dashboard-collapse\"\r\n");
      out.write("                        aria-expanded=\"false\">경매관리</button>\r\n");
      out.write("                    <div class=\"collapse\" id=\"dashboard-collapse\">\r\n");
      out.write("                        <ul\r\n");
      out.write("                            class=\"btn-toggle-nav list-unstyled fw-normal pb-1 small\">\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">Overview</a></li>\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">Weekly</a></li>\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">Monthly</a></li>\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">Annually</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mb-1\">\r\n");
      out.write("                    <button\r\n");
      out.write("                        class=\"btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed\"\r\n");
      out.write("                        data-bs-toggle=\"collapse\"\r\n");
      out.write("                        data-bs-target=\"#orders-collapse\"\r\n");
      out.write("                        aria-expanded=\"false\">Orders</button>\r\n");
      out.write("                    <div class=\"collapse\" id=\"orders-collapse\">\r\n");
      out.write("                        <ul\r\n");
      out.write("                            class=\"btn-toggle-nav list-unstyled fw-normal pb-1 small\">\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">New</a></li>\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">Processed</a></li>\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">Shipped</a></li>\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">Returned</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"border-top my-3\"></li>\r\n");
      out.write("                <li class=\"mb-1\">\r\n");
      out.write("                    <button\r\n");
      out.write("                        class=\"btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed\"\r\n");
      out.write("                        data-bs-toggle=\"collapse\"\r\n");
      out.write("                        data-bs-target=\"#account-collapse\"\r\n");
      out.write("                        aria-expanded=\"false\">Account</button>\r\n");
      out.write("                    <div class=\"collapse\" id=\"account-collapse\">\r\n");
      out.write("                        <ul\r\n");
      out.write("                            class=\"btn-toggle-nav list-unstyled fw-normal pb-1 small\">\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">New...</a></li>\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">Profile</a></li>\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">Settings</a></li>\r\n");
      out.write("                            <li><a href=\"#\"\r\n");
      out.write("                                class=\"link-dark d-inline-flex text-decoration-none rounded\">Sign\r\n");
      out.write("                                    out</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script\r\n");
      out.write("            src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("            integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\"\r\n");
      out.write("            crossorigin=\"anonymous\">\r\n");
      out.write("									\r\n");
      out.write("								</script>\r\n");
      out.write("        <script src=\"sidebars.js\"></script>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/AdministratorPage.jsp(58,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("auctionProduct");
      // /WEB-INF/views/AdministratorPage.jsp(58,32) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/auction/product");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/views/AdministratorPage.jsp(62,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setVar("auctionManagement");
      // /WEB-INF/views/AdministratorPage.jsp(62,32) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/auction/auction");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }
}
