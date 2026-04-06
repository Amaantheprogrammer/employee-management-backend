# Employee Management System (Backend)

This is a **RESTful API** built using **Spring Boot** to manage employee records. It provides endpoints to perform CRUD operations and interacts with a **MySQL** database.

## 🚀 Tech Stack
* **Java**: 25
* **Framework**: Spring Boot 3.5
* **Database**: MySQL 9.4
* **Build Tool**: Maven
* **Persistence**: Spring Data JPA / Hibernate

## 🛠️ Prerequisites
Before running the application, ensure you have the following installed:
* **JDK 25** or higher.
* **MySQL Server 9.4** running as a service named `MySQL94`.
* **Maven** (or use the provided `./mvnw` wrapper).

## ⚙️ Setup & Installation

### 1. Database Configuration
Create the database in your MySQL instance:
```sql
CREATE DATABASE IF NOT EXISTS em_system;
