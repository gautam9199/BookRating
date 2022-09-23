package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Vview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write(".hdr\n");
      out.write("{ height:100px; width:100%;\n");
      out.write("background-color:#F3F4F5;\n");
      out.write("}\n");
      out.write(".button1 { \n");
      out.write("\tbackground-color:#0fcabf; \n");
      out.write("\tborder: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 30px;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 16px;\n");
      out.write("    cursor: pointer;\n");
      out.write("\tborder-radius: 6px;\t\n");
      out.write("}\n");
      out.write(".t1{font-size:17; font-family:verdana; }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div  class=\"hdr\" >\n");
      out.write("\t\t<img   src=\"l7.png\" alt=\"logo\" align=\"left\" width=\"250px\" height=\"80px\"/>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<center>\n");
      out.write("\t<div style=\"position:relative; top:50px;\">\n");
      out.write("\t<table cellpadding=\"5\" cellspacing=\"2\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td width=\"200px\" rowspan=\"6\"><img src=\"3.jpg\" height=\"210px\" width=\"180px\" alt=\"Book cvr\"/></td>\n");
      out.write("\t\t<td ><p class=\"t1\">Book Name : <font size=\"4\" face=\"verdana\" color=\"#0fcabf\">Database managmnt system</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td><p class=\"t1\">Author : <font size=\"4\" face=\"verdana\" color=\"#0fcabf\">Tribhuvandas</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td><p class=\"t1\">Publication : <font size=\"4\" face=\"verdana\" color=\"#0fcabf\">Krishna publication</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td><p class=\"t1\">Genre : <font size=\"4\" face=\"verdana\" color=\"#0fcabf\">Science</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td><p class=\"t1\">Rating : <font size=\"4\" face=\"verdana\" color=\"#0fcabf\">4/5 stars</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td><p class=\"t1\">Give rating: <font size=\"4\" face=\"verdana\" color=\"#0fcabf\">Tribhuvandas</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td colspan=\"2\"><p class=\"t1\">Description : <font size=\"4\" face=\"verdana\" color=\"#0fcabf\">it s ujbdcs fuhdjn rfcdgyuhbn fcyughbnrfc rfyhbn yuurhfdn yrhfn yhrfnu rfyh rfyh yhnrf yhrnf yuuhnrf.</td>\n");
      out.write("\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t</center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
