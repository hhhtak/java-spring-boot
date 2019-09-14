FROM adoptopenjdk/openjdk11:alpine

ENV LANG C.UTF-8

RUN mkdir /app
WORKDIR /app

ENV JAR_TARGET "thymeleaf-0.0.1.jar"

#EXPOSE 3002

ENTRYPOINT ["sh","-c","java -jar -Dspring.profiles.active=docker build/libs/${JAR_TARGET}"]
