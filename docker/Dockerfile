FROM maven:3.9.5-eclipse-temurin-21 AS build

WORKDIR /build

COPY . .

RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY --from=build ./build/target/*.jar ./docker.jar

ENTRYPOINT java -jar docker.jar