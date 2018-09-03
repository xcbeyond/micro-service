FROM java:8
ADD /service-provider-0.0.1-SNAPSHOT.jar //
EXPOSE 8001
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/service-provider-0.0.1-SNAPSHOT.jar"]
