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

## Setup RabbitMQ

### Install RabbitMQ as a Docker container
Inatall RabbitMQ with username `guest` and password `guest`, and with open ports:
1. port 15672 - for RabbitMQ UI management
2. port 5672 - for listening
```
docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management
```

### Create an exchange
Open [RabbitMQ Management](http://localhost:15672) and create new exchange `tacocloud.order` with `topic` type.

### Create a queue
In [RabbitMQ Management](http://localhost:15672) create new queue `tacocloud.order.queue_1` with `Classic` type.

### Binding the queue with the exchange
In [RabbitMQ Management](http://localhost:15672) open newly created queue `tacocloud.order.queue_1` and bind it with the echange `tacocloud.order` with routing-key `tacocloud.order.queue`.

## Setup Apache Kafka
### Install Apache Kafka
You can install the Apacha Kafka using this [quickstart](https://kafka.apache.org/quickstart)

### Run topic `tacocloud.orders.topic` listener
```
bin/kafka-console-consumer.sh --topic tacocloud.orders.topic --from-beginning --bootstrap-server localhost:9092
```

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
