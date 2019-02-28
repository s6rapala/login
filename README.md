# Hashing 
Hashing using BCryptPasswordEncoder

 BCryptPasswordEncoder uses BCrypt which is a strong hashing function. The code illustrates the same and it is a simple tutorial on regsistration and authentication using springframework various moules and springboot. The project runs well when used in Eclipse environment. Import the project as a maven project. In the folder where pom.xml is contained, it is a must to run the following command.
 
 In the case of CLI
 ----------------------------
 $mvn install spring-boot:run
 
 Place the generated war file in webapps directory in TomCat Server installed location.
 Start the tomcat server and use the endpoints.
 
 In the case of Eclipse IDE
 ------------------------------
 Right click on the project > Run As > Configurations > Create new maven build using + sign> goals > clean spring-boot:run
 Then click the run button. 
 Hit localhost:8080/welcome
 


End points of the API
------------------------------
1. POST /registration
2. GET /login
3. GET /welcome

# Troubleshooting
Use java source +8
