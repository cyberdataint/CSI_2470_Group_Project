package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class include_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version = \"1.0\"?>\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<!-- Fig. 37.10: include.jsp -->\r\n");
      out.write("\r\n");
      out.write("<html xmlns = \"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("   <head>\r\n");
      out.write("      <title>Using jsp:include</title>\r\n");
      out.write("\r\n");
      out.write("      <style type = \"text/css\">\r\n");
      out.write("         body { \r\n");
      out.write("            font-family: tahoma, helvetica, arial, sans-serif; \r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("         table, tr, td { \r\n");
      out.write("            font-size: .9em;\r\n");
      out.write("            border: 3px groove;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            background-color: #dddddd; \r\n");
      out.write("         }\r\n");
      out.write("      </style>\r\n");
      out.write("   </head>\r\n");
      out.write("\r\n");
      out.write("   <body>\r\n");
      out.write("      <table>\r\n");
      out.write("         <tr>\r\n");
      out.write("            <td style = \"width: 160px; text-align: center\">\r\n");
      out.write("               <img src = \"images/logotiny.png\" \r\n");
      out.write("                  width = \"140\" height = \"93\" \r\n");
      out.write("                  alt = \"Deitel & Associates, Inc. Logo\" />\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td>\r\n");
      out.write("\r\n");
      out.write("               ");
      out.write("\r\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.html", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("         </tr>\r\n");
      out.write("\r\n");
      out.write("         <tr>\r\n");
      out.write("            <td style = \"width: 160px\">\r\n");
      out.write("               \r\n");
      out.write("               ");
      out.write("\r\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "toc.html", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style = \"vertical-align: top\"> \r\n");
      out.write("\r\n");
      out.write("               ");
      out.write("\r\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "clock2.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write(" /*************************************************************************\r\n");
      out.write(" * (C) Copyright 1992-2004 by Deitel & Associates, Inc. and               *\r\n");
      out.write(" * Pearson Education, Inc. All Rights Reserved.                           *\r\n");
      out.write(" *                                                                        *\r\n");
      out.write(" * DISCLAIMER: The authors and publisher of this book have used their     *\r\n");
      out.write(" * best efforts in preparing the book. These efforts include the          *\r\n");
      out.write(" * development, research, and testing of the theories and programs        *\r\n");
      out.write(" * to determine their effectiveness. The authors and publisher make       *\r\n");
      out.write(" * no warranty of any kind, expressed or implied, with regard to these    *\r\n");
      out.write(" * programs or to the documentation contained in these books. The authors *\r\n");
      out.write(" * and publisher shall not be liable in any event for incidental or       *\r\n");
      out.write(" * consequential damages in connection with, or arising out of, the       *\r\n");
      out.write(" * furnishing, performance, or use of these programs.                     *\r\n");
      out.write(" *************************************************************************/\r\n");
      out.write("-->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
