package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Success_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("    .hdr\n");
      out.write("    { height:100px; \n");
      out.write("    background-color:#F3F4F5;\n");
      out.write("    }\n");
      out.write("    .button1 { \n");
      out.write("            background-color:#0fcabf; \n");
      out.write("            border: none;\n");
      out.write("        color: white;\n");
      out.write("        padding: 10px 30px;\n");
      out.write("        text-align: center;\n");
      out.write("        font-size: 16px;\n");
      out.write("        cursor: pointer;\n");
      out.write("            border-radius: 6px;\t\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <div  class=\"hdr\" >\n");
      out.write("\t\t<img   src=\"l7.png\" alt=\"logo\" align=\"left\" width=\"250px\" height=\"80px\"/>\n");
      out.write("     </div>\n");
      out.write("     ");

    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
    
      out.write("\n");
      out.write("    <div align=\"center\"><font size=\"5\" face=\"cambria\" color=\"#0fcabf\"><br><br><br>You are not logged in<br/></font>\n");
      out.write("        <a href=\"Login.jsp\"><font face=\"verdana\" color=\"#585858\">Please Login</font></a>\n");
      out.write("    ");

    } else{
    
      out.write("\n");
      out.write("    Welcome ");
      out.print(session.getAttribute("userid"));
      out.write("\n");
      out.write("    <a href='Logout.jsp'><font face=\"verdana\" color=\"#585858\">Log out</font></a>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("    </div>\n");
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
