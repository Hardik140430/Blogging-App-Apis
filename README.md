# 📝 Blogging App API

A RESTful API backend for a blogging platform built using **Spring Boot**, **Spring Security**, **JWT**, and **MySQL**. This application allows users to register, log in, and perform various operations on blog posts with role-based access control.

## 🔧 Tech Stack

- Java, Spring Boot
- Spring Security + JWT
- Hibernate, JPA
- MySQL
- Postman, Git, Maven

## ✨ Features

- ✅ User registration and login with JWT
- ✅ Role-based access control (Admin/User)
- ✅ CRUD operations for blog posts, categories, and users
- ✅ Pagination and sorting for posts
- ✅ Global exception handling and validation
- ✅ RESTful API design following best practices

## 📂 API Endpoints (Sample)

| Method | Endpoint               | Description                     |
|--------|------------------------|---------------------------------|
| POST   | `/api/auth/register`   | Register a new user             |
| POST   | `/api/auth/login`      | User login and receive JWT      |
| GET    | `/api/posts/`          | Get all blog posts              |
| POST   | `/api/posts/`          | Create new post (Admin only)    |
| PUT    | `/api/posts/{id}`      | Update a post                   |
| DELETE | `/api/posts/{id}`      | Delete a post (Admin only)      |

## 🚀 Getting Started

1. Clone the repository  
   `git clone https://github.com/Hardik140430/Blogging-App-Apis.git`

2. Create a MySQL database  
   `CREATE DATABASE blogging_app;`

3. Configure `application.properties`  

4. Run the application  
`./mvnw spring-boot:run` or run the main class from IDE

## 📎 GitHub

[👉 View Source Code](https://github.com/Hardik140430/Blogging-App-Apis)

## 🙋‍♂️ Author

**Hardik Harsora**  
[LinkedIn](https://www.linkedin.com/in/hardik-harsora) • [GitHub](https://github.com/Hardik140430)
