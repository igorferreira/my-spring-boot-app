# My Spring Boot Application

This is a simple Spring Boot 3 application that demonstrates how to create a RESTful web service with a single endpoint.

## Project Structure

```
my-spring-boot-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── myapp
│   │   │               ├── MySpringBootApplication.java
│   │   │               └── controller
│   │   │                   └── HelloController.java
│   │   └── resources
│   │       ├── application.properties
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── myapp
│       │               └── MySpringBootApplicationTests.java
│       └── resources
├── .mvn
│   └── wrapper
│       ├── maven-wrapper.jar
│       └── maven-wrapper.properties
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven

### Running the Application

1. Clone the repository:
   ```
   git clone <repository-url>
   cd my-spring-boot-app
   ```

2. Build the project:
   ```
   ./mvnw clean install
   ```

3. Run the application:
   ```
   ./mvnw spring-boot:run
   ```

4. Access the endpoint:
   Open your browser and navigate to `http://localhost:8080/hello` to see the greeting message.

### Running the Application Once

To run the application, access the endpoint, and then exit, use the following command:
```
make run-once
```

This command will start the application, wait for 10 seconds to ensure the server is running, make a request to the `/hello` endpoint, and then stop the application.

## Endpoints

- `GET /hello`: Returns a simple greeting message.

## Testing

To run the tests, use the following command:
```
./mvnw test
```

## License

This project is licensed under the MIT License.