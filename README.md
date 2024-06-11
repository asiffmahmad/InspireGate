InspireGate

InspireGate is a secure and motivational login system that combines modern authentication practices with daily inspirational quotations. Built with Angular for the frontend and Java 17 for the backend, InspireGate ensures a smooth and secure user experience.

Table of Contents
Features
Technologies Used
Installation
Usage
API Endpoints
Contributing
License
Features
User Authentication: Secure login and registration using Java 17 and Spring Data JPA.
Inspirational Quotes: Display a random inspirational quote upon successful login.
Auto Username Generation: Automatically generate unique usernames for new users.
User Management: Add, modify, and delete users.
OTP Validation: Two-factor authentication via mobile and email OTP.
RESTful API: Full CRUD operations for user management using POSTMAN methods.
Responsive Design: Frontend built with Angular Forms ensuring a responsive and user-friendly interface.
Technologies Used
Frontend
Angular
Angular Forms
Backend
Java 17
Spring Data JPA
Lombok
MySQL
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/inspiregate.git
cd inspiregate
Backend Setup:

Ensure you have Java 17 installed.
Configure MySQL database settings in src/main/resources/application.properties.
Build and run the backend:
bash
Copy code
./mvnw clean install
./mvnw spring-boot:run
Frontend Setup:

Navigate to the frontend directory:
bash
Copy code
cd frontend
Install dependencies and start the Angular application:
bash
Copy code
npm install
ng serve
Usage
Login Form: Access the login form at http://localhost:4200/login.
Welcome Form: Upon successful login, users are greeted with a random inspirational quote.
User Management: Use the provided API endpoints to manage users.
API Endpoints
User Management
Add User: POST /api/users
Modify User: PUT /api/users/{id}
Delete User: DELETE /api/users/{id}
Get User: GET /api/users/{id}
OTP Validation
Send OTP: POST /api/otp/send
Validate OTP: POST /api/otp/validate
Contributing
We welcome contributions! Please follow these steps:

Fork the repository.
Create a new branch (git checkout -b feature-branch).
Make your changes.
Commit your changes (git commit -m 'Add new feature').
Push to the branch (git push origin feature-branch).
Create a pull request.
License
This project is licensed under the MIT License - see the LICENSE file for details.
