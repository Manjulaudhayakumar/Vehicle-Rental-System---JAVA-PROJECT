CREATE DATABASE vehicle_rental;
USE vehicle_rental;
CREATE TABLE vehicles(
    vehicle_id VARCHAR(10) PRIMARY KEY,
    vehicle_type VARCHAR(20),
    brand VARCHAR(50),
    rent_per_day DOUBLE,
    is_available BOOLEAN
);
CREATE TABLE customers(
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(50),
    phone BIGINT,
    aadhar BIGINT
);
CREATE TABLE rentals(
    rental_id INT AUTO_INCREMENT PRIMARY KEY,
    vehicle_id VARCHAR(10),
    customer_id INT,
    days INT,
    total_rent DOUBLE,
    
    FOREIGN KEY(vehicle_id) REFERENCES vehicles(vehicle_id),
    FOREIGN KEY(customer_id) REFERENCES customers(customer_id)
);
INSERT INTO vehicles VALUES
('V101','Car','Toyota',1500,true),
('V102','Car','Honda',1300,true),
('V103','Car','Skoda',1700,true),
('V104','Car','Maruti Swift',1800,true),
('V105','Bike','Yamaha',700,true),
('V106','Bike','Royal Enfield',900,true),
('V107','Bike','KTM RC 390',1500,true),
('V108','Bike','Suzuki Gixxer SF',1900,true),
('V109','Scooty','Activa',500,true),
('V110','Scooty','Jupiter',550,true),
('V111','Scooty','Suzuki Access 125',1000,true),
('V112','Scooty','Yamaha RayZR',1200,true);
