FROM java:8
ADD /register-center-0.0.1-SNAPSHOT.jar //
EXPOSE 8761
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/register-center-0.0.1-SNAPSHOT.jar"]
