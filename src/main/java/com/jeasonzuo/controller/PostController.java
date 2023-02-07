package com.jeasonzuo.controller;

import com.jeasonzuo.domain.Post;
import com.jeasonzuo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("post")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping("/{id}")
    public Result getPostById(@PathVariable Integer id) {
        Post post = postService.getById(id);
        return new Result(Code.GET_OK , post);
    }

}
