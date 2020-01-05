DROP TABLE IF EXISTS contacts;
 
CREATE TABLE contacts (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  phone_number INT,
  city VARCHAR(250),
  address VARCHAR(250),
  zip_code VARCHAR(6)
);