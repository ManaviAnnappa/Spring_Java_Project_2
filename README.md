<img width="1430" height="911" alt="file" src="https://github.com/user-attachments/assets/067c9214-1b7c-43b4-a39d-dcc61ccecf15" />
<img width="1505" height="559" alt="WhatsApp Image 2026-05-25 at 12 36 45 AM" src="https://github.com/user-attachments/assets/a230ca7e-da7b-40ec-9d80-f701dce3063e" />
<img width="1505" height="559" alt="WhatsApp Image 2026-05-25 at 12 36 45 AM" src="https://github.com/user-attachments/assets/c59a7072-72e6-4d04-8f76-6f49c24ec0d5" />
<img width="1430" height="911" alt="WhatsApp Image 2026-05-25 at 12 36 46 AM" src="https://github.com/user-attachments/assets/df9fb013-f64f-4b01-afdf-9f428c8c5da2" />
 First REST API – Product Management Service

This project is a simple REST API built with Spring Boot.  
It demonstrates how backend applications handle HTTP requests, process data, and return JSON responses.  
The project was created as part of the Spring Framework course at Akademia Finansów i Biznesu Vistula.

-------------------------------------------------------

1. Technologies Used
- Java  
- Spring Boot  
- Spring Web  
- Spring Data (later tasks)  
- H2 Database (later tasks)  
- Maven  
- IntelliJ IDEA  
- Postman / Swagger  

--------------------------------------------------------
 2. Project Structure

product  
 ├── api  
 │    ├── ProductController  
 │    ├── request  
 │    │      └── ProductRequest  
 │    └── response  
 │           └── ProductResponse  
 ├── domain  
 │      └── Product  
 ├── repository  
 │      └── ProductRepository  
 ├── service  
 │      └── ProductService  
 └── support  
        └── ProductMapper  

### Layer Explanation
- **api** – handles HTTP requests and responses  
- **domain** – main business object (Product)  
- **service** – business logic  
- **repository** – data storage (HashMap simulating a database)  
- **support** – helper class for mapping objects  

-------------------------------------------------

## 3. How the Application Works

### ProductRequest (incoming JSON)
{
  "name": "Laptop"
}

### Product (domain object)
Internal object stored in the repository.

### ProductResponse (outgoing JSON)
{
  "id": 1,
  "name": "Laptop"
}

### Repository
Stores products in a HashMap and assigns IDs automatically.

### Service
Processes data and saves it using the repository.

### Mapper
Converts:
- ProductRequest → Product  
- Product → ProductResponse  

### Controller
Exposes REST endpoints.

-------------------------------------------

## 4. Endpoints

### 1. Create a Product  
**POST** `/product`

Request:
{
  "name": "Phone"
}

Response:
{
  "id": 1,
  "name": "Phone"
}

---

### 2. Get All Products  
**GET** `/product`

Response:
[
  {
    "id": 1,
    "name": "Phone"
  },
  {
    "id": 2,
    "name": "Laptop"
  }
]

----------------------------------------------

## 5. Required Screenshots (Postman)

Add these screenshots to your README:

1. **POST /product** request + response  
2. **GET /product** request + response  
3. **Swagger UI** (if enabled)

Place them in an `images/` folder and reference them like:

![Create Product](images/post-product.png)  
![Get Products](images/get-products.png)  
![Swagger](images/swagger.png)

----------------------------------------------

## 6. How to Run the Application

1. Open the project in IntelliJ  
2. Run `FirstRestApiSpringApplication`  
3. Open:  
   http://localhost:8080

---------------------------------------------

## 7. Summary

This project demonstrates:
- Creating a REST API from scratch  
- Using Spring stereotypes (@Controller, @Service, @Repository, @Component)  
- Handling JSON requests and responses  
- Mapping objects between layers  
- Testing endpoints in Postman or Swagger  

It follows clean coding practices and a standard backend architecture.

Submitted by:-
Manavi pale Annappa -74643
