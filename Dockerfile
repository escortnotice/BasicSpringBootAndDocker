## To deploy a java jar file to a container
# url for the app - http://localhost:8085/rest/docker/hello
FROM openjdk:8
WORKDIR /usr/src/app
COPY target/docker-spring-boot.jar docker-spring-boot.jar
CMD ["java", "-jar", "docker-spring-boot.jar"]