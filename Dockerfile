FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/restapinio*.jar restapinio.jar
ENTRYPOINT ["java","-jar","/restapinio.jar"]
