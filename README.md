# Spring-Thrift
Spring Boot + Thrift integration.

<h1>Build</h1>
  
To build the app go to thriftDemo and run this <br>
  `mvn clean install`

<br> To run lms project run this<br>
  `java -jar lms/target/lms-1.0-SNAPSHOT.jar`
  
<br> To run postpaid project run this<br>
  `java -jar lms/postpaid/postpaid-1.0-SNAPSHOT.jar`
  
  
<h1>  Test
  
  Below curl will give sample data
  <br> curl -X GET \
  http://localhost:8080/lms/postpaid/v1/account/123 -H 'cache-control: no-cache' -H 'postman-token: 38e7528d-1899-222c-2d24-ed44213f3010'
  
  
  <br> Below curl will throw exception
  <br> curl -X GET \
  http://localhost:8080/lms/postpaid/v1/account/1231 -H 'cache-control: no-cache' -H 'postman-token: 38e7528d-1899-222c-2d24-ed44213f3010'
