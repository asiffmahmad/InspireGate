# InspireGates

# InspireGate

Welcome to InspireGate, a blog platform dedicated to sharing inspirational and motivational content. This project aims to provide users with a seamless experience to read, share, and contribute to a collection of inspiring stories and articles.

---

## Features

- **User Authentication**: Secure login and registration using modern authentication practices.
- **Inspiring Content**: A platform to read and share inspirational stories and articles.
- **Responsive Design**: User-friendly and responsive interface built with modern web technologies.
- **Comment System**: Engage with the community by commenting on blog posts.
- **Admin Panel**: Manage posts, users, and comments through an intuitive admin panel.
- **Search Functionality**: Easily find posts with a powerful search feature.
- **Social Sharing**: Share your favorite posts on social media platforms.
- **User Profiles**: Personalized user profiles to showcase contributions and interactions.

---

## Services
**Backend
login Service:- 
				1)create User
				2)modify User
				3)Delete User
				4)

## Login Form Details

- **Username**: Case sensitive
- **Password**: Not case sensitive

---

## Frontend

- **Technology**: Angular Forms

### Components

- **Login Form**: Allows users to log in
- **Welcome Form**: Displays a random inspirational quote upon successful login

---

## Backend Services

1. **Login Service**:
    - Handles user authentication and home page loading.
    - Functions:
        - Create User
        - Validate User
        - Modify User
        - Delete User

### Technologies Used

- Java 17
- Spring Data JPA
- Lombok
- MySQL
- Postman for API testing

---

## User Management

- **Auto Username Generation**: Automatically generate unique usernames for new users.

### Operations

- **Add User**
- **Modify User**
- **Delete User**
- **Get User Details**

---

## Quote Management

- **Random Quote Display**: Show a random inspirational quote on the welcome page.

---

## OTP Validation

- **Mobile and Email**: Two-factor authentication using OTPs sent to both mobile and email.

---

## Installation Instructions

1. **Clone the Repository**:
    
    ```bash
    bashCopy code
    git clone https://github.com/yourusername/inspiregate.git
    cd inspiregate
    
    ```
    
2. **Backend Setup**:
    - Ensure Java 17 is installed.
    - Configure MySQL database settings in `src/main/resources/application.properties`.
    - Build and run the backend:
        
        ```bash
        bashCopy code
        ./mvnw clean install
        ./mvnw spring-boot:run
        
        ```
        
3. **Frontend Setup**:
    - Navigate to the frontend directory:
        
        ```bash
        bashCopy code
        cd frontend
        
        ```
        
    - Install dependencies and start the Angular application:
        
        ```bash
        bashCopy code
        npm install
        ng serve
        
        ```
        

---

## Usage

- **Access the Website**: Open your browser and navigate to `http://localhost:4200`.
- **Login/Register**: Create an account or log in to start exploring and contributing to the blog.
- **Read and Share Posts**: Browse through various categories of inspirational content and share posts on social media.
- **Comment on Posts**: Engage with other users by commenting on posts.
- **Admin Panel**: Admins can manage content and users through the admin panel.

---

## Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a pull request.

---

## License

This project is licensed under the MIT License - see the LICENSE file for details.

---

## Contact

For any questions or feedback, please contact us at:

- Email: support@inspiregate.com
- Twitter: [@InspireGate](https://twitter.com/InspireGate)
- Facebook: [InspireGate](https://facebook.com/InspireGate)