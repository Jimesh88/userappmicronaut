CRUD Application - Micronaut + PostgreSQL
This project is a basic CRUD (Create, Read, Update, Delete) application built using Micronaut and PostgreSQL.

Features
Create a user

Get user details by ID

Update user information

Delete user

PostgreSQL as the database

Technologies Used
Micronaut: A lightweight framework for building JVM-based applications.

PostgreSQL: The relational database used to store user details.

Java: The primary programming language.

Gradle: Build tool used for compiling, running, and managing dependencies.

Setup
1. Clone the Project
   bash
   Copy
   Edit
   git clone <https://github.com/Jimesh88/userappmicronaut.git>
   cd <project-directory>
2. Set up PostgreSQL
   Follow the instructions in INSTALLATION.md to set up PostgreSQL.

3. Run the Application
   Once PostgreSQL is set up and running, you can start the application with the following command:

bash
Copy
Edit
./gradlew run
The application will be accessible at http://localhost:8080.

4. API Endpoints
   POST /users - Create a new user

Request body (JSON):

json
Copy
Edit
{
"name": "John Doe",
"email": "john.doe@example.com",
"age": 30
}
Response:

json
Copy
Edit
{
"id": 1,
"name": "John Doe",
"email": "john.doe@example.com",
"age": 30
}
GET /users/{id} - Retrieve user by ID

Example:

json
Copy
Edit
{
"id": 1,
"name": "John Doe",
"email": "john.doe@example.com",
"age": 30
}
PUT /users/{id} - Update an existing user

Request body (JSON):

json
Copy
Edit
{
"name": "John Smith",
"email": "john.smith@example.com",
"age": 31
}
Response:

json
Copy
Edit
{
"id": 1,
"name": "John Smith",
"email": "john.smith@example.com",
"age": 31
}
DELETE /users/{id} - Delete a user by ID

No request body.

Response:

json
Copy
Edit
{
"status": "No Content"
}
Testing
You can use Postman or any HTTP client to test the API endpoints.

Create User:

URL: POST http://localhost:8080/users

Body:

json
Copy
Edit
{
"name": "Jane Doe",
"email": "jane.doe@example.com",
"age": 28
}
Get User by ID:

URL: GET http://localhost:8080/users/1

Update User:

URL: PUT http://localhost:8080/users/1

Body:

json
Copy
Edit
{
"name": "Jane Smith",
"email": "jane.smith@example.com",
"age": 29
}
Delete User:

URL: DELETE http://localhost:8080/users/1