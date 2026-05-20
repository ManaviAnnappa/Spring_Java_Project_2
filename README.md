Spring-Boot_H2_databse Task

-How to Run

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Run the main Spring Boot class
4. Open Swagger UI at: http://localhost:8080/swagger-ui/index.html
5. Open the H2 console at: http://localhost:8080/console
6. In the H2 console, use the JDBC URL: jdbc:h2:mem:testdb


--Endpoints

POST /products — create a new product, send { "name": "Laptop" } in the body
GET /products — get all products
GET /products/{id} — get a single product by its ID
PUT /products/{id} — update a product, send { "name": "Updated Laptop" } in the body
DELETE /products/{id} — delete a product


--Database
The app uses an in-memory H2 database. Hibernate automatically creates the product table at startup based on the Product entity class, which uses @Entity, @Id, and @GeneratedValue. Because the database is stored in memory, it resets every time the application restarts.

