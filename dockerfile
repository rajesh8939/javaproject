# Use Maven to build the project
FROM maven:3.8.3-openjdk-17 as build
WORKDIR /app
COPY pom.xml /app/pom.xml
COPY src /app/src
RUN mvn package

# Use an OpenJDK runtime to run the application
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/guess-the-number-game-1.0-SNAPSHOT-jar-with-dependencies.jar /app/app.jar
CMD ["java", "-jar", "app.jar"]

EXPOSE 8080

