## Spring-Boot-Demo </br>

Docker Compose for Spring Boot application with PostgreSQL.

----

#### To run </br>
Create an Executable Jar<br/>
```shell
$ mvn package
```

Unpack the fat jar so dependencies and application resources are separate into layers so that most frequently changing resources, the class and static resources, are layered later.
```shell
$ mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
```
Run with Docker Compose
```shell
$ docker-compose up
```
Verify the application is running at http://localhost:8080 </br>

The healthcheck endpoint is at /actuator/health

-----
Stop containers
```shell
$ docker-compose down
```
