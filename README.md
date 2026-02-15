# Cloud Relational Databases in Action

The goal of this project is to migrate it to use a cloud SQL service, transforming it into a cloud-enabled application.

## About

This project is part of the **Enterprise Cloud Application (ECA)** module in the **Higher Diploma in Software Engineering (HDSE)** program at the **Institute of Software Engineering (IJSE)**. It is intended exclusively for students enrolled in this program.

## Objective

As it stands, the application stores all the data in the local PostgreSQL database server. Your task is to clone this repo and migrate it to a cloud relational database management system, making the application fully cloud-enabled.

## Tech Stack

- **Java 25**
- **Spring Boot 4.0.2**
- **Spring Data REST** (auto-exposed RESTful APIs with HATEOAS)
- **Spring Data JPA** (Hibernate)
- **PostgreSQL**
- **Lombok**
- **Maven**

## API Endpoints

Spring Data REST automatically exposes the following HATEOAS-compliant endpoints:

| Method   | Endpoint           | Description              |
|----------|--------------------|--------------------------|
| `GET`    | `/employees`       | Get a list of employees  |
| `GET`    | `/employees/{id}`  | Get an employee by id    |
| `POST`   | `/employees`       | Create a new employee    |
| `PUT`    | `/employees/{id}`  | Update an employee       |
| `DELETE` | `/employees/{id}`  | Delete an employee by id |

### Sample Request Body

```json
{
  "name": "John Doe",
  "address": "123 Main Street, Colombo",
  "contact": "0771234567"
}
```

### Sample Response (HATEOAS)

```json
{
  "name": "John Doe",
  "address": "123 Main Street, Colombo",
  "contact": "0771234567",
  "_links": {
    "self": {
      "href": "http://localhost:8080/employees/1"
    },
    "employee": {
      "href": "http://localhost:8080/employees/1"
    }
  }
}
```

## Getting Started

### Prerequisites

- Java 25+
- Maven 3.9+
- PostgreSQL installed and running locally

### Setup

1. **Clone the repository**

   ```bash
   git clone <repository-url>
   cd Cloud-Relational-Databases-in-Action
   ```

2. **Create the database**

   ```sql
   CREATE DATABASE cloud_rdbms;
   ```

3. **Configure the datasource**

   Update `src/main/resources/application.yaml` with your PostgreSQL credentials:

   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/cloud_rdbms
       username: postgres
       password: your_password
   ```

4. **Run the application**

   ```bash
   ./mvnw spring-boot:run
   ```

5. **Access the API**

   Open [http://localhost:8080/employees](http://localhost:8080/employees) in your browser or API client.

## License

This project is for educational purposes only.