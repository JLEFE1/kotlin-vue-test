FROM openjdk:8-jre-alpine
MAINTAINER joris.lefever.dev@gmail.com
VOLUME /tmp
COPY build/libs/*.jar app.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","/app.jar"]