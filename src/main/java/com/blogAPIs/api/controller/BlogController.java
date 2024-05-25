package com.blogAPIs.api.controller;

import com.blogAPIs.api.model.Blog;
import com.blogAPIs.api.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;

    //Get all blogs
    @GetMapping
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    //get blog by id
    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable Long id) {
        Optional<Blog> blog = blogService.getBlogById(id);
        if (blog.isPresent()) {
            return ResponseEntity.ok(blog.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //post blog
    @PostMapping
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog) {
        Blog createdBlog = blogService.createBlog(blog);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBlog);
    }

    //update blog
    @PutMapping
    public Blog updateBlog( @RequestBody Blog blog){
        return blogService.updateBlog(blog);
    }

}
