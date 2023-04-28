package com.playdata.springbootproject.domain;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface PostsRepository extends JpaRepository<Posts, Long>
{

}
