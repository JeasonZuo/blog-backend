package com.jeasonzuo;

import com.jeasonzuo.dao.PostDao;
import com.jeasonzuo.domain.Post;
import com.jeasonzuo.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {
	@Autowired
	private PostService postService;

	@Test
	void getPostByIdTest() {
		Post post = postService.getById(1);
		System.out.println(post);
	}

}
