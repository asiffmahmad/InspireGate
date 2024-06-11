CREATE TABLE UserDetails (
    id INT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    firstname VARCHAR(50),
    secondname VARCHAR(50),
    date_of_creation date,
    email VARCHAR(100) NOT NULL,
	phno VARCHAR(13) NOT NULL,
	add1 VARCHAR(50),
	add2 VARCHAR(50)
);

INSERT INTO UserDetails (id, username, firstname, secondname, date_of_creation, email, phno, add1, add2) 
VALUES (1, 'john_doe', 'John', 'Doe', '2024-06-11', 'john.doe@example.com', '+1234567890', '123 Main St', 'Apt 101');

INSERT INTO UserDetails (id, username, firstname, secondname, date_of_creation, email, phno, add1, add2) 
VALUES (2, 'jane_smith', 'Jane', 'Smith', '2024-06-12', 'jane.smith@example.com', '+1987654321', '456 Elm St', NULL);

INSERT INTO UserDetails (id, username, firstname, secondname, date_of_creation, email, phno, add1, add2) 
VALUES (3, 'alex_brown', 'Alex', 'Brown', '2024-06-13', 'alex.brown@example.com', '+1122334455', '789 Oak St', 'Unit 3');

INSERT INTO UserDetails (id, username, firstname, secondname, date_of_creation, email, phno, add1, add2) 
VALUES (4, 'emma_johnson', 'Emma', 'Johnson', '2024-06-14', 'emma.johnson@example.com', '+1567890123', '321 Pine St', NULL);

INSERT INTO UserDetails (id, username, firstname, secondname, date_of_creation, email, phno, add1, add2) 
VALUES (5, 'michael_wilson', 'Michael', 'Wilson', '2024-06-15', 'michael.wilson@example.com', '+1449955773', '555 Maple St', 'Suite 200');
