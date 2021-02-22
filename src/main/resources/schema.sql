DROP TABLE IF EXISTS USER;  

CREATE TABLE USER (
	ID 			INT AUTO_INCREMENT 	PRIMARY KEY,
	FIRST_NAME 	VARCHAR(100) 		NOT NULL,
	LAST_NAME 	VARCHAR(100) 		NOT NULL,
	EMAIL 		VARCHAR(200) 		NOT NULL UNIQUE,
	PHONE 		VARCHAR(11) 		NOT NULL UNIQUE
);