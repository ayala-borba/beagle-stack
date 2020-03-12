FROM adoptopenjdk/openjdk11:alpine-jre

ENV LANG C.UTF-8

COPY target/stack-demo.jar /app/app.jar

CMD java -jar /app/app.jar $APP_OPTIONS
