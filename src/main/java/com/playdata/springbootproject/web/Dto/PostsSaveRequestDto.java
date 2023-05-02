package com.playdata.springbootproject.web.Dto;

import com.playdata.springbootproject.domain.Posts;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class PostsSaveRequestDto {
    private String title;

    private String content;

    private String author;

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
