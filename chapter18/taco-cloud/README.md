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
```
docker run --name taco-cloud-container -p8080:8080 alisktl/tacocloud:1.0-SNAPSHOT
```

### Login to [docker.io](https://docker.io)
```
docker login
```

### Push to remote docker repository
```
docker push alisktl/tacocloud:1.0-SNAPSHOT
```

## Deploying the Application in Kubernetes
### Install Kubernetes using [kind](https://kind.sigs.k8s.io/)
```
go install sigs.k8s.io/kind@v0.17.0
```

### Create cluster
```
kind create cluster
```

### Apply Kubernetes deployment file
```
kubectl apply -f k8s-deploy.yaml
```

### Show all the pods, services, statefulsets
```
kubectl get all
```

### Port forwarding
```
kubectl port-forward pod/taco-cloud-deploy-5bb9f999cf-hl6ff 8080:8080
```

### Delete all deployment pods, services
```
kubectl delete --all deployments
```
