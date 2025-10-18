# Celebrato - Event Management System

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.java.com/) 
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.3-green)](https://spring.io/projects/spring-boot) 
[![React](https://img.shields.io/badge/React-18.2.0-blue)](https://reactjs.org/) 
[![MySQL](https://img.shields.io/badge/MySQL-8.0-orange)](https://www.mysql.com/)

---

## Table of Contents

1. [Project Overview](#project-overview)  
2. [Features](#features)  
3. [Database Tables](#database-tables)  
4. [Backend APIs](#backend-apis)  
5. [Frontend Structure](#frontend-structure)  
6. [Project Setup](#project-setup)  
7. [Sample JSON Requests](#sample-json-requests)  
8. [Technologies Used](#technologies-used)  
9. [Author](#author)  
10. [License](#license)  

---

## Project Overview

**Celebrato** is a comprehensive **Event Management System** that allows clients to book events, select packages, leave testimonials, and contact organizers.  
Admins and staff can manage employees, events, packages, and inquiries.  

- **Backend:** Built with Spring Boot and MySQL  
- **Frontend:** Built with React, HTML, CSS, Bootstrap for responsive UI  

---

## Features

### Client-Side
- Browse event types (Personal & Social, Corporate & Business)  
- Select packages & pricing  
- Book events and manage bookings  
- Leave testimonials/feedback  

### Admin/Staff
- Manage Users/Clients  
- Manage Employees  
- Manage Events & Packages  
- View and respond to inquiries  
- View client testimonials  

---

## Database Tables

| Table        | Description                               |
|-------------|-------------------------------------------|
| users       | Stores client details                     |
| employees   | Stores employee and admin information     |
| events      | Stores event types and details            |
| packages    | Stores available event packages           |
| bookings    | Stores booking details (links user, event, package) |
| inquiries   | Stores client inquiries                    |
| testimonials| Stores client feedback and ratings        |

---

## Backend APIs

### Base URL
http://localhost:8080/api

### 1. Booking APIs
| Method | Endpoint               | Description                  |
|--------|-----------------------|------------------------------|
| GET    | `/bookings`            | Get all bookings             |
| GET    | `/bookings/{id}`       | Get booking by ID            |
| POST   | `/bookings`            | Create a new booking         |
| PUT    | `/bookings/{id}`       | Update a booking             |
| DELETE | `/bookings/{id}`       | Delete a booking             |

### 2. Testimonials APIs
| Method | Endpoint                  | Description                  |
|--------|---------------------------|------------------------------|
| GET    | `/testimonials`           | Get all testimonials         |
| GET    | `/testimonials/{id}`      | Get testimonial by ID        |
| POST   | `/testimonials`           | Create a new testimonial     |
| DELETE | `/testimonials/{id}`      | Delete a testimonial         |

### 3. Users APIs
- CRUD endpoints: `/users`

### 4. Events APIs
- CRUD endpoints: `/events`

### 5. Packages APIs
- CRUD endpoints: `/packages`

### 6. Employees APIs
- CRUD endpoints: `/employees`

### 7. Inquiries APIs
- CRUD endpoints: `/inquiries`


