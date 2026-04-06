Employee Management System (Backend)
This is a RESTful API built using Spring Boot to manage employee records. It provides endpoints to perform CRUD operations and interacts with a MySQL database.
🚀 Tech Stack
->Java: 25 
->Framework: Spring Boot 3.5 
->Database: MySQL 9.4 
->Build Tool: Maven 
->Persistence: Spring Data JPA / Hibernate 
🛠️ PrerequisitesBefore running the application, ensure you have the following installed:
->JDK 25 or higher. 
->MySQL Server 9.4 running as a service named MySQL94. 
->Maven (or use the provided ./mvnw wrapper). 
⚙️ Setup & Installation1. 
Database Configuration: 
Create the database in your MySQL instance: SQLCREATE DATABASE IF NOT EXISTS em_system;
Ensure your src/main/resources/application.properties matches your local MySQL credentials: Propertiesspring.datasource.url=jdbc:mysql://localhost:3306/em_system
spring.datasource.username=root
spring.datasource.password=Amaan@123
2. Running the ApplicationOpen your terminal in the project root and run: Bash./mvnw spring-boot:run
The server will start on port 9090. 
🔌 API EndpointsMethodEndpointDescriptionGET/employees
Retrieve all employees POST/employeesAdd a new employee GET/employees/{id}
Get employee by ID PUT/employees/{id}
Update employee details DELETE/employees/{id}
Remove an employee
