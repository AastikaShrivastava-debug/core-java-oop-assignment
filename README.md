# Student Product Billing & Management System

## Author Details
**Your Name:** Aastika Shrivastava  
**Date:** 2026-04-13  

## Description
A small Java console-based application to manage student information, employee details, product details, and billing using Core Java and Object-Oriented Programming (OOP) concepts.

## Concepts Used
- **Class, Object, Fields, Methods:** Storing and displaying details.
- **Strings, String Methods:** Using `length()`, `toUpperCase()`, and `toLowerCase()`.
- **Arrays & Loops:** Array indexing and `for` loops.
- **Method Overloading & Polymorphism:** Implementing multiple methods with the same name for billing.
- **Constructor & `this` keyword:** Object initialization.
- **`static` Keyword:** Managing shared data (e.g., student counts, company name).
- **Encapsulation:** Protecting data using `private` variables and Getter/Setter methods.
- **Inheritance:** Creating a parent-child relationship between classes (`Student` and `CollegeStudent`).

## Folder Structure
```text
core-java-oop-assingnment/
│
├── src/
│   ├── Student.java
│   ├── CollegeStudent.java
│   ├── Employee.java
│   ├── Product.java
│   ├── ProductBilling.java
│   └── Main.java
│
├── screenshots/
│   └── output.png
│
└── README.md
```

## How to Run

1. Open a terminal or command prompt.
2. Navigate to the project root directory (`core-java-oop-assingnment`).
3. Compile all the Java files inside the `src` directory:
   ```bash
   javac src/*.java
   ```
4. Run the main execution file:
   ```bash
   java -cp src Main
   ```

## Sample Output

```text
--- Student Product Billing & Management System ---
Author: Aastika Srivastva

[US-01 & US-03] Student and Marks Array
Roll No: 101
Name: Nishika
Marks:
 - Mark 1: 85.5
 - Mark 2: 90.0
 - Mark 3: 78.5
 - Mark 4: 88.0
 - Mark 5: 92.5
Average Marks for Nishika: 86.9

[US-02] String Formatting
Original Name : Nishika
Uppercase     : NISHIKA
Lowercase     : nishika
Length of Name: 7

[US-08] College Student (Inheritance)
Roll No: 102
Name: Navya
Marks:
 - Mark 1: 75.0
 - Mark 2: 80.5
 - Mark 3: 79.0
 - folder: 88.5
 - Mark 5: 91.0
College Name: Global University
Average Marks for Navya: 82.8

[Bonus] Total Students Created (Static Tracking): 2

[US-05 & US-06] Employee Initialization & Shared Static Data
Company: Tech Institute
ID: 201
Name: Janhvi
Salary: $50000.0
-
Company: Tech Institute
ID: 202
Name: Anshika
Salary: $55000.0

[US-07] Product Encapsulation
Product 1: Laptop - $1200.0
Product 2: Mouse - $25.0
Product 3: Nimisha Special Keyboard - $45.0

[US-04] Product Billing (Method Overloading)
Bill for 1 product  (Laptop): $1200.0
Bill for 2 products (Laptop, Mouse): $1225.0
Bill for 3 products: $1270.0

[Bonus] Billing with 10% Discount on 2 products (Laptop, Mouse)
Discounted Bill: $1102.5

System execution completed successfully.
```
