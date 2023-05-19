package com.playdata.springbootproject.web.Dto;

import com.playdata.springbootproject.domain.post.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListRequestDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime createdDate;

    public PostsListRequestDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.createdDate = entity.getCreatedDate();
    }
}
