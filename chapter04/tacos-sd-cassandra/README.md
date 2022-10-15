## Install Cassandra
### Create a new network:
```
docker network create cassandra-net
```

### Run Cassandra
Creates Cassandra image with latest Cassandra version. Starts the single-node cluster and exposes the node’s port (9042) on the host machine so that your application can access it.
```
docker run --name my-cassandra \
           --network cassandra-net \
           -p 9042:9042 \
           -d cassandra:latest
```

## Create keyspace
### Start the CQL shell
```
docker run -it --network cassandra-net --rm cassandra cqlsh my-cassandra
```

### Create keyspace `taco_cloud`
```
create keyspace taco_cloud
   ... with replication={'class':'SimpleStrategy', 'replication_factor':1}
   ... and durable_writes=true;
```
