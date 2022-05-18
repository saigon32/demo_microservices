FROM adoptopenjdk/openjdk16:alpine
VOLUME /tmp
ADD ./build/libs/demo-micro-java-docker-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Duser.timezone=America/Bogota","-jar","/app.jar"]