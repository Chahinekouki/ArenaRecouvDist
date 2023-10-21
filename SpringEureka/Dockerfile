FROM openjdk
EXPOSE 8761
ADD /target/SpringEureka-0.0.1-SNAPSHOT.jar eureka-docker.jar
ENTRYPOINT ["java","-jar","eureka-docker.jar"]