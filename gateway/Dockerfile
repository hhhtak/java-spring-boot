# use alpine as base image
FROM openjdk:11

RUN apt-get update
#RUN apt-get -y install x86_64-alpine-jdk-11.0.4_11
ENV JAVA_HOME "/usr/lib/jvm/java11"

# recommended by spring boot
VOLUME /tmp

# create directory for application
RUN mkdir /app
WORKDIR /app

# jar target
ENV JAR_TARGET "demo-0.0.1-SNAPSHOT.jar"

# set entrypoint to execute spring boot application
ENTRYPOINT ["sh","-c","java -jar -Dspring.profiles.active=docker build/libs/${JAR_TARGET}"]