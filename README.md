# Emergency Blood Donor Finder

A role-based blood donor management platform built using Spring Boot, Spring Security, JWT Authentication, Hibernate JPA, MySQL, and REST APIs.

The system is designed to help users quickly find blood donors during emergencies based on blood group and location.

This project is currently under active development.

---

# Project Objective

During emergency situations, patients and hospitals often struggle to find suitable blood donors quickly.

The objective of this platform is to:

- connect blood donors and recipients
- simplify emergency blood requests
- provide location-based donor search
- manage donor availability efficiently
- build a secure and scalable backend system

---

# Tech Stack

## Backend

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate ORM
- JWT Authentication
- REST APIs

---

## Database

- MySQL

---

## Build Tool

- Maven

---

## Development Tools

- Spring Tool Suite (STS)
- Postman
- Git & GitHub

---

## Planned Frontend

- React.js
- Bootstrap / Tailwind CSS

---

# Core Features

## Authentication & Authorization

- Secure user registration and login
- JWT-based authentication system
- Password encryption using BCrypt
- Role-based access control

---

## Donor Management

- Register as blood donor
- Update donor availability
- Manage donor profile

---

## Emergency Request System

- Create emergency blood requests
- Search donors by blood group
- Search donors by city/location
- Contact donor information

---

# Current Backend Features

- Donor Entity Management
- Blood Group Filtering
- REST APIs
- MySQL Database Integration
- Spring Security Setup
- JWT Authentication Setup
- CRUD Operations

---

# Planned Features

- Emergency Notification System
- Email Alerts
- Google Maps Integration
- Nearby Donor Search
- Real-Time Availability Tracking
- Admin Dashboard
- React Frontend

---

# Project Architecture

```text
                +----------------------+
                |      Frontend        |
                | React / Bootstrap UI |
                +----------+-----------+
                           |
                           |
                           v
                +----------------------+
                |   REST API Layer     |
                | Spring Boot Backend  |
                +----------+-----------+
                           |
        -----------------------------------------
        |                    |                  |
        v                    v                  v

+---------------+   +----------------+   +----------------+
| Authentication|   | Business Logic |   | Notification   |
| Spring Security|  | Donor Handling |   | Future Services|
| JWT           |   | Request System |   | Email Alerts   |
+-------+-------+   +--------+-------+   +--------+-------+
        |                       |                   |
        ---------------------------------------------
                               |
                               v
                    +-------------------+
                    |   Hibernate JPA   |
                    | ORM Mapping Layer |
                    +---------+---------+
                              |
                              v
                    +-------------------+
                    |      MySQL DB     |
                    +-------------------+
```

---

# Database Design

## Donors Table

Stores:

- donor name
- blood group
- city
- phone number
- availability status

---

# API Endpoints

## Donor APIs

### Add Donor

```http
POST /donors
```

### Get All Donors

```http
GET /donors
```

### Search By Blood Group

```http
GET /donors/{bloodGroup}
```

---

# Security Features

- JWT Token Authentication
- BCrypt Password Encryption
- Spring Security Integration
- Protected API Endpoints
- Role-Based Authorization

---

# Current Project Status

## Completed

- Backend setup
- Donor entity design
- Blood group filtering APIs
- Database integration
- Initial REST APIs
- Security configuration

---

## In Progress

- JWT authentication
- Emergency request handling
- Frontend development
- Notification system

---

# Future Enhancements

- Google Maps API
- Nearby Donor Tracking
- Emergency Notifications
- Email Alerts
- React Frontend
- Cloud Deployment
- Real-Time Availability Tracking

---

# How To Run The Project

## Clone Repository

```bash
git clone https://github.com/Anindita1606/lifeline-donor-network
```

---

## Configure MySQL

Create database:

```sql
CREATE DATABASE emg_blood_donor_finder_db;
```

---

## Update application.properties

```properties
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

---

## Run Application

Run:

```text
EmergencyBloodDonorFinderApplication.java
```

Server starts at:

```text
http://localhost:1004
```

---

# Testing APIs

Use:

- Postman

---

## Add Donor API

```http
POST /donors
```

---

## Get All Donors API

```http
GET /donors
```

---

## Search Blood Group API

```http
GET /donors/O+
```

---

# Learning Outcomes

This project helped in understanding:

- Spring Boot backend development
- REST API design
- JWT authentication
- Hibernate ORM
- Database integration
- Secure backend architecture
- Real-world problem solving

---

# Author

Anindita Chatterjee

---

# License

This project is developed for educational and learning purposes.
