
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
