
🎉 Celebrato – Event Management System

Celebrato is a full-stack web application designed to streamline the planning and management of personal and corporate events. It provides users with a smooth interface to browse, inquire, and book events, while admins can efficiently manage inquiries, bookings, and packages.

🔹 Features

User Side:
Browse different event types: Personal (Weddings, Birthdays, Baby Showers, etc.) and Corporate (Meetings, Product Launches, Annual Gatherings, etc.)
View event packages and detailed services
Submit event inquiries via a form
Responsive, interactive interface with smooth animations
Contact form for easy communication

Admin Side:
Manage inquiries and bookings
Add, update, and remove event packages
View client and event details
Dashboard for organized event management

🔹 Technologies Used
Front-end: HTML, CSS, Bootstrap, JavaScript
Back-end: Java (Spring Boot, Hibernate)
Database: MySQL

Tools & Libraries: VS Code, Postman, Live Server (for front-end testing),Eclipse , MySql Workbench

🔹 Project Structure
Celebrato/
│
├── backend/             # Spring Boot application
│   ├── src/main/java/   # Java source code
│   ├── src/main/resources/ 
│   │   └── application.properties (DB config)
│   └── pom.xml          # Maven dependencies
│
├── frontend/            # HTML, CSS, JS, Bootstrap
│   ├── index.html
│   ├── about.html
│   ├── services.html
│   ├── contact.html
│   └── assets/          # Images, CSS, JS files
│
└── README.md            # Project documentation

🔹 Database Setup
The project uses MySQL to store client inquiries, event bookings, and package information.
Tables:
users – Stores client details
events – Stores event types and packages
inquiries – Stores inquiries submitted via the form
bookings – Stores confirmed bookings

Database Connectivity: Configured via application.properties in Spring Boot backend:

spring.datasource.url=jdbc:mysql://localhost:3306/celebrato_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Note: You need a local MySQL server to run the backend. Without a live MySQL instance, the backend cannot fully function online.

🔹 How to Run Locally

Clone the repository:
git clone https://github.com/yourusername/celebrato.git

Set up MySQL Database:
Create a database celebrato_db
Import any SQL script if provided or let Hibernate auto-create tables

Configure backend:
Update application.properties with your DB credentials

Run backend:
mvn spring-boot:run

Open frontend:
Use Live Server in VS Code to serve index.html and other pages

🔹 Live Demo Limitation

Currently, the live demo is not available because the project requires a MySQL database, which cannot be freely hosted online alongside GitHub Pages. Form submissions and database-dependent features will not work without a backend server connected to a live database.

Recommendation:
Run locally with backend + MySQL to see full functionality
Alternatively, deploy backend on platforms like Render or Heroku and connect to a cloud MySQL service like Remote MySQL for a fully live demo
