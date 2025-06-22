# Singleton Pattern Example

This project demonstrates the Singleton design pattern in Java. It ensures that only one instance of the Logger class is created and shared across the application. 

The Logger class is designed with a private constructor and a static method to provide global access to the single instance. The implementation guarantees that any component using the logger refers to the same instance, making it ideal for centralized logging in larger systems.

A test class verifies that both references to the Logger object point to the same instance by checking their hashcodes. This project helps understand how the Singleton pattern enforces a controlled and consistent state across an application.
