FROM java:8

VOLUME /tmp
ADD target/docker-project-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080

RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
