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

## Setup Docker Container

> **NOTE:** instead of my docker username `alisktl` use your docker username.

### Build an image
```
docker build . -t alisktl/tacocloud:1.0-SNAPSHOT
```

### Run container from image
docker run --name taco-cloud-container -p8080:8080 alisktl/tacocloud:1.0-SNAPSHOT

### Login to [docker.io](https://docker.io)
docker login

### Push to remote docker repository
docker push alisktl/tacocloud:1.0-SNAPSHOT
