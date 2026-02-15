# Cloud Relational Databases in Action

A Spring Boot REST API for employee management that currently uses a local PostgreSQL database. The goal of this project
is to migrate it to use a **cloud SQL (Relational Database Management System)** service, transforming it into a
cloud-enabled application.

## About

This project is part of the **Enterprise Cloud Application (ECA)** module in the **Higher Diploma in Software
Engineering (HDSE)** program at the **Institute of Software Engineering (IJSE)**. It is intended exclusively for
students enrolled in this program.

## Objective

As it stands, this application stores all the data in the local PostgreSQL database server. Your task is to **clone this
repository** and migrate the data layer so that it uses a cloud relational database provider (e.g., AWS RDS, Google
Cloud SQL, Azure Database for PostgreSQL), making the application fully cloud-enabled.

## Tech Stack

- **Java 25**
- **Spring Boot 4.0.2**
- **Spring Data REST** (auto-exposed RESTful APIs with HATEOAS)
- **Spring Data JPA** (Hibernate)
- **Local/Public Cloud PostgreSQL**
- **Lombok**
- **Maven**

## API Endpoints

Spring Data REST automatically exposes the following HATEOAS-compliant endpoints:

| Method   | Endpoint                 | Description              |
|----------|--------------------------|--------------------------|
| `GET`    | `/api/v1/employees`      | Get a list of employees  |
| `GET`    | `/api/v1/employees/{id}` | Get an employee by id    |
| `POST`   | `/api/v1/employees`      | Create a new employee    |
| `PATCH`  | `/api/v1/employees/{id}` | Update an employee       |
| `DELETE` | `/api/v1/employees/{id}` | Delete an employee by id |

### Sample Request Body

```json
{
  "name": "John Doe",
  "address": "123 Main Street, Colombo",
  "contact": "0771234567"
}
```

## Getting Started

1. Clone the repository
2. Build the project
   ```bash
   ./mvnw clean install
   ```
3. Run the application
   ```bash
   ./mvnw spring-boot:run
   ```