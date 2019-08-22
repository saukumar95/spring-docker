FROM openjdk:8
ADD target/spring-docker.jar spring-docker.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","spring-docker.jar"]