# CDI beans tested with Arquillian
Demonstration of Arquillian testing made on [javacodegeeks example](http://www.javacodegeeks.com/2013/06/java-ee-cdi-programmatic-dependency-disambiguation-example-injection-point-inspection.html) : usage of @Produces (javax.enterprise.inject.Produces).

## Prepare
Project depends on java (JDK 7), maven and proper internet access ;).

Quick prepare :
- download and unpack 
- browse to project folder
- $ mvn clean install

## Run

### Testing with Arquillian

- mvn clean test
- inspect ./target/surefire-reports

OR

- open in your IDE [GreeterHelloTest.java]() and run as JUnit test

### Manual Testing

- mvn clean install jboss-as:run
- open http://localhost:8080/cdi-arquillian + sayHello

## Details

Tested on :

Ubuntu 14.04.1

Apache Maven 3.0.5

Java version: 1.7.0_72

