FROM amazoncorretto:11-alpine-jdk
MAINTAINER Jyothi
COPY target/hello-service-*.jar hello-service.jar
ENTRYPOINT ["java","-jar","/hello-service.jar"]