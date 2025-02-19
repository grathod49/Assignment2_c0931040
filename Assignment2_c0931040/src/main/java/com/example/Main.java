package com.example;

import com.example.model.Person;
import com.example.model.Blog;
import com.example.model.BlogPost;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON files
            List<Person> people = List.of(objectMapper.readValue(new File("person.json"), Person[].class));
            List<BlogPost> blogPosts = List.of(objectMapper.readValue(new File("blogPosts.json"), BlogPost[].class));

            // Create Blog instance
            Blog blog = new Blog(blogPosts, people);

            // Example use-case
            int ageToSearch = 25;
            List<String> postIds = blog.getPostsByAuthorAge(ageToSearch);
            System.out.println("Blog Posts by Authors Aged " + ageToSearch + ": " + postIds);

            System.out.println("Total Blog Posts: " + blogPosts.size());
            System.out.println("Total Contributors: " + people.size());

        } catch (Exception e) {
            System.err.println("Error reading JSON: " + e.getMessage());
        }
    }
}
