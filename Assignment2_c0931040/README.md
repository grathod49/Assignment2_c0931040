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

## Project Structure
/Assignment2_c0931040
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── models
│   │   │   │   ├── Person.java
│   │   │   │   ├── BlogPost.java
│   │   │   │   ├── Blog.java
│   │   │   ├── Main.java
│   ├── test
│   │   ├── java
│   │   │   ├── tests
│   │   │   │   ├── PersonTest.java
│   │   │   │   ├── BlogPostTest.java
│   │   │   │   ├── BlogTest.java
│
│── person.json
│── blogPosts.json
│── pom.xml

