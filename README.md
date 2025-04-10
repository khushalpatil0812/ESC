# ESC
#Change the branch to  main to masters so you can saw the code 

Shopping Cart  
=============

A simple and functional E-commerce Web Application built using JSP & Servlets, with MySQL as the backend and an integrated email notification system for order tracking.

Features  
--------

- Browse and add products to cart  
- User registration & login  
- Place and track orders  
- Email confirmation on successful order  
- Admin product management (Add, Edit, Delete)  
- Secure session handling

Tech Stack  
----------

- Frontend: HTML, CSS, JSP  
- Backend: Java Servlets  
- Database: MySQL  
- Email Service: JavaMail API

Email Notification System  
-------------------------

On placing an order, users receive an automated email with their order summary and tracking details using the JavaMail API. This feature simulates real-world e-commerce interaction.

How to Run  
----------

1. Clone the repository  
   git clone https://github.com/your-username/shopping-cart.git

2. Import the project into Eclipse or IntelliJ IDEA as a Java web project.

3. Set up MySQL and import the database using the included `.sql` file.

4. Configure your email credentials for JavaMail:  
   final String username = "your_email@example.com";  
   final String password = "your_email_password";

5. Deploy the project on Apache Tomcat and run it.

6. Open in browser:  
   http://localhost:8080/shopping-cart/



About Me  
--------

Hi, I’m Khushal Patil, an MCA student from MIT-WPU Pune, passionate about Java development, building real-world applications, 
and constantly exploring new tech. This project was built to apply my knowledge of web development and backend systems in Java.
