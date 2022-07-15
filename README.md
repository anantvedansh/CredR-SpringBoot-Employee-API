#CredR-SpringBoot-Employee-API
CredR-SpringBoot-Employee-APIs
Endpoints:

The API takes localhost:8080/getEmp/{client_name} as a GET requet and returns a list of all the male employees who work for the given client along with their sex (M/F), client name and their total sales in a JSON format:

{
        "emp_name": "Stanley Hudson",
        "sex": "M",
        "client_name": "FedEx",
        "total_sales": 130000
}

Database Details:

The MYSQL database has 3 tables: employee, client and works_with. Run the following queries to make the three tables:

CREATE TABLE employee (
emp_id INT PRIMARY KEY,
first_name VARCHAR(40),
last_name VARCHAR(40),
birth_day DATE,
sex VARCHAR(1),
salary INT
);

CREATE TABLE works_with (
emp_id INT,
client_id INT,
total_sales INT,
PRIMARY KEY(emp_id, client_id),
FOREIGN KEY(emp_id) REFERENCES employee(emp_id) ON DELETE CASCADE,
FOREIGN KEY(client_id) REFERENCES client(client_id) ON DELETE CASCADE
);

CREATE TABLE client (
client_id INT PRIMARY KEY, client_name VARCHAR(40)
);

Datbase URL: jdbc:mysql://localhost:3306/employeedb

Steps to run project:
1.) Navigate to directory of the project.
2.) execute mvn install -DskipTests
3.) Now go to directory of the jar file
4.) execute java -jar <filename.jar>
5.) Use PostMan to send POST or GET requests to specific endpoints.
