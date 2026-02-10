# Spring Boot REST API – User Management

REST API developed with **Spring Boot** for user management.
This project focuses on applying backend fundamentals, RESTful architecture, exception handling, and clean code organization following good practices.

---

## 📌 Features

* Create users
* List all users
* Find user by ID
* Update user
* Delete user
* Global exception handling (404, 400, 500)

---

## 🛠 Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database
* Maven
* Postman (API testing)

---

## 🚀 Running the Project

### Prerequisites

* Java 17 or higher
* Maven

### Steps

```bash
git clone https://github.com/your-username/your-repository.git
cd your-repository
mvn spring-boot:run
```

The application will be available at:

```
http://localhost:8080
```

---

## 🗄 Database

This project uses the **H2 in-memory database**, suitable for testing and learning purposes.

### H2 Console

```
http://localhost:8080/h2-console
```

### Configuration

* JDBC URL: `jdbc:h2:mem:testdb`
* Username: `sa`
* Password: *(empty)*

---

## 🔗 API Endpoints

| Method | Endpoint    | Description       |
| ------ | ----------- | ----------------- |
| GET    | /users      | List all users    |
| GET    | /users/{id} | Find user by ID   |
| POST   | /users      | Create a new user |
| PUT    | /users/{id} | Update a user     |
| DELETE | /users/{id} | Delete a user     |

---

## ⚠ Error Handling

The application uses a global exception handler with `@ControllerAdvice`.

### Possible responses:

* **404** – Resource not found
* **400** – Bad request
* **500** – Internal server error

Error responses follow a standard structure containing:

* Timestamp
* HTTP status
* Error description
* Detailed message
* Request path

---

## 📁 Project Structure

com.webservice.demo
├── controllers
├── entities
├── repositories
├── services
├── exceptions
```

---

## 📚 Project Goal

This project was developed for **educational purposes**, aiming to practice and consolidate knowledge in:

* REST APIs
* Spring Boot
* JPA / Hibernate
* Backend best practices

---

## 📌 Project Status

✅ Completed for study purposes
🚀 Open for future improveme
 This project was developed for learning purposes.
