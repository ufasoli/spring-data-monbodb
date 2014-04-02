spring-data-monbodb
===================

A sample application built progresively to demonstrate some of the following concepts :

  * Spring Data JPA
  * Spring Data MongoDB
  * Spring Data & QueryDSL
  * Spring Data REST
  * Spring Data Cross-store
  
This application uses Spring-boot with it's appropriate starter modules.

The app consists of 6 branches (demo-1 to demo-6) each branch adding some extra functionality to the project.

In order to run the application just checkout a branch (demo-1 to demo-6) and issue the following command :

  mvn spring-boot:run
  
  
This will start and embedded tomcat server running on port 8080.





Please note that starting from demo-2 you will need a MongoDB instance running on your local machine for 
the application to run, the embedded database and data source for the JPA section will be automatically 
created for you by spring upon compilation.
