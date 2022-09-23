package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Vcontact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact form</title>\n");
      out.write("        <style>\n");
      out.write("         .hdr\n");
      out.write("        { height:100px; width:100%;\n");
      out.write("        background-color:#F3F4F5;\n");
      out.write("        }\n");
      out.write("         .ftr\n");
      out.write("        {position:relative;  top:400px;   height:90px;\t width:100%;\tbackground-color:#D1D6D4; }\n");
      out.write("        .ftr_info{\n");
      out.write("         font-size:5; font-family:cambria; color:#585858; }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div  class=\"hdr\" >\n");
      out.write("\t<table border=\"0\">\n");
      out.write("\t<tr>\n");
      out.write("\t<td width=\"700px\"><img   src=\"l7.png\" alt=\"logo\" align=\"left\" width=\"250px\" height=\"80px\"/></td>\n");
      out.write("\t</tr>\n");
      out.write("        </table>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("         </div>\n");
      out.write("\t<div class=\"ftr\">\n");
      out.write("\t<table border=\"0\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td  width=\"100px\"><a class=\"ftr_info\" href=\"xyz.com\" >Contact us</a></td>\n");
      out.write("\t\t<td width=\"100px\"><a class=\"ftr_info\" href =\"abc.com\">About us</a></td>\n");
      out.write("\t\t<!--<td width=\"100px\"><a class=\"ftr_info\" href =\"pqr.com\">Feedback</a></td> -->\n");
      out.write("\t\t<td>&copy; Copyright 2017.All rights are reserved.</td>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
