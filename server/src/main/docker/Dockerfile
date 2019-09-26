FROM openjdk:8-jre-alpine
MAINTAINER joris.lefever.dev@gmail.com
VOLUME /tmp
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

##  docker build --build-args=build/libs/* -t hh-library