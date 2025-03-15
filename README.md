# Employee Management Application

## Overview
This is a **Spring Boot MVC** application for managing employees, built with **Thymeleaf** for the frontend and **Bootstrap** for styling. The application allows users to perform CRUD operations on employees.

## Features
- View all employees
- Add a new employee
- Edit an existing employee
- Delete an employee

## Technologies Used
- **Spring Boot**
- **Spring MVC**
- **Thymeleaf**
- **Bootstrap**
- **Spring Data JPA**
- **H2 Database (or MySQL, as configured)**

## Installation and Setup

### 1. Clone the repository
```sh
git clone https://github.com/GaneshRagolu001/Employee-Management.git
cd Employee-Management
```

### 2. Configure the Database
By default, the application uses an **H2 in-memory database**. To use **MySQL**, update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run the Application
```sh
mvn spring-boot:run
```
Or
```sh
./mvnw spring-boot:run
```

### 4. Access the Application
Open your browser and go to:
```
http://localhost:8080/employees/list
```

## Project Structure
```
src
│── main
│   ├── java/com/luv2code/springboot/employeemanagement
│   │   ├── controller/EmployeeController.java
│   │   ├── entity/Employee.java
│   │   ├── service/EmployeeService.java
│   │   ├── repository/EmployeeRepository.java
│   ├── resources/templates/Employees
│   │   ├── list-employees.html
│   │   ├── register.html
│   ├── application.properties
│── test
│   ├── java/com/luv2code/springboot/employeemanagement/employeemanagementTests.java
```

## Screenshots
(You can add images of your application here)

## License
This project is licensed under the **MIT License**.

## Author
👤 **Ganesh Ragolu**  
🔗 [GitHub Profile](https://github.com/GaneshRagolu001)

 
