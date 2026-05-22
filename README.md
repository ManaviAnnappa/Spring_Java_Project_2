* Spring Boot REST API – Task 2 Project *
________________________________________
 

## Project Overview

This project was developed as part of the Spring Framework course. The application is a REST API created using Spring Boot. It performs CRUD operations (Create, Read, Update, Delete) for products and uses an H2 in-memory database.

The main purpose of this project is to understand how REST APIs work, how HTTP methods are used, and how backend applications communicate with databases.

---------------------------------------------

## Technologies Used

- Java
- Spring Boot
- Maven
- Spring Web
- Spring Data JPA
- H2 Database
- Swagger UI (OpenAPI)
- IntelliJ IDEA

------------------------------------------

## Project Features

This application allows users to:

✅ Create a product  
✅ Get a product by ID  
✅ Get all products  
✅ Update product details  
✅ Delete a product  
✅ Test APIs using Swagger UI  
✅ Store data in H2 Database  

---

## Project Structure

The project is divided into different packages for better organization:

### API Package
Handles HTTP requests and responses through the controller.

### Domain Package
Contains the `Product` class which represents product data.

### Service Package
Contains business logic and handles data processing.

### Repository Package
Responsible for database communication.

### Support Package
Contains helper classes such as mapper and exception handling.

-------------------------------------------------------------

 How to Run the Project :-

### Step 1: Clone the Repository

```bash
git clone YOUR_GITHUB_LINK
```

### Step 2: Open in IntelliJ IDEA

Open the project in IntelliJ IDEA and wait for Maven dependencies to load.

### Step 3: Run the Application

Run the main Spring Boot application file.

---------------------------------------------------------

## Swagger UI

After running the project, open Swagger UI in browser:

```text
http://localhost:8080/swagger-ui/index.html
```

Swagger UI helps to test API endpoints directly from the browser.

-------------------------------------------------------

## H2 Database Console

To view the database:

```text
http://localhost:8080/console
```

Use this JDBC URL:

```text
jdbc:h2:mem:testdb
```

This database is in-memory, meaning data will reset after restarting the application.

---

## API Endpoints

### 1. Create Product

**HTTP Method:** POST

Endpoint:

```text
/api/v1/products
```

Example JSON Request:

```json
{
  "name": "Laptop"
}
```

Example Response:

```json
{
  "id": 1,
  "name": "Laptop"
}
```

Status Code: `201 Created`

---

### 2. Get Product By ID

**HTTP Method:** GET

Endpoint:

```text
/api/v1/products/{id}
```

Example:

```text
/api/v1/products/1
```

Status Code: `200 OK`

---

### 3. Get All Products

**HTTP Method:** GET

Endpoint:

```text
/api/v1/products
```

This method returns all products stored in the database.

Status Code: `200 OK`

---

### 4. Update Product

**HTTP Method:** PUT

Endpoint:

```text
/api/v1/products/{id}
```

Example JSON Request:

```json
{
  "name": "Updated Laptop"
}
```

Status Code: `200 OK`

---

### 5. Delete Product

**HTTP Method:** DELETE

Endpoint:

```text
/api/v1/products/{id}
```

Example:

```text
/api/v1/products/1
```

Status Code: `204 No Content`

---

## Exception Handling

The project includes exception handling for situations where a product does not exist.

Example:
If a user tries to find or delete a product with an invalid ID, the system returns an appropriate error message instead of crashing.

---

## Testing the Application

The API can be tested using:

- Swagger UI
- Postman
- Browser (for GET requests)

Example testing flow:

1. Create a product using POST method  
2. Retrieve product using GET method  
3. Update product using PUT method  
4. Verify changes using GET method  
5. Delete product using DELETE method  

---

## Learning Outcome

Through this project, I learned:

- REST API development in Spring Boot  
- HTTP methods (GET, POST, PUT, DELETE)  
- Swagger API testing  
- H2 database integration  
- Exception handling in Spring  
- Project structure using Controller, Service, Repository layers

---

## Author

**Manavi Pale Annappa** 
----------74643-----------
Artificial Intelligence Student  
Vistula University >_<
