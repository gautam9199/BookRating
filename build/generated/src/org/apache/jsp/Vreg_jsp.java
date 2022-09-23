package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Vreg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\n");
      out.write("function Submit()\n");
      out.write("{\n");
      out.write("var fname = document.forms[\"myform\"][\"fname\"].value;\n");
      out.write("    \n");
      out.write("    if (fname == \"\") {\n");
      out.write("        alert(\"Name must be filled out\");\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("var lname = document.forms[\"myform\"][\"lname\"].value;\n");
      out.write("    \n");
      out.write("    if (lname == \"\") {\n");
      out.write("        alert(\"Last Name must be filled out\");\n");
      out.write("        return false;\n");
      out.write("    }\t\n");
      out.write("var emailRegex = /^[A-Za-z0-9._]*\\@[A-Za-z]*\\.[A-Za-z]{2,5}$/; \n");
      out.write("var email = document.forms[\"myform\"][\"email\"].value;\n");
      out.write(" if (email == \"\" )\n");
      out.write(" {\n");
      out.write("  alert(\"e-mail must be filled out\");\n");
      out.write("  return false;\n");
      out.write("  }else if(!emailRegex.test(email)){\n");
      out.write("  alert(\"invalid email address\");\n");
      out.write("  return false;\n");
      out.write("  }\n");
      out.write(" var passwordRegex = /^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$/;\n");
      out.write(" var pwd = document.forms[\"myform\"][\"pwd\"].value;\n");
      out.write("\tif(pwd == \"\" )\n");
      out.write("\t{\n");
      out.write("\talert(\"please Enter The Password\");\n");
      out.write("\treturn false;\n");
      out.write("\t}else if(!passwordRegex.test(pwd)){\n");
      out.write("\talert(\"Youe password should be Minimum 8 characters at least 1 Alphabet and 1 Number\");\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("var phoneRegex = /^(\\+\\d{1,3}[- ]?)?\\d{10}$/;\n");
      out.write("var phone =\tdocument.forms[\"myform\"][\"phone\"].value;\n");
      out.write(" if(phone == \"\" )\n");
      out.write("\t{\n");
      out.write("\talert(\"please Enter The Contact number\");\n");
      out.write("\treturn false;\n");
      out.write("\t}else if(!phoneRegex.test(phone)){\n");
      out.write("\talert(\"Youe have entered invalid contact number\");\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body background=\"F:\\wallies\\HD Wallpapers\\img36.jpg\">\n");
      out.write("\t<div  class=\"hdr\" >\n");
      out.write("\t\t<img   src=\"l7.png\" alt=\"logo\" align=\"left\" width=\"250px\" height=\"80px\"/>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<form name=\"myform\" onsubmit=\"return Submit()\" action=\"Reg.jsp\" method=post>\n");
      out.write("\t<center>\n");
      out.write("\t<table cellpadding=8 cellspacing=8 border=\"0\" bgcolor=\"transparent\"><BR><BR>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<th colspan=\"3\">\n");
      out.write("\t\t<font size=10 face=\"verdana\" color=\"#585858\">Member Registration</font><br>\n");
      out.write("\t\t</th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr bgcolor=\"transparent\">\n");
      out.write("\t\t\t<td valign=top> <font size=5 face=\"verdana\" color=\"#0fcabf\"><b>NAME</b></font></td>\n");
      out.write("\t\t\t<td colspan=\"2\"><input type=\"text\" name=\"fname\" placeholder=\"firstname\"  id=\"txt1\" size=18 maxlength=15>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"lname\" placeholder=\"lastname\" size=18 maxlength=15></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td valign=top> <font size=5 face=\"Verdana\" color=\"#0fcabf\"><b>Email-Id</b></font></td>\n");
      out.write("\t\t\t<td colspan=\"2\"><input type=\"text\" name=\"email\" value=\"\" size=40 maxlength=50></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td valign=top> <font size=5 face=\"Verdana\" color=\"#0fcabf\"><b>Password</b></font></td>\n");
      out.write("\t\t\t<td colspan=\"2\"><input type=\"Password\" name=\"pwd\" value=\"\" size=40 maxlength=10></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td valign=top> <font size=5 face=\"Verdana\" color=\"#0fcabf\"><b>Country</b></font></td>\n");
      out.write("\t\t\t<td colspan=\"2\">\n");
      out.write("\t\t\t<select name=\"cntry\" value=\"choose..\">\n");
      out.write("\t\t\t<option value=\"AF\">Afghanistan</option>\n");
      out.write("\t\t\t<option value=\"AR\">Argentina</option>\n");
      out.write("\t\t\t<option value=\"AU\">Australia</option>\n");
      out.write("\t\t\t<option value=\"BH\">Bahrain</option>\n");
      out.write("\t\t\t<option value=\"BD\">Bangladesh</option>\n");
      out.write("\t\t\t<option value=\"BE\">Belgium</option>\n");
      out.write("\t\t\t<option value=\"BR\">Brazil</option>\n");
      out.write("\t\t\t<option value=\"CA\">Canada</option>\n");
      out.write("\t\t\t<option value=\"CN\">China</option>\n");
      out.write("\t\t\t<option value=\"DK\">Denmark</option>\n");
      out.write("\t\t\t<option value=\"EG\">Egypt</option>\n");
      out.write("\t\t\t<option value=\"FI\">Finland</option>\n");
      out.write("\t\t\t<option value=\"FR\">France</option>\n");
      out.write("\t\t\t<option value=\"GE\">Georgia</option>\n");
      out.write("\t\t\t<option value=\"DE\">Germany</option>\n");
      out.write("\t\t\t<option value=\"HK\">Hong Kong</option>\n");
      out.write("\t\t\t<option value=\"IS\">Iceland</option>\n");
      out.write("\t\t\t<option value=\"IN\">India</option>\n");
      out.write("\t\t\t<option value=\"ID\">Indonesia</option>\n");
      out.write("\t\t\t<option value=\"IQ\">Iraq</option>\n");
      out.write("\t\t\t<option value=\"JP\">Japan</option>\n");
      out.write("\t\t\t<option value=\"JE\">Jersey</option>\n");
      out.write("\t\t\t<option value=\"KE\">Kenya</option>\n");
      out.write("\t\t\t<option value=\"KP\">Korea, Democratic People's Republic of</option>\n");
      out.write("\t\t\t<option value=\"KR\">Korea, Republic of</option>\n");
      out.write("\t\t\t<option value=\"KW\">Kuwait</option>\n");
      out.write("\t\t\t<option value=\"MO\">Macao</option>\n");
      out.write("\t\t\t<option value=\"MY\">Malaysia</option>\n");
      out.write("\t\t\t<option value=\"MM\">Myanmar</option>\n");
      out.write("\t\t\t<option value=\"NP\">Nepal</option>\n");
      out.write("\t\t\t<option value=\"NL\">Netherlands</option>\n");
      out.write("\t\t\t<option value=\"NZ\">New Zealand</option>\n");
      out.write("\t\t\t<option value=\"OM\">Oman</option>\n");
      out.write("\t\t\t<option value=\"PK\">Pakistan</option>\n");
      out.write("\t\t\t<option value=\"RO\">Romania</option>\n");
      out.write("\t\t\t<option value=\"RU\">Russian Federation</option>\n");
      out.write("\t\t\t<option value=\"SA\">Saudi Arabia</option>\n");
      out.write("\t\t\t<option value=\"ES\">Spain</option>\n");
      out.write("\t\t\t<option value=\"LK\">Sri Lanka</option>\n");
      out.write("\t\t\t<option value=\"SE\">Sweden</option>\n");
      out.write("\t\t\t<option value=\"CH\">Switzerland</option>\n");
      out.write("\t\t\t<option value=\"TH\">Thailand</option>\n");
      out.write("\t\t\t<option value=\"UA\">Ukraine</option>\n");
      out.write("\t\t\t<option value=\"GB\">United Kingdom</option>\n");
      out.write("\t\t\t<option value=\"US\">United States</option>\n");
      out.write("\t\t\t<option value=\"VN\">Viet Nam</option>\n");
      out.write("\t\t\t<option value=\"EH\">Western Sahara</option>\n");
      out.write("\t\t\t<option value=\"YE\">Yemen</option>\n");
      out.write("\t\t\t<option value=\"ZM\">Zambia</option>\n");
      out.write("\t\t\t<option value=\"ZW\">Zimbabwe</option>\n");
      out.write("\t\t</select>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td valign=top> <font size=5 face=\"Verdana\" color=\"#0fcabf\"><b>Contact no.</b></font></td>\n");
      out.write("\t\t\t<td colspan=\"2\"><input type=\"text\" name=\"phone\" value=\"\" size=40 maxlength=12></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr bgcolor=\"transparent\">\n");
      out.write("\t\t\t<td></td>\n");
      out.write("\t\t\t<td><input class=\"button1\" type=\"SUBMIT\" value=\"SUBMIT\">\n");
      out.write("\t\t\t<input class=\"button1\" type=\"button\" value=\"   EXIT  \" onclick=\"location.href='Vhome.jsp'\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t</center>\n");
      out.write("\t</form>\n");
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
