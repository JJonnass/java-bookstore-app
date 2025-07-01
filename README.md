# 📚 Bookstore – A Simple Book Management System

**Bookstore** is a lightweight Java Spring Boot application that provides a RESTful API for managing books. It follows the Model-View-Controller (MVC) architecture and demonstrates how to structure a clean, scalable Spring Boot backend.

---

## Features

- View all books
- Add new book entries
- Update book details
- Delete book records (if implemented)
- Organized controller and model structure
- Built with Maven for easy setup and run

---

## 🛠️ Tech Stack

| Technology     | Description                          |
|----------------|--------------------------------------|
| Java 17+       | Core programming language            |
| Spring Boot    | Backend framework                    |
| Spring MVC     | Routing and controller logic         |
| REST API       | Exposes endpoints for CRUD operations|
| Maven          | Build and dependency management      |

---

## 📁 Project Structure

```
Bookstore/
├── src/
│ └── main/
│ ├── java/
│ │ └── com/example/Bookstore/
│ │ ├── BookstoreApplication.java                       # Main app entry
│ │ ├── Controller/
│ │ │ └── BookstoreController.java                      # Route handling
│ │ └── model/ 
│ └── resources/
│ └── application.properties                            # Spring config
├── pom.xml # Maven configuration
├── mvnw / mvnw.cmd                                     # Maven wrapper scripts
└── README.md
```
---

## ▶️ Getting Started

### Prerequisites
- Java 17+
- Maven

### Run the Application

```bash
# Clone the repository
git clone https://github.com/JJonnass/java-bookstore-app.git
cd Bookstore

# Build and run the project
./mvnw spring-boot:run
```
---
## What I Learned
- Setting up a Spring Boot project with Maven
- Designing RESTful routes using Spring MVC
- Implementing a clean MVC structure
- Managing dependencies and builds with Maven
