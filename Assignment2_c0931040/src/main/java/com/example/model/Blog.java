package com.example.model;

import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@ToString
@EqualsAndHashCode
public class Blog {
    private final List<BlogPost> posts;
    private final List<Person> contributors;

    public Blog(List<BlogPost> posts, List<Person> contributors) {
        this.posts = posts;
        this.contributors = contributors;
    }
    
    public List<String> getPostsByAuthorAge(Integer age) {
        return posts.stream()
                .filter(post -> contributors.stream()
                        .anyMatch(person -> person.getId().equals(post.getAuthorId()) && person.getAge().equals(age)))
                .map(BlogPost::getId)
                .collect(Collectors.toList());
    }
}
