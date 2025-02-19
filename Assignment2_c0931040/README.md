# BlogApp - Java Project

**Author:** Grishmkumar Rathod  
**Student ID:** C0931040  

## Project Overview

This is a simple Java project designed to manage a blog system. The project includes classes representing **Person**, **BlogPost**, and **Blog**, along with functionality to filter blog posts by the author's age. The project also integrates input validation and JSON data reading, providing a foundation for a small-scale blog system.

## Features

- **Person Class**: A class representing a person with ID, first name, last name, age, and gender. Includes validation and provides getters, `toString()`, and `equals()` methods.
  
- **BlogPost Class**: A class representing a blog post, including fields like post ID, author ID, and post content. Includes validation and essential methods.

- **Blog Class**: Manages a collection of blog posts and contributors. Includes a method `getPostsByAuthorAge()` that uses Java Streams to filter posts by the author's age.

- **Main Class**: Reads data from `person.json` and `blogPosts.json`, creates a `Blog` instance, and demonstrates functionality like filtering posts by author's age.

- **Unit Tests**: Validates functionality by testing object creation, exception handling, and filtering logic.

## Directory Structure
```plaintext
Assignment2_c0931040/
├── src/
│   ├── main/java/
│   │   └── com/example/
│   │       ├── Main.java
│   │       └── model/
│   │           ├── Blog.java
│   │           ├── BlogPost.java
│   │           └── Person.java
│   └── test/java/
│       └── com/example/model/
│           ├── BlogPostTest.java
│           ├── BlogTest.java
│           └── PersonTest.java
├── blogPosts.json
├── person.json
└── README.md
```

---

## How to Clone the Project
1. Open a terminal or command prompt.
2. Run the following command to clone the repository:
   ```bash
   git clone https://github.com/grathod49/Assignment2_c0931040.git


## How to Run the Project
1. Ensure you have **JDK 8 or higher** installed.
2. Open the project in your favorite Java IDE (e.g., Eclipse).
3. Navigate to `Main.java` under `src/main/java/com/example/` and run the file.

---

## Running the Tests
1. Make sure JUnit 5 is properly configured in the project.
2. Right-click on any test file (e.g., `BlogTest.java`) and select **Run as JUnit Test**.
3. Alternatively, run all tests by selecting the `src/test/java/` directory and running all tests together.

---

## Data Files
- `blogPosts.json`: Sample data for `BlogPost`.
- `person.json`: Sample data for `Person`.

---

## Dependencies
- **JUnit 5** for testing.

---

## Author
*Grishmkumar Rathod*
