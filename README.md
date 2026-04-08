# JWT Authentication API (Spring Boot + MySQL + Spring Security)

A complete role-based authentication API using **Spring Boot**, **JWT**, **Spring Security**, and **MySQL**.  
This project demonstrates secure login, registration, and role-protected endpoints.

---

## 🚀 Features

- 🔐 User Registration (with ROLE_USER / ROLE_ADMIN)
- 🔑 Secure Login with JWT Token Generation
- ✔ Role-Based Authorization
- 🛡 Spring Security Integration
- 🗄 MySQL Database with JPA
- ⚙ Clean and Scalable Code Structure
- 📌 REST API Endpoints (Register, Login, Protected Route)

---

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot 3**
- **Spring Security**
- **JWT (jjwt)**
- **Spring Data JPA**
- **MySQL**
- **Maven**

---

## 📁 Project Structure

```
src/main/java/com/jwtauth/api/
 ├── config/
 │    ├── JwtAuthFilter.java
 │    ├── JwtUtil.java
 │    └── SecurityConfig.java
 ├── controller/
 │    └── AuthController.java
 ├── model/
 │    ├── Role.java
 │    └── User.java
 ├── repository/
 │    └── UserRepository.java
 ├── service/
 │    ├── AuthService.java
 │    └── impl/CustomUserDetailsService.java
 └── JwtAuthenticationApiApplication.java
```

---

## ⚙️ API Endpoints

### 🟩 Register User  
**POST** `/auth/register`  
Request Body:
```json
{
  "username": "yash",
  "password": "password",
  "role": "ADMIN"
}
```

---

### 🟦 Login User (Get JWT Token)  
**POST** `/auth/login`  
Request Body:
```json
{
  "username": "yash",
  "password": "password"
}
```

Response:
```
<JWT TOKEN>
```

---

### 🔒 Protected ADMIN Endpoint  
**GET** `/auth/admin`  
Headers:
```
Authorization: Bearer <your_jwt_token>
```

Response:
```
Hello Admin! This is a protected route.
```

---

## 🗄 Database Configuration

```
spring.datasource.url=jdbc:mysql://localhost:3306/jwtdb
spring.datasource.username=root
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
```

Create DB manually:

```sql
CREATE DATABASE jwtdb;
```

---

## ▶️ Run the Project

```
mvn spring-boot:run
```

---

## 👨‍💻 Author

**Yash Advani**  
Java Backend Developer  
🔗 GitHub: https://github.com/YashAdvani973  
🔗 LinkedIn: https://www.linkedin.com/in/yash-advani/

---

⭐ If you like this project, don't forget to **star the repository**!
