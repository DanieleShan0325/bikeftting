
CREATE TABLE BIKE (
  BIKE_ID INT NOT NULL AUTO_INCREMENT,
  BIKE_NAME VARCHAR(10) NOT NULL,
  BIKE_BRAND VARCHAR(255) NOT NULL,
  BIKE_SIZE INT,
  BIKE_PIC LONGBLOB,
  PRIMARY KEY (BIKE_ID)
);