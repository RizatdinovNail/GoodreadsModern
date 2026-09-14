# GoodreadsModern

A RESTful web service built with Java, Spring Boot, Spring Data JPA, and an H2 in-memory database. This application provides a service layer and REST endpoints for managing a library catalog, supporting full Create, Read, Update, and Delete (CRUD) operations for book records.


## TECHNICAL ARCHITECTURE

- Language: Java 17+
- Framework: Spring Boot 3
- Persistence Layer: Spring Data JPA / Hibernate
- Database: H2 In-Memory Database
- Build Management: Apache Maven


## GETTING STARTED

Prerequisites:
- Java Development Kit (JDK) 17 or higher
- Apache Maven 3.8+ (or use the included Maven wrapper ./mvnw)

Installation and Execution:
1. Clone the repository:
   git clone https://github.com/RizatdinovNail/GoodreadsModern
   cd GoodreadsModern

3. Compile and package the application:
   ./mvnw clean package

4. Run the application:
   ./mvnw spring-boot:run

5. Run frontend
   npm run dev

The server will initialize on port 8080 (http://localhost:8080).


## DATABASE ACCESS AND MANAGEMENT

The application utilizes an H2 in-memory relational database. Schema generation and data seeding occur automatically upon application startup.

Web Console Access:
To inspect tables and execute raw SQL queries:
1. Launch the application.
2. Navigate to http://localhost:8080/h2-console in a browser.
3. Configure the connection settings:
   - JDBC URL: jdbc:h2:mem:testdb
   - User Name: sa
   - Password: (leave blank)
4. Select Connect.


## API SPECIFICATION

Book Endpoints:
- GET /api/books - Retrieve all registered books
- GET /api/books/{id} - Retrieve a specific book by ID
- POST /api/books - Create a new book record
- PUT /api/books/{id} - Update an existing book record
- DELETE /api/books/{id} - Remove a book record by ID

Sample Request Payload (POST /api/books):
{
  "title": "The Hobbit",
  "author": "J.R.R. Tolkien",
  "overview": "The Hobbit is set within Tolkien's Middle-earth and follows the quest of home-loving Bilbo Baggins to win a share of the treasure guarded by Smaug the dragon."
}


## DATA MODEL SPECIFICATIONS

To accommodate detailed book summaries without string truncation errors, the overview field in the Book entity is configured as an unconstrained text column:

@Column(name = "overview", columnDefinition = "TEXT", nullable = false)
private String overview;


## TESTING

Execute the test suite using Maven:
./mvnw test
