# Dirctory 
 - [Dirctory] (Dirctory)
 - [prerequisites] (Prerequisites)


# Prerequisites
## 1. Install JDK 1.5
You'll need Java Development Kit (JDK) version 1.5.0_22 or a compatible version. You can download it from the Java SE 5 Archive.

## Clone Github Repository 

~~~sh
git clone https://github.com/cyberdataint/CSI_2470_Group_Project.git
~~~

## 2. Set Environment Variables
### Configure CATALINA_HOME:

Open a Command Prompt and run the following command, replacing **C:\path\to\tomcat** with your Apache Tomcat installation 


~~~sh
set CATALINA_HOME=C:\path\to\tomcat
~~~
## Set JAVA_HOME:

Similarly, set the JAVA_HOME environment variable to your JDK installation directory. Here's an example:

~~~sh
set JAVA_HOME=C:\Program Files\Java\jdk1.5.0_22
~~~
# How to Run Apache Tomcat

To start the Apache Tomcat server, open a Command Prompt and execute the following command:

~~~
%CATALINA_HOME%\bin\startup.bat
~~~

# How to Stop the Server
To gracefully shut down the Apache Tomcat server, open a Command Prompt and execute the following command:
~~~
%CATALINA_HOME%\bin\shutdown.bat
~~~
With these steps, you should be able to set up and run Apache Tomcat using JDK 1.5.0_22 on your Windows system.

# To view your local host please copy and paste the following in Chrome or Edge 

~~~
http://localhost:8082/
~~~

