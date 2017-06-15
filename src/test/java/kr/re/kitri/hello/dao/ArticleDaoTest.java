package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by danawacomputer on 2017-06-14.
 */
public class ArticleDaoTest {

    private ApplicationContext context;

    @Before
    public void setup() {
        context = new ClassPathXmlApplicationContext(
                        "classpath:spring/db.xml"
                        , "classpath:spring/applicationContext.xml");
    }


    @Test
    public void testInsertArticle() {
        ArticleDao dao = context.getBean("articleDao", ArticleDao.class);

        Article article = new Article();
        article.setArticleId("3");
        article.setTitle("테스트케이스");
        article.setAuthor("tc");
        article.setContent("테스트케이스 입니다.");

        dao.insertArticle(article);
    }
}
