package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>CSI Group Project</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background-color: #f0f0f0;\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .container {\r\n");
      out.write("            /* Keep the container visible by default */\r\n");
      out.write("        }\r\n");
      out.write("        .login-container {\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        h1 {\r\n");
      out.write("            color: #333;\r\n");
      out.write("            font-size: 36px;\r\n");
      out.write("        }\r\n");
      out.write("        h2 {\r\n");
      out.write("            color: #555;\r\n");
      out.write("            font-size: 24px;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"text\"] {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin: 5px 0;\r\n");
      out.write("        }\r\n");
      out.write("        button {\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            border: none;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("        button:hover {\r\n");
      out.write("            background-color: #45a049;\r\n");
      out.write("        }\r\n");
      out.write("        .hidden {\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("        .user-list {\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\" id=\"loginContainer\">\r\n");
      out.write("        <h1>CSI Group Project</h1>\r\n");
      out.write("        <div class=\"login-container\">\r\n");
      out.write("            <h2>Login</h2>\r\n");
      out.write("            <form id=\"loginForm\">\r\n");
      out.write("                <label for=\"firstName\">First Name:</label>\r\n");
      out.write("                <input type=\"text\" id=\"firstName\" required>\r\n");
      out.write("                <br>\r\n");
      out.write("                <label for=\"lastName\">Last Name:</label>\r\n");
      out.write("                <input type=\"text\" id=\"lastName\" required>\r\n");
      out.write("                <br>\r\n");
      out.write("                <button type=\"button\" onclick=\"login()\">Log In</button>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"user-list\">\r\n");
      out.write("                <h2>User List</h2>\r\n");
      out.write("                <ul id=\"userList\"></ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        // Load existing users from sessionStorage\r\n");
      out.write("        function loadUserList() {\r\n");
      out.write("            const userList = document.getElementById(\"userList\");\r\n");
      out.write("            const storedUsers = sessionStorage.getItem(\"users\");\r\n");
      out.write("\r\n");
      out.write("            if (storedUsers) {\r\n");
      out.write("                const users = JSON.parse(storedUsers);\r\n");
      out.write("                userList.innerHTML = \"\";\r\n");
      out.write("                users.forEach(user => {\r\n");
      out.write("                    addUserToList(user.firstName, user.lastName);\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function login() {\r\n");
      out.write("            var firstName = capitalizeFirstLetter(document.getElementById(\"firstName\").value);\r\n");
      out.write("            var lastName = capitalizeFirstLetter(document.getElementById(\"lastName\").value);\r\n");
      out.write("            addUserToList(firstName, lastName);\r\n");
      out.write("            storeUser(firstName, lastName);\r\n");
      out.write("            window.location.href = `answer.jsp?firstName=");
      out.write("${firstName}");
      out.write("&lastName=");
      out.write("${lastName}");
      out.write("`;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function capitalizeFirstLetter(name) {\r\n");
      out.write("            return name.charAt(0).toUpperCase() + name.slice(1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function addUserToList(firstName, lastName) {\r\n");
      out.write("            const userList = document.getElementById(\"userList\");\r\n");
      out.write("            const listItem = document.createElement(\"li\");\r\n");
      out.write("            listItem.textContent = `");
      out.write("${firstName}");
      out.write(' ');
      out.write("${lastName}");
      out.write("`;\r\n");
      out.write("            userList.appendChild(listItem);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function storeUser(firstName, lastName) {\r\n");
      out.write("            // Retrieve existing users from sessionStorage\r\n");
      out.write("            const storedUsers = sessionStorage.getItem(\"users\");\r\n");
      out.write("            const users = storedUsers ? JSON.parse(storedUsers) : [];\r\n");
      out.write("\r\n");
      out.write("            // Check if the user already exists\r\n");
      out.write("            const userExists = users.some(user => user.firstName === firstName && user.lastName === lastName);\r\n");
      out.write("\r\n");
      out.write("            if (!userExists) {\r\n");
      out.write("                // Add the user to the array\r\n");
      out.write("                users.push({ firstName, lastName });\r\n");
      out.write("\r\n");
      out.write("                // Save the updated users to sessionStorage\r\n");
      out.write("                sessionStorage.setItem(\"users\", JSON.stringify(users));\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        loadUserList();\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
