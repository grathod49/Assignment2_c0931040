package com.example.model;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BlogTest {
    @Test
    void shouldReturnCorrectPostsByAuthorAge() {
        Person p1 = new Person("1", "John", "Doe", 30, "Male");
        Person p2 = new Person("2", "Jane", "Smith", 25, "Female");

        BlogPost bp1 = new BlogPost("101", "1", "Post 1");
        BlogPost bp2 = new BlogPost("102", "1", "Post 2");
        BlogPost bp3 = new BlogPost("103", "2", "Post 3");

        Blog blog = new Blog(List.of(bp1, bp2, bp3), List.of(p1, p2));
        List<String> result = blog.getPostsByAuthorAge(30);

        assertEquals(2, result.size());
        assertTrue(result.contains("101"));
        assertTrue(result.contains("102"));
    }
}
