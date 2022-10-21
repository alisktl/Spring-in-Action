## Configuration

### Set active profile
We have two ways of setting active profile:

1. set environment variable
```
export SPRING_PROFILES_ACTIVE=dev
```
or
```
export SPRING_PROFILES_ACTIVE=prod
```
2. add into `application.yml`
```
spring:
  profiles:
    active: dev # or prod
```

In the app I set active profile as an environment variable

### SSL Certificate
To generate an SSL Certificate
```
keytool -keystore /path/to/ssl_certificate/mykeys.jks -genkey -alias tomcat -keyalg RSA
```
There may be an error opening the app in a browser due to `Not valid certificate`, to overcome the issue simply click anywhere on the denial page and type `thisisunsafe`.

## Run Spring Project

### Install dependencies
To install the dependencies use the command in terminal:
```
mvn install
```

### Run
To run the project use the command in terminal:
```
mvn spring-boot:run
```

### Test
To run tests use the command in terminal:
```
mvn test
```
