package com.blogAPIs.api.service;

import com.blogAPIs.api.model.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {

    public List<Blog> getAllBlogs();

    public Optional<Blog> getBlogById(Long id);

    public Blog createBlog(Blog blog);

    public Blog updateBlog(Blog blog);

}
