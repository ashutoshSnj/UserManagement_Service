# 🔐 User Management System – Spring Boot + JWT + MySQL

A full-featured User Management System built with Spring Boot, JWT authentication, MySQL database, and role-based access control (USER, ADMIN).

## ⚙️ Configuration (`application.properties`)

properties  
# MySQL Configuration  
spring.datasource.url=jdbc:mysql://localhost:3306/user_management_db  
spring.datasource.username=root  
spring.datasource.password=  
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  

# JPA Configuration  
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect  

# JWT Configuration  
jwt.secret=3ad198743dbd4a12b91f36c4d9e2c47a13f391b91db66dcbf37dcfbec1e7ae11  
jwt.expiration=3600000  

## 🧱 Project Structure  
com.task.User_Management  
│  
├── config                 // JWT Util & SecurityConfig  
├── controller             // UserController  
├── dto                    // UserRequestDto, UserResponseDto  
├── entity                 // User, Role  
├── repository             // UserRepository, RoleRepository  
├── service                // UserService, CustomUserDetailsService  
├── exception              // GlobalExceptionHandler  
├── DataInitializer.java   // Create default roles (USER/ADMIN)  
└── UserManagementApplication.java  

## 🚀 Getting Started  
✅ Step 1: Create Database in MySQL  
CREATE DATABASE user_management_db;  

✅ Step 2: Clone & Run  
git clone https://github.com/ashutoshSnj/UserManagement_Service.git  
cd UserManagement_Service  

## 🧪 API Testing (Use in Postman)  
🔹 1. Register User  
POST /api/users/register  
Headers:  
Content-Type: application/json  
Body:  
     {  
  "name": "Ashutosh",  
  "email": "ashu@gmail.com",  
  "password": "123456"  
}  

Success Response:  
{  
  "id": 1,  
  "name": "Ashutosh",  
  "email": "ashu@gmail.com"  
}  

🔹 2. Login User  
POST /api/users/login  
Headers:  
Content-Type: application/json  
Body:  
{  
  "email": "ashu@gmail.com",  
  "password": "123456"  
}  
Success Response:  
"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."  

🔹 3. Get User Profile (Secured)  
GET /api/users/profile?email=ashu@gmail.com  
Headers:  
Authorization: Bearer <paste_token_here>  
Success Response:  
{  
  "id": 1,  
  "name": "Ashutosh",  
  "email": "ashu@gmail.com"  
}  

## 👤 Author  
Ashutosh Shelke  
Full Stack Java Developer  
📧 Email: ashutoshshelke24@gmail.com  
🔗 https://www.linkedin.com/in/ashutosh-fullstackdeveloper  
