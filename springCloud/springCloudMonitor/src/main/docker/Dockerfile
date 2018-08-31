FROM java:8
ADD /monitor-0.0.1-SNAPSHOT.jar //
EXPOSE 9999
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/monitor-0.0.1-SNAPSHOT.jar"]
