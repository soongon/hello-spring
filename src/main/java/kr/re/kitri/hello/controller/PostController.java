package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Post;
import kr.re.kitri.hello.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * /post/write (GET) .. 글쓰기 화면
 * /post/write (POST) .. 글 쓰기
 */
@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/write")
    public String write() {
        return "post/write";
    }

    @PostMapping("/write")
    public ModelAndView doWrite(Post post) {

        postService.registPost(post);
        return null;
    }

}
