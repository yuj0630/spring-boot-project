package com.playdata.springbootproject.domain.post;

import com.playdata.springbootproject.domain.post.Posts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Long>
{

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
