package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Vupload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
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
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body background=\"F:\\wallies\\HD Wallpapers\\img36.jpg\">\n");
      out.write("    <div  class=\"hdr\" >\n");
      out.write("            <img   src=\"l7.png\" alt=\"logo\" align=\"left\" width=\"250px\" height=\"80px\"/>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <form action=\"Upload.jsp\" method=post>\n");
      out.write("    <center>\n");
      out.write("    <table cellpadding=8 cellspacing=8 border=\"0\" bgcolor=\"transparent\"><BR><BR>\n");
      out.write("    <tr>\n");
      out.write("        <th colspan=\"2\"><font size=10 face=\"verdana\" color=\"#585858\">Upload Book</font><br></th>\n");
      out.write("    </tr>\n");
      out.write("    <tr bgcolor=\"transparent\">\n");
      out.write("        <td valign=top><font size=5 face=\"verdana\" color=\"#0fcabf\"><b>Book Name</b></font></td>\n");
      out.write("        <td><input type=\"text\" name=\"bname\" value=\"\"  id=\"txt1\" size=40 maxlength=40>\n");
      out.write("    <tr>\n");
      out.write("        <td valign=top> <font size=5 face=\"Verdana\" color=\"#0fcabf\"><b>Publication</b></font></td>\n");
      out.write("        <td><input type=\"text\" name=\"pub\" value=\"\" size=40 maxlength=40></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td valign=top> <font size=5 face=\"Verdana\" color=\"#0fcabf\"><b>Author</b></font></td>\n");
      out.write("        <td><input type=\"text\" name=\"author\" value=\"\" size=40 maxlength=30></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td valign=top><font size=5 face=\"Verdana\" color=\"#0fcabf\"><b>Genre</b></font></td>\n");
      out.write("            <td>\n");
      out.write("            <select name=\"cat\">\n");
      out.write("                <option>Fiction</option>\n");
      out.write("                <option>Non-fiction</option>\n");
      out.write("                <option>Satire</option>\n");
      out.write("                <option>Drama</option>\n");
      out.write("                <option>Action and Adventure</option>\n");
      out.write("                <option>Romance</option>\n");
      out.write("                <option>Mystery</option>\n");
      out.write("                <option>Horror</option>\n");
      out.write("                <option>Self help</option>\n");
      out.write("                <option>Health</option>\n");
      out.write("                <option>Guide</option>\n");
      out.write("                <option>Travel</option>\n");
      out.write("                <option>Children's</option>\n");
      out.write("                <option>Religion, spirituality & New age</option>\n");
      out.write("                <option>Science</option>\n");
      out.write("                <option>History</option>\n");
      out.write("                <option>Math</option>\n");
      out.write("                <option>Anthology</option>\n");
      out.write("                <option>Poetry</option>\n");
      out.write("                <option>Encyclopedias</option>\n");
      out.write("                <option>Dictionaries</option>\n");
      out.write("                <option>Comics</option>\n");
      out.write("                <option>Art</option>\n");
      out.write("                <option>Cookbooks</option>\n");
      out.write("                <option>Diaries</option>\n");
      out.write("                <option>Journals</option>\n");
      out.write("                <option>Prayer Books</option>\n");
      out.write("                <option>Series</option>\n");
      out.write("                <option>Biography</option>\n");
      out.write("                <option>Autobiography</option>\n");
      out.write("                <option>Fantasy</option>\n");
      out.write("                <option>Satire</option>\n");
      out.write("                   \n");
      out.write("    </select>\n");
      out.write("         </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr bgcolor=\"transparent\">\n");
      out.write("        <td valign=top> <font size=5 face=\"verdana\" color=\"#0fcabf\"><b>Description</b></font></td>\n");
      out.write("        <td><TEXTAREA name=\"des\" ROWS=4 COLS=42></textarea>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td valign=top> <font size=5 face=\"Verdana\" color=\"#0fcabf\"><b>Cover Page</b></font></td>\n");
      out.write("        <td><input type=\"file\" name=\"cvr\" accept=\"image/*\" onchange=\"loadFile(event)\"><br>\n");
      out.write("        <div align=\"center\"><img id=\"output\" width=\"80\" height=\"80\"/>\n");
      out.write("        <script>\n");
      out.write("            var loadFile = function(event) {\n");
      out.write("        var output = document.getElementById('output');\n");
      out.write("        output.src = URL.createObjectURL(event.target.files[0]);\n");
      out.write("      };\n");
      out.write("      </script>\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr bgcolor=\"transparent\">\n");
      out.write("        <td></td>\n");
      out.write("        <td><input class=\"button1\" type=\"SUBMIT\" value=\"SUBMIT\">\n");
      out.write("        <input class=\"button1\" type=\"button\" value=\"   EXIT  \" onclick=\"location.href='Vsuccess.jsp'\"></td>\n");
      out.write("    </tr>\n");
      out.write("    </table>\n");
      out.write("    </center>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
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
