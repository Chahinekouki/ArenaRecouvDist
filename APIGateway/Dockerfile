FROM openjdk
EXPOSE 8762
ADD /target/APIGateway-0.0.1-SNAPSHOT.jar docker-api-gateway.jar
ENTRYPOINT ["java","-jar","docker-api-gateway.jar"]