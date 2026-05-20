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

Why does ProductRepository work with no code written inside it?
ProductRepository extends JpaRepository<Product, Long>. Spring Data JPA automatically generates a full implementation at runtime. Even though the interface is empty, Spring creates a proxy class behind the scenes that provides all the standard CRUD methods — save, findById, findAll, deleteById, and more. That is why the service layer can call these methods without any manual implementation.

Screenshots
1. Creating a product (POST /products)
<img width="715" height="456" alt="image" src="https://github.com/user-attachments/assets/711c2217-786a-487c-bcfa-ef428ef00dbc" />

2. Getting all products (GET /products)
<img width="773" height="445" alt="image" src="https://github.com/user-attachments/assets/aa76cd18-8687-48ff-9973-7128e5ffc120" />

3. Updating a product (PUT /products/{id})
<img width="733" height="407" alt="image" src="https://github.com/user-attachments/assets/a959a4a3-9846-47c1-821b-8d3b6b30d1bc" />

4. Deleting a product (DELETE /products/{id})
<img width="753" height="280" alt="image" src="https://github.com/user-attachments/assets/73b6bb68-4125-4621-9f42-ae81db931e40" />

5. H2 database console
<img width="509" height="278" alt="image" src="https://github.com/user-attachments/assets/397f87d3-3239-4b29-8e20-461363d190d8" />
