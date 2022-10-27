## Run Spring Project

### Install dependencies
To install the dependencies use the command in terminal:
```
mvn install
```

### Run
To run the project use the command in terminal:
```
cd tacocloud
```
```
mvn spring-boot:run
```

### Test
To run tests use the command in terminal:
```
mvn test
```

## Setup ActiveMQ Artemis

### Create a new broker `broker-sia`
```
cd path-to-artemis/apache-artemis-x.xx.x/bin
```
```
./artemis create broker-sia --user=tacoweb --password=letm31n --port=61616
```

### Start broker service
```
cd broker-sia/bin
```
```
./artemis-service install
```
```
./artemis-service start
```
