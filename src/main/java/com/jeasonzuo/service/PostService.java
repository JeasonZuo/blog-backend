package com.jeasonzuo.service;

import com.jeasonzuo.domain.Post;

import java.util.List;

public interface PostService {
    public Post getById(Integer id);

    public List<Post> getAll();
}
