package com.playdata.springbootproject.web.Dto;

import com.playdata.springbootproject.domain.blogs.Blogs;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BlogsListResponseDto {
    private Long id;
    private String title;
    private LocalDateTime createdDate;
    private String hikerid;
    private String pmntnsn;

    public BlogsListResponseDto(Blogs blogs) {
        this.id = blogs.getId();
        this.title = blogs.getTitle();
        this.createdDate = blogs.getCreatedDate();
        this.hikerid = blogs.getHikerid();
        this.pmntnsn = blogs.getPmntnsn();
    }
}