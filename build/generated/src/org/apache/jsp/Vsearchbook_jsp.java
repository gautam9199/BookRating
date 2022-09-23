package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Vsearchbook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>  \n");
      out.write("<html>  \n");
      out.write("<head>  \n");
      out.write("<script>  \n");
      out.write("var request=new XMLHttpRequest();  \n");
      out.write("function searchInfo(){  \n");
      out.write("var name=document.vinform.name.value;  \n");
      out.write("var url=\"Srch_book.jsp?val=\"+name;  \n");
      out.write("  \n");
      out.write("try{  \n");
      out.write("request.onreadystatechange=function(){  \n");
      out.write("if(request.readyState==4){  \n");
      out.write("var val=request.responseText;  \n");
      out.write("document.getElementById('mylocation').innerHTML=val;  \n");
      out.write("}  \n");
      out.write("}//end of function  \n");
      out.write("request.open(\"GET\",url,true);  \n");
      out.write("request.send();  \n");
      out.write("}catch(e){alert(\"Unable to connect to server\");}  \n");
      out.write("}  \n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("        .hdr\n");
      out.write("        { height:100px; width:100%;\n");
      out.write("        background-color:#F3F4F5;\n");
      out.write("        }\n");
      out.write("</style>\n");
      out.write("</head>  \n");
      out.write("<body> \n");
      out.write("    <div  class=\"hdr\">\n");
      out.write("                   <img   src=\"l7.png\" alt=\"logo\" align=\"left\" width=\"250px\" height=\"80px\"/>\n");
      out.write("    </div>\n");
      out.write("    <h1><font color=\"#585858\" face=\"verdana\">Search Books</font></h1>  \n");
      out.write("<form name=\"vinform\">  \n");
      out.write("<input type=\"text\" name=\"name\" onkeyup=\"searchInfo()\">  \n");
      out.write("</form>  \n");
      out.write("  \n");
      out.write("<span id=\"mylocation\"></span>  \n");
      out.write("</body>  \n");
      out.write("</html> ");
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
