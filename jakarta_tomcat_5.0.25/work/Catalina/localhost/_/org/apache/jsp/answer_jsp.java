package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class answer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Answers - CSI Group Project</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background-color: #007bff;\r\n");
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
      out.write("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("        h1 {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-size: 36px;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"text\"] {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin: 10px 0;\r\n");
      out.write("            border: 2px solid #007bff;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        button {\r\n");
      out.write("            background-color: #007bff;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            border: none;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        button:hover {\r\n");
      out.write("            background-color: #0056b3;\r\n");
      out.write("        }\r\n");
      out.write("        .hidden {\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("        #answerSection {\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h1>CSI Group Project</h1>\r\n");
      out.write("    <div class=\"container\" id=\"answerContainer\" class=\"hidden\">\r\n");
      out.write("        <p>Welcome, <span id=\"userName\"></span>! Choose your answer:</p>\r\n");
      out.write("        <button onclick=\"addAnswer('Yes')\">Yes</button>\r\n");
      out.write("        <button onclick=\"addAnswer('No')\">No</button>\r\n");
      out.write("        <button onclick=\"addAnswer('Don\\'t Care')\">Don't Care</button>\r\n");
      out.write("        <button onclick=\"toggleAnswersDisplay()\">Toggle Answers</button>\r\n");
      out.write("\r\n");
      out.write("        <!-- Back button to return to login.jsp -->\r\n");
      out.write("        <a href=\"login.jsp\"><button onclick=\"loadUserList()\">Back</button></a>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"answerSection\" class=\"hidden\">\r\n");
      out.write("            <h2>Answer Counts for <span id=\"userFullName\"></span>:</h2>\r\n");
      out.write("            <p>Yes: <span id=\"yesCount\">0</span></p>\r\n");
      out.write("            <p>No: <span id=\"noCount\">0</span></p>\r\n");
      out.write("            <p>Don't Care: <span id=\"dontCareCount\">0</span></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        // Initialize answers array with stored answers\r\n");
      out.write("        let answers = JSON.parse(sessionStorage.getItem(\"answers\")) || [];\r\n");
      out.write("\r\n");
      out.write("        function getUserName() {\r\n");
      out.write("            const urlParams = new URLSearchParams(window.location.search);\r\n");
      out.write("            const firstName = urlParams.get('firstName');\r\n");
      out.write("            const lastName = urlParams.get('lastName');\r\n");
      out.write("            return `");
      out.write("${firstName}");
      out.write(' ');
      out.write("${lastName}");
      out.write("`;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function loadUserList() {\r\n");
      out.write("            // Load existing users from sessionStorage\r\n");
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
      out.write("        function updateAnswerCounts() {\r\n");
      out.write("            const userName = getUserName();\r\n");
      out.write("            const userAnswers = answers.filter(answer => answer.userName === userName);\r\n");
      out.write("            const yesCount = userAnswers.filter(answer => answer.answer === \"Yes\").length;\r\n");
      out.write("            const noCount = userAnswers.filter(answer => answer.answer === \"No\").length;\r\n");
      out.write("            const dontCareCount = userAnswers\r\n");
      out.write("                .filter(answer => answer.answer === \"Don't Care\").length;\r\n");
      out.write("\r\n");
      out.write("            document.getElementById(\"yesCount\").textContent = yesCount;\r\n");
      out.write("            document.getElementById(\"noCount\").textContent = noCount;\r\n");
      out.write("            document.getElementById(\"dontCareCount\").textContent = dontCareCount;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function toggleAnswersDisplay() {\r\n");
      out.write("            var answerSection = document.getElementById(\"answerSection\");\r\n");
      out.write("            answerSection.classList.toggle(\"hidden\");\r\n");
      out.write("            updateAnswerCounts();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function addAnswer(answer) {\r\n");
      out.write("            const userName = getUserName();\r\n");
      out.write("            \r\n");
      out.write("            // Add the answer to the global answers array\r\n");
      out.write("            answers.push({ userName: userName, answer: answer });\r\n");
      out.write("\r\n");
      out.write("            // Save the answers to localStorage\r\n");
      out.write("            sessionStorage.setItem(\"answers\", JSON.stringify(answers));\r\n");
      out.write("\r\n");
      out.write("            updateAnswerCounts();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        document.getElementById(\"userName\").textContent = getUserName();\r\n");
      out.write("        document.getElementById(\"userFullName\").textContent = getUserName();\r\n");
      out.write("        updateAnswerCounts();\r\n");
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
