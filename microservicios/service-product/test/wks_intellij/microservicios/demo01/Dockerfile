FROM adoptopenjdk/openjdk16:alpine
EXPOSE 8085
VOLUME /tmp
ADD ./build/libs/demo01-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Duser.timezone=America/Bogota","-jar","/app.jar"]