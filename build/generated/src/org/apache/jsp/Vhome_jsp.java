package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Vhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home Page</title>\n");
      out.write("        <style>\n");
      out.write("            @keyframes slidy {\n");
      out.write("\t\t0% { left: 0%; }\n");
      out.write("\t\t20% { left: 0%; }\n");
      out.write("\t\t25% { left: -100%; }\n");
      out.write("\t\t45% { left: -100%; }\n");
      out.write("\t\t50% { left: -200%; }\n");
      out.write("\t\t70% { left: -200%; }\n");
      out.write("\t\t75% { left: -300%; }\n");
      out.write("\t\t95% { left: -300%; }\n");
      out.write("\t\t100% { left: -400%; }\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tbody { margin: 0; } \n");
      out.write("\t\tdiv#slider { overflow: hidden; }\n");
      out.write("\t\tdiv#slider figure img { width: 20%; float: left; }\n");
      out.write("\t\tdiv#slider figure { \n");
      out.write("\t\t  position: relative;\n");
      out.write("\t\t  width: 500%;\n");
      out.write("\t\t  margin: 0;\n");
      out.write("\t\t  left: 0;\n");
      out.write("\t\t  text-align: left;\n");
      out.write("\t\t  font-size: 0;\n");
      out.write("\t\t  animation: 30s slidy infinite; \n");
      out.write("\t\t}\n");
      out.write("        .hdr\n");
      out.write("        { height:100px; width:100%;\n");
      out.write("        background-color:#F3F4F5;\n");
      out.write("        }\n");
      out.write("        .button1 { \n");
      out.write("            border:none;\n");
      out.write("            background-color:#0fcabf; \n");
      out.write("            color: white;\n");
      out.write("            padding: 8px 26px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 6px;\t\n");
      out.write("           }\n");
      out.write("         .ftr\n");
      out.write("        {  height:90px;\t width:100%;\tbackground-color:#D1D6D4; }\n");
      out.write("        .ftr_info{\n");
      out.write("         font-size:5; font-family:cambria; color:#585858; }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t<div  class=\"hdr\" >\n");
      out.write("\t<table border=\"0\">\n");
      out.write("\t<tr>\n");
      out.write("\t<td width=\"700px\"><img   src=\"l7.png\" alt=\"logo\" align=\"left\" width=\"250px\" height=\"80px\"/></td>\n");
      out.write("\t<td width=\"500px\"><form action=\"Vlogin.jsp\" method=\"get\" align=\"center\">\n");
      out.write("\t\t\t<button style=\"padding: 10px 30px;\"type=\"submit\" class=\"button1\"> UPLOAD BOOK </button></form></td>\n");
      out.write("                        <td><form action=\"Vlogin.jsp\" method=\"get\"><button  class=\"button1\" type=\"submit\" value=\"  Login\"> LOGIN </button></form><br>\n");
      out.write("            <form action=\"Vreg.jsp\" method=\"post\"><button  class=\"button1\" type=\"submit\" value=\"  sing up\">Signup</button></form></td>\n");
      out.write("\t</tr>\n");
      out.write("        </table>\n");
      out.write("\t</div>\n");
      out.write("        <div>\n");
      out.write("            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("\t\t<tr height=\"50px\" bgcolor=\"#585858\" valign=\"center\" width=\"100%\">\n");
      out.write("                    <td align=\"center\" width=\"50%\"><form action=\"Vsearchcat.jsp\" method=\"get\" align=\"center\">\n");
      out.write("\t\t\t<button style=\"padding: 10px 30px;\" type=\"submit\" class=\"button1\"> Search By Category </button></form></td>\n");
      out.write("                    <td align=\"center\" width=\"50%\"><form action=\"Vsearchbook.jsp\" method=\"get\" align=\"center\">\n");
      out.write("\t\t\t<button style=\"padding: 10px 30px;\" type=\"submit\" class=\"button1\"> Search By Bookname </button></form></td>\n");
      out.write("\t\t</tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("       <div id=\"slider\">\n");
      out.write("        <figure>\n");
      out.write("        <img style=\" height:550px;\" src=\"11.jpg\" alt>\n");
      out.write("        <img style=\" height:550px;\" src=\"22.jpg\" alt>\n");
      out.write("        <img style=\" height:550px;\" src=\"3.jpg\" alt>\n");
      out.write("        <img style=\" height:550px;\" src=\"4.jpg\" alt>\n");
      out.write("        <img style=\" height:550px;\" src=\"6.jpg\" alt> \n");
      out.write("        </figure>\n");
      out.write("        </div>\n");
      out.write("\t<div class=\"ftr\">\n");
      out.write("\t<table border=\"0\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td  width=\"100px\"><a class=\"ftr_info\" href=\"Vcontact.jsp\" >Contact us</a></td>\n");
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
