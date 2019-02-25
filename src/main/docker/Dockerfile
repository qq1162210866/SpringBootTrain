# Usage: FROM [image name]
#fabric8/java-jboss-openjdk8-jdk
FROM openjdk:8-jre-alpine
# Usage: MAINTAINER [name]
MAINTAINER yanyu
VOLUME /tmp
ADD spring-boot-train-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
# Usage: EXPOSE [port]
EXPOSE 8080
