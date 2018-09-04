FROM java:8
ADD /zipkin-0.0.1-SNAPSHOT.jar //
EXPOSE 8020
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/zikpin-0.0.1-SNAPSHOT.jar"]
