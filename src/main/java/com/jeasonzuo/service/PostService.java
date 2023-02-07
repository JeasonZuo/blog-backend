package com.jeasonzuo.service;

import com.jeasonzuo.dao.PostDao;
import com.jeasonzuo.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostDao postDao;

    public Post getById(Integer id) {
        return postDao.getById(id);
    }
}
