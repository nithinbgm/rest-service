# RESTful Web Service Project

## Overview
This project demonstrates a simple RESTful web service built using **Java Spring Boot**. It allows users to manage employee data through HTTP endpoints. The project supports functionalities for retrieving and adding employee records.

---

## Features

### Endpoints
1. **GET /employees**
   - Retrieves the list of all employees.
   - Response Example (JSON):
     ```json
     [
       {
         "employeeId": 1,
         "firstName": "John",
         "lastName": "Doe",
         "email": "john.doe@example.com",
         "title": "Software Engineer"
       },
       {
         "employeeId": 2,
         "firstName": "Jane",
         "lastName": "Smith",
         "email": "jane.smith@example.com",
         "title": "Product Manager"
       }
     ]
     ```

2. **POST /employees**
   - Adds a new employee to the list.
   - Request Example (JSON):
     ```json
     {
       "employeeId": 3,
       "firstName": "Alice",
       "lastName": "Johnson",
       "email": "alice.johnson@example.com",
       "title": "UX Designer"
     }
     ```

---

## Project Structure
- **Employee.java**: Defines the `Employee` class with properties like `employeeId`, `firstName`, `lastName`, `email`, and `title`.
- **Employees.java**: Maintains a list of employees and provides methods to get and set employee data.
- **EmployeeManager.java**: Initializes the application with some example employees.
- **EmployeeController.java**: Contains the RESTful endpoints to handle HTTP GET and POST requests.
- **RestServiceApplication.java**: The main application class to run the Spring Boot application.

---

## Setup Instructions

### Prerequisites
- Java 17 or higher
- Maven 3.8+
- An IDE (e.g., IntelliJ IDEA) or a terminal to run the application

### Steps to Run
1. Clone the repository or download the project zip file.
2. Navigate to the project directory in the terminal.
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Open your browser or API testing tool (e.g., Postman or Talend API Tester) and access:
   - `http://localhost:8080/employees` for GET requests.
   - `http://localhost:8080/employees` for POST requests with JSON payloads.

---

## Testing
### Using Talend API Tester or Postman:
1. **GET Request**:
   - URL: `http://localhost:8080/employees`
   - Method: GET

2. **POST Request**:
   - URL: `http://localhost:8080/employees`
   - Method: POST
   - Body (JSON):
     ```json
     {
       "employeeId": 4,
       "firstName": "Bob",
       "lastName": "Brown",
       "email": "bob.brown@example.com",
       "title": "Data Scientist"
     }
     ```

---

## License
This project is open-source and can be modified or distributed under the terms of the [MIT License](LICENSE).

---

## Contact
For any questions or support, please reach out:
- Email: [your.email@example.com](mailto:nithinmamidi1423@gmail.com)
- LinkedIn: [www.linkedin.com/in/nithin-goud-mamidi-941025230](#)

