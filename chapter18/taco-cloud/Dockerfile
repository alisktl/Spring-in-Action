# Start with a base image containing Java runtime
FROM openjdk:20-ea-17-jdk-slim as build

# The application's jar file
ARG JAR_FILE=tacocloud/target/*.jar

# Add the application's jar to the container
COPY ${JAR_FILE} app.jar

# Execute the application
ENTRYPOINT ["java","-jar","/app.jar"]