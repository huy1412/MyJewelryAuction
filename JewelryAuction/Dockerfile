FROM openjdk:17-jdk0alpine
ARG JAR_FILE=target/*.jar
COPY ./target/SpringAPI-0.0.1.jar app.jar
LABEL authors="TO QUYNH"

ENTRYPOINT ["java", "-jar","/app.jar"]