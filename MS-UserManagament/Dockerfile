FROM openjdk
EXPOSE 8088
ADD /target/MS-UserManagament-0.0.1-SNAPSHOT.jar user-docker.jar
ENTRYPOINT ["java","-jar","user-docker.jar"]