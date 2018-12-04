# Usage: FROM [image name]
FROM java:8
# Usage: MAINTAINER [name]
MAINTAINER yanyu
VOLUME /tmp
ADD spring-boot-train-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
# Usage: EXPOSE [port]
EXPOSE 8080
