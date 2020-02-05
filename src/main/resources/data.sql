--DROP TABLE IF EXISTS contact;
 
--CREATE TABLE contact (
--  id INT AUTO_INCREMENT  PRIMARY KEY,
--  first_name VARCHAR(250) NOT NULL,
--  last_name VARCHAR(250) NOT NULL,
--  phone_number INT,
--  city VARCHAR(250),
--  address VARCHAR(250),
--  zip_code VARCHAR(6)
--);

INSERT INTO contact (id, first_name, last_name, phone_number, city, address, zip_code) 
VALUES (4, 'Mike', 'Nowak', 999999999, 'Lipki Male', 'Lipki Male 111', '49-039'); 

INSERT INTO contact (id, first_name, last_name, phone_number, city, address, zip_code) 
VALUES (1, 'Fred', 'Nowak', 888888888, 'Lipki Male', 'Lipki Male 111', '49-039'); 

INSERT INTO contact (id, first_name, last_name, phone_number, city, address, zip_code) 
VALUES (2, 'Kim', 'Nowak', 888888888, 'Lipki Male', 'Lipki Male 111', '49-039'); 

INSERT INTO contact (id, first_name, last_name, phone_number, city, address, zip_code) 
VALUES (3, 'Max', 'Nowak', 888888888, 'Lipki Male', 'Lipki Male 111', '49-039'); 

--select * from contact