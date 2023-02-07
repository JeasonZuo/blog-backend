package com.jeasonzuo.domain;

import lombok.Data;

@Data
public class Post {
    private Integer id;
    private Integer create_time;
    private Integer modify_time;
    private Integer delete_time;
    private String title;
    private String content;
}
