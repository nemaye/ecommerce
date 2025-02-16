# ecommerce

## Project Structure
![image](https://github.com/user-attachments/assets/a8439332-13eb-49cc-a89c-52f771160f59)


## Features

✔ CRUD Operations for Products

✔ Spring Boot & JPA Integration

✔ Exception Handling (404 Not Found, 400 Bad Request)

✔ Input Validation (@NotBlank, @Min)

✔ H2 In-Memory Database (for quick testing)

## Detail

A simple RESTful API for managing products using Spring Boot, JPA, and Hibernate. This API allows users to create, retrieve, update, and delete (CRUD) products with built-in input validation and exception handling. 

For exception handling I've added constraints @NotNull and @Min for name and price. I've also used a centralised GlobalExceptionalHandler. In the service layer I've added ProductNotFoundException which is thrown whenever the user asks for a non existent Id for POST and UPDATE case. This exception is then thrown to the GlobalExceptionHandler

Thanks for going through my project!
