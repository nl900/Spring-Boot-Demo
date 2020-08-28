## Spring-Boot-Demo </br>
~~~text
Docker Compose for Spring Boot application with PostgreSQL. The app has actuator endpoints enabled.
~~~
***To run*** <br/>
Create an Executable Jar<br/>
```shell
$ mvn package
```

Unpack the fat jar so dependencies and application resources are separate into layers so that most frequently changing resources, the class and static resources, are layered after.
```shell
$ mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
```
Run with Docker Compose
```shell
$ docker-compose build && docker-compose up
```
Verify the application is running at http://localhost:8080
