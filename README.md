# Vehicle Rental Management System

## Overview

Vehicle Rental Management System is a console-based Java application developed using Object-Oriented Programming (OOP) concepts, JDBC, and MySQL. The system allows users to view available vehicles, rent vehicles, return vehicles, and manage vehicle availability using a MySQL database.

## Features

* View all available vehicles
* Rent a vehicle
* Return a vehicle
* Generate rental bill
* Track vehicle availability
* MySQL database integration using JDBC

## Technologies Used

* Java
* JDBC
* MySQL
* SQL
* Object-Oriented Programming (OOP)

## OOP Concepts Implemented

* Inheritance
* Constructors
* Objects and Classes
* Method Reusability

## Database Tables

### vehicles

Stores vehicle information and availability status.

### customers

Stores customer details.

### rentals

Stores rental transaction details.

## Project Structure

Vehicle.java - Main application

VehicleRent.java - Parent class

Car.java - Car class

Bike.java - Bike class

Scooty.java - Scooty class

Customer.java - Customer details

DBConnection.java - Database connectivity

ShowVehicles.java - Display vehicle records from database

ConnectionTest.java - Database connection testing

DriverTest.java - JDBC driver testing

database.sql - Database schema and sample data

## How to Run

1. Create the database using database.sql.
2. Configure MySQL username and password in DBConnection.java.
3. Run Vehicle.java.
4. Select menu options to rent or return vehicles.

## Sample Functionalities

* Vehicle Rental
* Vehicle Return
* Bill Generation
* Database Update using JDBC

## Author

P U Manjula
B.Tech - Electronics and Communication Engineering
