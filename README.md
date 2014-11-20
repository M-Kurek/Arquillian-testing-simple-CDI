# CDI beans tested with Arquillian
Demonstration of Arquillian testing made over [javacodegeeks article](http://www.javacodegeeks.com/2013/06/java-ee-cdi-programmatic-dependency-disambiguation-example-injection-point-inspection.html) - example usage of @Produces (javax.enterprise.inject.Produces).

## Prepare
Project depends on java (JDK 6), maven and proper internet access ;).

## Run
- mvn clean install jboss-as:run
- open http://localhost:8080/cdibeans/sayHello

## Details

Tested on :

Ubuntu 14.04.1

Apache Maven 3.0.5

Java version: 1.7.0_72

