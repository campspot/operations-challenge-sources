# Operations Challenge Sources

This project contains two application servers and some static files.

## Static files
These files live in `/client`.

## NodeJS Server
This is an express service that lives in `/node`.

### Prerequisites
 * NodeJS version 4.2
 * NPM
 
### Preparation
 * To install dependencies for the NodeJS app, you need to run `npm install`
 
### Running
 * To run the NodeJS app, you need to run `npm start`
 
 
## Java Server
This is an Dropwizard service that lives in `/java`.

### Prerequisites
 * Java 1.8
 * Maven 3
 
### Preparation
 * To install dependencies for the Java app and compile it, you need to run `mvn package`
 
### Running
 * To run the NodeJS app, you need to run `java -jar target/simple-java-server-1.0.0.jar server config.yml`
