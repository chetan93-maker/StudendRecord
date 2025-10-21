Student Management System
A simple Java-based console application for managing student records. This system allows users to perform basic CRUD (Create, Read, Update, Delete) operations on student data.

Features
Add Student: Add new student records with ID, name, and marks

View Students: Display all existing student records

Update Student: Modify existing student information

Delete Student: Remove student records from the system

Exit System: Cleanly exit the application

Project Structure
text
src/
├── com/std/
│   ├── Student.java          # Student entity class
│   ├── StudentService.java   # Business logic and operations
│   └── MainClass.java        # Main application entry point
Classes Overview
1. Student.java
The entity class that represents a student with the following attributes:

stdID: Student ID (integer)

Name: Student name (string)

marks: Student marks (double)

Methods:

Constructor to initialize student objects

Getter and setter methods for all attributes

Display(): Method to print student details

2. StudentService.java
Service class that contains the core business logic and operations.

Key Methods:

AddStudent(): Collects input and adds new student

ViewStudent(): Displays all students or shows message if no records exist

updateStudent(): Updates student information based on ID

DeleteStudent(): Removes student record based on ID

3. MainClass.java
Main application class that provides the user interface and menu system.

Features:

Continuous menu loop until user chooses to exit

Switch-case for handling user choices

Clean console interface

How to Run
Compile all Java files:

bash
javac com/std/*.java
Run the main class:

bash
java com.std.MainClass
Usage Instructions
Adding a Student:

Select option 1 from the menu

Enter Student ID, Name, and Marks when prompted

System confirms successful addition

Viewing Students:

Select option 2 from the menu

View all student records in the system

If no records exist, appropriate message is displayed

Updating a Student:

Select option 3 from the menu

Enter the Student ID you want to update

Provide new name and marks

System confirms successful update

Deleting a Student:

Select option 4 from the menu

Enter the Student ID you want to delete

System confirms successful deletion

Exiting the System:

Select option 5 to exit the application

Technical Details
Data Storage: Uses ArrayList for in-memory storage (data is lost when program exits)

Input Handling: Uses Scanner class for user input

Package: All classes are in com.std package

Error Handling: Basic validation for student existence

Limitations
Data is not persisted (lost when program closes)

No input validation for duplicate student IDs

No data export functionality

Basic error handling

Future Enhancements
Add data persistence using files or database

Implement input validation

Add search functionality

Include data export features

Add input sanitization

Implement proper exception handling

Requirements
Java 8 or higher

No external dependencies required

This system provides a basic foundation for student management and can be extended with additional features
