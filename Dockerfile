FROM openjdk:8
LABEL maintainer="birlasoft"
VOLUME /tmp
EXPOSE 8080
ADD target/docker-jenkins.jar docker-jenkins.jar
ENTRYPOINT ["java","-jar","/docker-jenkins.jar"]