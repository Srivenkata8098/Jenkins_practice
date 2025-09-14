FROM eclipse-temurin:17-jdk-alpine
ARG JAR_FILE=target/ecommerce-app.war
COPY ${JAR_FILE} /app.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.war"]
