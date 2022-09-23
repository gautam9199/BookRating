package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Srch_005fcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("  \n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write(" .rectangle {width: 700px; height: 205px; border: 5px solid black; position:relative; top:10px;}\n");
      out.write(".tb{position:absolute; top:10px; bottom:10px; left:10px; right:10px; height:170px; width:680px;}\n");
      out.write("</style>   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
  
String name=request.getParameter("val");  
if(name==null||name.trim().equals("")){  
out.print("<p>Please enter name!</p>");  
}else{  
try{  
Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
PreparedStatement ps=con.prepareStatement("select * from book where genre1 like '"+name+"%'");  
ResultSet rs=ps.executeQuery();  
  
if(!rs.isBeforeFirst()) {      
 out.println("<p>No Record Found!</p>");   
}else{  
while(rs.next()){ 
session.setAttribute("b_name",rs.getString(1));
session.setAttribute("b_author",rs.getString(2));
session.setAttribute("b_pub",rs.getString(3));
session.setAttribute("b_genre",rs.getString(4));
session.setAttribute("b_rating",rs.getString(7));
session.setAttribute("b_des",rs.getString(5));
session.setAttribute("b_img",rs.getString(6));

      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"rectangle\">  \n");
      out.write("\t\t<table border=\"0\" class=\"tb\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td width=\"120px\" rowspan=\"2\" bgcolor=\"#0fcabf\"><img src=\"");
      out.print(rs.getString(6));
      out.write("\" height=\"170px\" width=\"110px\" alt=\"book cover\"/></td>\n");
      out.write("\t\t<td  align=\"center\" bgcolor=\"#0fcabf\" width=\"530px\" height=\"130px;\"><font size=\"4px\" color=\"white\">Book name : ");
      out.print(rs.getString(1));
      out.write("<br>Author : ");
      out.print(rs.getString(2));
      out.write("<br>Genre :  ");
      out.print(rs.getString(4));
      out.write("<br>Stars : 5</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td align=\"center\"><form action=\"Vview.jsp\" method=\"get\" align=\"center\">\n");
      out.write("\t\t\t<button type=\"submit\" class=\"button1\">View</button></form></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");

}  
out.print("</table>");  
}//end of else for rs.isBeforeFirst  
con.close();  
}catch(Exception e){out.print(e);}  
}//end of else  

      out.write("\n");
      out.write("</center>\n");
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
