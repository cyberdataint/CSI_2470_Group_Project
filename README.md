# Dirctory 
 - [Dirctory](#Dirctory)
 - [Prerequisites](#Prerequisites)
 - [How to run Apache Tomcat](#How_to_Run_Apache_tomcat)
 - [How to Stop the Server](#How_to_Stop_the_Server)
 - [To view your local host](#To_view_your_local_host_please_copy_and_paste_the_following_in_Chrome_or_Edge)
 - [What needs to get done for Readme](#What_Needs_To_get_Done) 

# Prerequisites
### 1. Install JDK 1.5
You'll need Java Development Kit (JDK) version 1.5.0_22 or a compatible version. You can download it from the [Java SE 5 Archive](https://www.oracle.com/java/technologies/java-archive-javase5-downloads.html).


### Clone Github Repository 


~~~sh
git clone https://github.com/cyberdataint/CSI_2470_Group_Project.git
~~~


### 2. Set Environment Variables

### Configure CATALINA_HOME:
Open a Command Prompt and run the following command, replacing **C:\path\to\tomcat** with your Apache Tomcat installation 


~~~sh
set CATALINA_HOME=C:\Path**\To**\CSI_2470_Group_Project\jakarta_tomcat_5.0.25
~~~


### Set JAVA_HOME:

Similarly, set the JAVA_HOME environment variable to your JDK installation directory. Here's an example:


~~~sh
set JAVA_HOME=C:\Program Files\Java\jdk1.5.0_22
~~~


### How_to_Run_Apache_Tomcat


To start the Apache Tomcat server, open a Command Prompt and execute the following command:


~~~
%CATALINA_HOME%\bin\startup.bat
~~~


### How_to_Stop_the_Server
To gracefully shut down the Apache Tomcat server, open a Command Prompt and execute the following command:


~~~
%CATALINA_HOME%\bin\shutdown.bat
~~~


With these steps, you should be able to set up and run Apache Tomcat using JDK 1.5.0_22 on your Windows system.

### To_view_your_local_host_please_copy_and_paste_the_following_in_Chrome_or_Edge 


~~~
http://localhost:8082/
~~~



# What_Needs_To_get_Done 


Description of the overall program design, a verbal description of "how it works" including the basics of what the system is doing. Also describe possible improvements and extensions to your programs (and sketch how they might be made).
The contents and interrelationship of your source code files.
-
A logical flow diagram in the unified modeling language (UML) to describe the logical flow structure of the software.
-
A logical flow diagram for every method, functions, and procedures defined in the software.
-
Files/Database Section Description of any input files and/or database to test the application. (a file with valid data and a file with invalid data)
-
Compile/Execution Section, which briefly provides information about compiling environment, compiling steps, execution instructions etc. You are encouraged to provide as much detailed information as you think might help to run your code.
-
Test Cases Section, which:
Describes the tests you have run on your program to convince yourself that it is indeed correct.
Also describe any cases for which your program is known not to work correctly.
-
Includes screenshots of execution sessions processing valid inputs and invalid inputs
