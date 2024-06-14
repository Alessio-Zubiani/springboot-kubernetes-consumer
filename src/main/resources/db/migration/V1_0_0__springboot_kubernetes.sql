-- Create table employee
CREATE TABLE IF NOT EXISTS employee (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50),
	surname VARCHAR(50),
	department VARCHAR(50)
);