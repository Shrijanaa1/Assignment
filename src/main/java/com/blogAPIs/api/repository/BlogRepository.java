package com.blogAPIs.api.repository;

import com.blogAPIs.api.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    //all crud database operations

}
