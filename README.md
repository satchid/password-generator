# Read Me First
This is a sample project to demonstrate how to build a Restful WebService using Spring Boot MVC framework.


### Getting Started
Download the project and execute 

`mvn:spring-boot:run`

This will start Tomcat on localhost 8080 port. 

In order to change port number, you can modify the application.properties file in resources.

### Usage
Open a browser and navigate to:

`http://localhost:8080/getPassword `

This generates a random password with default length 8.

Other Examples:

`http://localhost:8080/getPassword?length=10`


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

