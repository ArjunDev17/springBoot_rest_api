# Spring Core Project - Annotation and XML Configuration

This is a Spring Core project that demonstrates the usage of separate configuration files, annotation-based configuration, and XML-based configuration.

## Project Structure

The project is organized as follows:

- **`src/main/java/com/example/service`**: Contains service classes.
- **`src/main/java/com/example/config`**: Contains separate configuration classes.
- **`src/main/resources/spring-config.xml`**: XML configuration file.

## Configuration Styles

### Annotation-Based Configuration

The annotation-based configuration is utilized through separate configuration classes in the `com.example.config` package. Check the `AnnotationConfig` class for an example.

### XML-Based Configuration

The XML-based configuration is defined in the `spring-config.xml` file located in the `src/main/resources` directory.

## Using Spring without Spring Boot

This project is a Maven project created using the archetype `quickstart` for simplicity. To use Spring without Spring Boot, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/ArjunDev17/springBoot_rest_api.git
