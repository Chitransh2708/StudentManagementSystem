# Student Management System

A backend Student Management System** built using Java and Spring Boot that provides REST APIs to manage student records efficiently.

The project demonstrates the implementation of CRUD (Create, Read, Update, Delete) operations using Spring Boot, Spring Data JPA, Hibernate, and MySQL. It follows a layered architecture to maintain clean separation of responsibilities between the Controller, Service, Repository, DTO, and Entity layers.

🚀 Features

1.Create a new student
2.Get student details
3.Get all students
4.Update student information
5.Delete a student
6.RESTful API architecture
7.MySQL database integration
8.Spring Data JPA and Hibernate
9.DTO-based data transfer
10.Layered architecture
11.Input validation and exception handling

🛠️ Technologies Used

1. Java
2. Spring Boot
3. Spring Web
4. Spring Data JPA
5. Hibernate
6. MySQL
7. Maven
8. REST APIs

Project Architecture

The project follows a layered architecture:


Controller
    ↓
Service
    ↓
Repository
    ↓
Database


Additional layers:


DTO      → Data transfer between API and application layers
Entity   → Represents database tables

📌 Main Operations

| Operation        | HTTP Method | Description                |
| ---------------- | ----------- | -------------------------- |
| Create Student   | POST        | Add a new student          |
| Get Student      | GET         | Retrieve student details   |
| Get All Students | GET         | Retrieve all students      |
| Update Student   | PUT/PATCH   | Update student information |
| Delete Student   | DELETE      | Remove a student           |

🗄️ Database

The application uses MySQL for persistent storage.

The main Student entity contains information such as:

* Student ID
* First Name
* Last Name
* Email
* Phone Number
* Date of Birth
* Course
* Address

🎯 Purpose

This project is created to understand and practice:

* Spring Boot fundamentals
* REST API development
* CRUD operations
* Database connectivity
* JPA and Hibernate
* Layered application architecture
* DTO and Entity separation
* Exception handling
* API validation

🔮 Future Enhancements

* Pagination and sorting
* Search students by name/email
* Advanced filtering
* Global exception handling
* Spring Security and authentication
* Role-based authorization
* Swagger/OpenAPI documentation
* Unit and integration testing
* Deployment using Docker/cloud services

👨‍💻 Author

Chitransh Yadav

This project is developed as a learning project to build a strong foundation in *Java, Spring Boot, REST APIs, and backend development.
