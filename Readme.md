# Mercans Test Assignment
Project properties:
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding> 
<maven.compiler.target>21</maven.compiler.target> 
<maven.compiler.source>21</maven.compiler.source> 
<junit.version>5.10.0</junit.version> 
<aspectj.version>1.9.19</aspectj.version> 
<allure.version>2.24.0</allure.version> 
<rest-assured>5.4.0</rest-assured> 

How to run:
1. Clone project to Your device
2. Open Maven -> Lifecycle -> Clean
3. Run Tests in LoginAndLogout class
4. Result will be in allure-results folder


| N | Test Case                              | Expected result       | Status |
|---|----------------------------------------|-----------------------|--------|
| 1 | Check login happy flow                 | Login successful      | Passed |
| 2 | Check login with incorrect credentials | User cannot login     | Passed |
| 3 | Open Leaves page                       | Leaves page is opened | Passed |
| 4 | Logout from the program                | User is logged out    | Passed |
