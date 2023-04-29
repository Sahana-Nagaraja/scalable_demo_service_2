FROM eclipse-temurin:17-jdk-alpine

COPY target/demo_service_2-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar" ]