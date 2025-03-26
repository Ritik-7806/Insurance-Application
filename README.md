This is a simple Spring Boot application that simulates an insurance purchase system.

### Endpoints

1. **GET /insurance**
   - Lists all available insurances.

2. **POST /insurance**
   - Purchase insurance by name.
  
3. **GET /insurance/download**
   - Download a dummy policy PDF after the purchase.

## Run the Application

1. Clone this repository.
2. Run the application using `mvn spring-boot:run` or through your IDE.

## Test Endpoints

- **Get All Insurances**
  ```bash
  curl -X GET http://localhost:9001/insurance or curl -X GET http://localhost:9001/public

## Swagger UI Integration

Swagger UI provides a beautiful and interactive documentation page for the API endpoints. You can easily test API endpoints, see request/response formats, and much more.
