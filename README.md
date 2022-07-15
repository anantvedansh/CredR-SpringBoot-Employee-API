# CredR-SpringBoot-Employee-API
CredR-SpringBoot-Employee-API <br/><br>
Endpoints: <br/>
The API takes localhost:8080/getEmp/{client_name} as a GET requet and returns a list of all the male employees who work for the given client along with their sex (M/F), client name and their total sales in a JSON format:<br/><br>
{
"emp_name": "Stanley Hudson",
"sex": "M",
"client_name": "FedEx",
"total_sales": 130000
}</br><br>

Database Details:
The MYSQL database has 3 tables: 
1. employee 
2. client 
3. works_with. 

Run the following queries to make the three tables:
<br/><br/>
CREATE TABLE employee (
emp_id INT PRIMARY KEY,
first_name VARCHAR(40),
last_name VARCHAR(40),
birth_day DATE,
sex VARCHAR(1),
salary INT
);
<br/><br/>
CREATE TABLE works_with (
emp_id INT,
client_id INT,
total_sales INT,
PRIMARY KEY(emp_id, client_id),
FOREIGN KEY(emp_id) REFERENCES employee(emp_id) ON DELETE CASCADE,
FOREIGN KEY(client_id) REFERENCES client(client_id) ON DELETE CASCADE
);
<br/><br/>
CREATE TABLE client (
client_id INT PRIMARY KEY, client_name VARCHAR(40)
);
<br><br/>
Database URL: jdbc:h2:mem:animal_traits_db <br/>
<br/>
   Steps to run project: <br/>
   1.) Navigate to directory of the project. <br/>
   2.) execute mvn install -DskipTests <br/>
   3.) Now go to directory of the jar file <br/>
   4.) execute java -jar <filename.jar> <br/>
   5.) Use PostMan to send POST or GET requests to specific endpoints. <br/>


(C) Anant Vedansh - 2022