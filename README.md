Prerequisites
1. Install JDK 1.5
You'll need Java Development Kit (JDK) version 1.5.0_22 or a compatible version. You can download it from the Java SE 5 Archive.

2. Set Environment Variables
Configure CATALINA_HOME:

Open a Command Prompt and run the following command, replacing C:\path\to\tomcat with your Apache Tomcat installation directory:

shell
Copy code
set CATALINA_HOME=C:\path\to\tomcat
Set JAVA_HOME:

Similarly, set the JAVA_HOME environment variable to your JDK installation directory. Here's an example:

shell
Copy code
set JAVA_HOME=C:\Program Files\Java\jdk1.5.0_22
How to Run Apache Tomcat
To start the Apache Tomcat server, open a Command Prompt and execute the following command:

shell
Copy code
%CATALINA_HOME%\bin\startup.bat
How to Stop the Server
To gracefully shut down the Apache Tomcat server, open a Command Prompt and execute the following command:

shell
Copy code
%CATALINA_HOME%\bin\shutdown.bat
With these steps, you should be able to set up and run Apache Tomcat using JDK 1.5.0_22 on your Windows system.
