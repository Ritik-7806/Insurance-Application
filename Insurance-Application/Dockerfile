# Use OpenJDK 17 as the base image
FROM openjdk:21

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target folder of your project
COPY target/InsuranceApplication.jar /app/InsuranceApplication.jar

# Expose the port your Spring Boot app will run on
EXPOSE 9001

# Command to run your Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/InsuranceApplication.jar"]
