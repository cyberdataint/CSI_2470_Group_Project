# CSI 2470 Project 

![Having Fun!](./jakarta_tomcat_5.0.25/webapps/ROOT/test1.jpg)

# Directory

- [Directory](#directory)
- [Prerequisites](#prerequisites)
- [How to Run Apache Tomcat](#how_to_run_apache_tomcat)
- [How to Stop the Server](#how_to_stop_the_server)
- [To View Your Local Host](#to_view_your_local_host_please_copy_and_paste_the_following_in_chrome_or_edge)
- [What Needs to Get Done for Readme](#what_needs_to_get_done)
- [Description of the Overall Program Design](#1._description_of_the_overall_program_design)
- [Logical Flow Diagram (UML)](#2._logical_flow_diagram_uml)
- [Logical Flow Diagrams for Methods, Functions, and Procedures](#3._logical_flow_diagrams_for_methods_functions_and_procedures)
- [Files/Database Section](#4._filesdatabase_section)
- [Compile/Execution Section](#5._compileexecution_section)
- [Test Cases Section](#6._test_cases_section)
- [Screenshots of Execution Sessions](#7._screenshots_of_execution_sessions)


# Prerequisites

## 1. Install JDK 1.5
You'll need Java Development Kit (JDK) version 1.5.0_22 or a compatible version (I used the first .exe installer). You can download it from the [Java SE 5 Archive](https://www.oracle.com/java/technologies/java-archive-javase5-downloads.html).

## Clone Github Repository 
**Note:** The file must be cloned to the C:\ drive.
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


### 1. Description of the Overall Program Design

#### Purpose:
This section offers a verbal overview of the project's functionality, outlining the core processes and system behavior. Additionally, it discusses potential improvements and extensions, providing insight into the source code's structure and interrelationships.

### 2. Logical Flow Diagram (UML)

#### Purpose:
A Unified Modeling Language (UML) diagram illustrates the logical flow structure of the software. This high-level diagram provides an overview of the system's components and their interactions.

### 3. Logical Flow Diagrams for Methods, Functions, and Procedures

#### Purpose:
Individual UML diagrams are included for each method, function, and procedure defined in the software. These diagrams offer a detailed look at the internal logic and flow of each component.

### 4. Files/Database Section

#### Purpose:
This section describes the input files and/or databases used to test the application. It includes information on files containing valid and invalid data, aiding in the testing process.

### 5. Compile/Execution Section

#### Purpose:
This section provides detailed information on the compilation environment, steps to compile the code, and instructions for executing the program. Comprehensive information is included to facilitate smooth execution.

### 6. Test Cases Section

#### Purpose:
This section outlines the tests conducted on the program to ensure its correctness. It includes a description of successful test cases and highlights any known issues or scenarios where the program may not function correctly.

### 7. Screenshots of Execution Sessions

#### Purpose:
Visual representation is provided through screenshots of execution sessions, showcasing the program's behavior with both valid and invalid inputs. This offers a practical understanding of the software's performance.

## Conclusion

This documentation serves as a comprehensive guide, enabling users to understand, test, and execute the program effectively. Feedback and contributions are welcomed for continuous improvement.
