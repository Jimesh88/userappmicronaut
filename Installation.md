Installation Guide
This guide walks you through the steps required to install and set up the CRUD application.
Prerequisites
Ensure you have the following software installed:
1.	Java Development Kit (JDK) 17
o	You can download it from Oracle's official page or OpenJDK.
2.	Micronaut CLI (Optional)
o	You can install the Micronaut CLI to generate and manage projects more easily.
o	To install the CLI, follow the instructions at Micronaut CLI.
3.	PostgreSQL Database
o	Download and install PostgreSQL from the official page.
4.	Gradle
o	Gradle is used for building the project. You can install Gradle by following the instructions from the Gradle documentation.
5.	Git
o	Make sure Git is installed on your machine to clone the repository. You can download it from Git Downloads.
6.	Postman (Optional for testing)
o	You can download Postman from here.
Setup Instructions
1. Clone the Project
bash
CopyEdit
git clone https://github.com/Jimesh88/userappmicronaut.git
cd <project-directory>
2. Set up the PostgreSQL Database
1.	Start PostgreSQL on your system.
2.	Create a database for the application:
bash
CopyEdit
psql -U postgres
CREATE DATABASE userdb;
3.	Create a user for the database:
bash
CopyEdit
CREATE USER postgres WITH PASSWORD 'testdb';
4.	Grant privileges:
bash
GRANT ALL PRIVILEGES ON DATABASE userdb TO postgres;
3. Configure Application
1.	Open src/main/resources/application.yml.
2.	Ensure your PostgreSQL database credentials are correctly set:
yaml
CopyEdit
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
CopyEdit
./gradlew clean build
5. Run the Application
bash
CopyEdit
./gradlew run
The application will start on http://localhost:8080.
6. Test with Postman
•	Import the following requests into Postman to test the CRUD operations (adjust accordingly):
o	POST http://localhost:8080/users
o	GET http://localhost:8080/users/{id}
o	PUT http://localhost:8080/users/{id}
o	DELETE http://localhost:8080/users/{id}
________________________________________

