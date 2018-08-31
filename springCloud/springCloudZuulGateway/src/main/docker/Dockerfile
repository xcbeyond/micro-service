FROM java:8
ADD /gateway-0.0.1-SNAPSHOT.jar //
EXPOSE 8111
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/gateway-0.0.1-SNAPSHOT.jar"]
