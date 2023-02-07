package com.jeasonzuo.service.impl;

import com.jeasonzuo.dao.PostDao;
import com.jeasonzuo.domain.Post;
import com.jeasonzuo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDao postDao;

    @Override
    public Post getById(Integer id) {
        return postDao.selectById(id);
    }

    @Override
    public List<Post> getAll() {
        return postDao.selectList(null);
    }
}
