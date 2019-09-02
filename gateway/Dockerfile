# use alpine as base image
FROM adoptopenjdk/openjdk11:alpine

# recommended by spring boot
VOLUME /tmp

# create directory for application
RUN mkdir /app
WORKDIR /app

# jar target
ENV JAR_TARGET "gs-gateway-0.1.0.jar"

# set entrypoint to execute spring boot application
ENTRYPOINT ["sh","-c","java -jar -Dspring.profiles.active=docker build/libs/${JAR_TARGET}"]