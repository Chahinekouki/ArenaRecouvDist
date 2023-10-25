FROM openjdk
EXPOSE 8082
ADD /target/Candidate-0.0.1-SNAPSHOT.jar Candidate-docker.jar
ENTRYPOINT ["java","-jar","Candidate-docker.jar"]