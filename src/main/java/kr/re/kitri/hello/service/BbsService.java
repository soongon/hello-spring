package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.ArticleDao;
import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 기능을 수행하는 클래스
 * 각 메소드는 해당 기능을 수행한다.
 */
@Service
public class BbsService {

    @Autowired
    private ArticleDao dao;

    /**
     * 글쓰기
     * @param article
     */
    public void registArticle(Article article) {

        dao.insertArticle(article);
    }

    /**
     * 글 전체 보기
     * @return 전체 글
     */
    public List<Article> viewArticles() {

        return null;
    }

    /**
     * 상세 글보기
     * @param articleId 글번호
     * @return 글
     */
    public Article viewArticle(String articleId) {
        return null;
    }
}

