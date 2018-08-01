FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} employee-service-sample.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/employee-service-sample.jar"]
EXPOSE 8082