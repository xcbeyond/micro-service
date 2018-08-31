FROM java:8
ADD /config-center-0.0.1-SNAPSHOT.jar //
EXPOSE 8888
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/config-center-0.0.1-SNAPSHOT.jar"]
