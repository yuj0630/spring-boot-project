package com.playdata.springbootproject.web.Dto;

import com.playdata.springbootproject.domain.blogs.Blogs;
import lombok.Getter;

@Getter
public class BlogsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String hikerid;
    private String pmntnsn;
    public BlogsResponseDto(Blogs entity) {
        this.id=entity.getId();
        this.title= entity.getTitle();
        this.content=entity.getContent();
        this.hikerid=entity.getHikerid();
        this.pmntnsn=entity.getPmntnsn();
    }
}