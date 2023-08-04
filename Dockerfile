# define base docker image
FROM openjdk:11
LABEL maintainer="nikhil.net"
ADD target/docker-example-0.0.1-SNAPSHOT.jar docker-example.jar
ENTRYPOINT ["java", "-jar", "docker-example.jar"]
HEALTHCHECK --interval=5s \
            --timeout=5s \
            CMD curl -f http://127.0.0.1:8000 || exit 1
EXPOSE 8000