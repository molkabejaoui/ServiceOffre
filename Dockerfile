FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/service-offre-emploi-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 10000

ENTRYPOINT ["java", "-Dserver.port=10000", "-jar", "app.jar"]