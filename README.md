
"# sprng-boot" 

###### Spring Data JPA documentataion ##############
https://docs.spring.io/spring-data/jpa/docs/current/reference/html/

###### Application properties ##############
Application properties can be found at :
https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html

###### Application health ##############
To determine health of API add the actuator plug-in
In the application.proeprties file. set endpoints.sensitive=false. This is done in order to demo the health check links. In actual production environments, these needs to be turned to true.

All the applicable end points can be found at:
https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html
example:
http://localhost:9000/api/health
http://localhost:9000/api/metrics


##Using ssh to connect from windows and putty
https://www.youtube.com/watch?v=bi7ow5NGC-U
##Tutorials
https://www.digitalocean.com/community/tutorials


## the below section is for spring-rest project, but may be helpful here too ############
Endpoints used after hosting into AWS EC2
http://ec2-52-70-233-201.compute-1.amazonaws.com:8080/spring-rest/api/users
http://ec2-52-70-233-201.compute-1.amazonaws.com:8080/spring-rest/api/swagger-ui.html

In the above case, its running on port 8080(Tomcat server), but we should expose that. It should hide behind the nginx, so we need to do the configuration to do that.
In nginx folder, under sites-available, create a tomcat-conf(copy default and make changes). Create soft link in sites-enabled folder

http://ec2-52-70-233-201.compute-1.amazonaws.com/api/users
