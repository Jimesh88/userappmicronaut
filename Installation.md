Ensure you have the following software installed:

Java Development Kit (JDK) 17

You can download it from Oracle's official page or OpenJDK.

Micronaut CLI (Optional)

You can install the Micronaut CLI to generate and manage projects more easily.

To install the CLI, follow the instructions at Micronaut CLI.

PostgreSQL Database

Download and install PostgreSQL from the official page.

Gradle

Gradle is used for building the project. You can install Gradle by following the instructions from the Gradle documentation.

Git

Make sure Git is installed on your machine to clone the repository. You can download it from Git Downloads.

Postman (Optional for testing)

You can download Postman from here.

Setup Instructions
1. Clone the Project
   bash
   Copy
   Edit
   git clone <https://github.com/Jimesh88/userappmicronaut.git>
   cd <project-directory>
2. Set up the PostgreSQL Database
   Start PostgreSQL on your system.

Create a database for the application:

bash
Copy
Edit
psql -U postgres
CREATE DATABASE userdb;
Create a user for the database:

bash
Copy
Edit
CREATE USER postgres WITH PASSWORD 'testdb';
Grant privileges:

bash
Copy
Edit
GRANT ALL PRIVILEGES ON DATABASE userdb TO postgres;
3. Configure Application
   Open src/main/resources/application.yml.

Ensure your PostgreSQL database credentials are correctly set:

yaml
Copy
Edit
micronaut:
application:
name: usercrudapp

datasources:
default:
url: jdbc:postgresql://localhost:5432/userdb
username: postgres
password: testdb
driverClassName: org.postgresql.Driver

jpa:
default:
properties:
hibernate:
hbm2ddl:
auto: update
dialect: org.hibernate.dialect.PostgreSQLDialect
4. Build the Project
   bash
   Copy
   Edit
   ./gradlew clean build
5. Run the Application
   bash
   Copy
   Edit
   ./gradlew run
   The application will start on http://localhost:8080.

6. Test with Postman
   Import the following requests into Postman to test the CRUD operations (adjust accordingly):

POST http://localhost:8080/users

GET http://localhost:8080/users/{id}

PUT http://localhost:8080/users/{id}

DELETE http://localhost:8080/users/{id}

