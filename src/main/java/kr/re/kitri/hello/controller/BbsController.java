package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockArticle;
import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *  /bbs ..전체보기
 *  /bbs/{articleId} .. 상세보기(15번 글)
 *  /bbs/{articleId}/modify .. 수정(15번 글 수정)
 *  /bbs/{articleId}/remove .. 삭제(15번 글 삭제)
 *
 *  /bbs/write .. 글 작성화면 로딩
 *  /bbs/write/do .. 글 작성하기
 *
 */
@Controller
@RequestMapping("/bbs")
public class BbsController {

    @Autowired
    private BbsService service;

    /**
     * 전체보기
     */
    @RequestMapping("")
    public ModelAndView viewAll() {

        //전체보기를 하기위한 데이터를 가져온다.
        List<Article> list = service.getArticles();

        return new ModelAndView("bbs/view_all")
                .addObject("list", list);
    }

    /**
     * 글 상세보기
     * @param articleId
     */
    @RequestMapping("/{articleId}")
    public ModelAndView viewDetail(@PathVariable String articleId) {

        Article article = service.viewArticle(articleId);

        return new ModelAndView("bbs/view_detail")
                .addObject("article", article);
    }

    /**
     * 글쓰기 화면 보기
     */
    @GetMapping("/write")
    public String write() {
        return "bbs/write";
    }

    /**
     * 실제 글쓰기
     * @param article
     */
    @PostMapping("/write")
    public ModelAndView doWrite(Article article) {

        System.out.println(article);

        service.registArticle(article);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/do_write");
        mav.addObject("article", article);

        return mav;
    }

    /*@RequestMapping("/write/do")
    public String doWrite(HttpServletRequest request) {

        String articleId = request.getParameter("article_id");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String content = request.getParameter("content");

        System.out.println(articleId);
        System.out.println(title);
        System.out.println(author);
        System.out.println(content);

        return "do_write";
    }*/
}

