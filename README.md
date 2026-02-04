# Student Class Implementation

## Project Overview
This project is a Java-based implementation of a `Student` class. The goal was to practice core Object-Oriented Programming (OOP) concepts such as encapsulation, constructors, and method overriding.

## Features
- **Encapsulation**: Uses private fields for `name`, `id`, and `gpa`.
- **Data Validation**: The constructor ensures the GPA is clamped between 0.0 and 4.0.
- **Object Comparison**: Custom `equals()` and `hashCode()` methods to compare students by their unique ID.
- **Readability**: An overridden `toString()` method for human-readable output.
- **Copy Constructor**: Allows for the creation of a new Student object based on an existing one.

## How to Run
1. Ensure you have the Java Development Kit (JDK) installed.
2. Download or clone `Student.java`.
3. Open your terminal or command prompt.
4. Compile the code:
   ```bash
   javac Student.java
