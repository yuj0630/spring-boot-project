package com.playdata.springbootproject.domain;

import com.playdata.springbootproject.domain.post.Posts;
import com.playdata.springbootproject.domain.post.PostsRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Repository
class PostsRepositoryTest {
    @Autowired
    PostsRepository postRepository;

    @AfterEach
    public void cleanup(){
        postRepository.deleteAll();
    }

    @Test
    public void saveAndLoad(){
        // given
        String title = "테스트 게시글";
        String content = "테스트 본문";
        String author = "playdata";

        postRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build());

        // when
        Posts posts = postRepository.findAll().get(0);

        // then
        assertEquals(posts.getTitle(), title);
        assertEquals(posts.getContent(), content);
        assertEquals(posts.getAuthor(), author);
    }

    @Test
    public void auditingEntity(){

        String title = "title";
        String content = "content";
        String author = "author";
        LocalDateTime now = LocalDateTime.now();

        postRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build());

        //when
        Posts posts = postRepository.findAll().get(0);

        //then
        assertThat(posts.getCreatedDate()).isAfter(now);
        assertThat(posts.getModifiedDate()).isAfter(now);
    }

}