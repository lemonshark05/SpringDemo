# SpringDemo Project

A Spring Boot application demonstrating basic CRUD operations with `Person` and `Hobby` entities.

## Introduction

This project is a Spring Boot application that provides REST APIs to manage `Person` and their associated `Hobby`. It includes CRUD functionalities and uses PostgreSQL as the database.

## Features

- CRUD operations for `Person`.
- CRUD operations for `Hobby`.
- Find all persons with a specific hobby.
- Exception handling with custom exceptions.

## Technologies Used

- **Spring Boot** (Web, JPA, DevTools)
- **PostgreSQL** as the database
- **Lombok** for boilerplate code reduction
- **Maven** for dependency management
- **Java 17+**

## API Endpoints

### Person APIs

| HTTP Method | Endpoint               | Description                   |
|-------------|------------------------|-------------------------------|
| `GET`       | `/api/persons`         | Get all persons               |
| `GET`       | `/api/persons/{id}`    | Get person by ID              |
| `POST`      | `/api/persons`         | Create a new person           |
| `PUT`       | `/api/persons/{id}`    | Update an existing person     |
| `DELETE`    | `/api/persons/{id}`    | Delete a person               |

### Hobby APIs

| HTTP Method | Endpoint                   | Description                       |
|-------------|----------------------------|-----------------------------------|
| `GET`       | `/api/hobbies`            | Get all hobbies                   |
| `POST`      | `/api/persons/{id}/hobbies`| Add hobbies to a specific person |
| `DELETE`    | `/api/hobbies/{id}`       | Delete a hobby                    |

### Custom Query

| HTTP Method | Endpoint                    | Description                         |
|-------------|-----------------------------|-------------------------------------|
| `GET`       | `/api/persons?hobby={name}` | Find all persons with a specific hobby |

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/lemonshark05/SpringDemo.git
2. Navigate to the project directory:
   ```bash
   cd SpringDemo
3. Configure the database connection in src/main/resources/application.properties:

   ```bash
   spring.datasource.url=jdbc:postgresql://localhost:5432/person_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
4. Build and run the application:
   ```bash
   mvn spring-boot:run
5. Access the API at http://localhost:8080.
