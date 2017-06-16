package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-14.
 */
public class ArticleDaoJdbcTest {

    private ApplicationContext context;

    @Before
    public void setup() {
        context = new ClassPathXmlApplicationContext(
                        "classpath:spring/db.xml"
                        , "classpath:spring/applicationContext.xml");
    }

    @Test
    public void testSelectArticleById() {
        ArticleDaoJdbc dao = context.getBean("articleDaoJdbc", ArticleDaoJdbc.class);
        Article article = dao.selectArticleById("2");
        Assert.assertTrue(article.getAuthor().equals("lee"));
    }

    @Test
    public void testSelectAllArticles() {
        ArticleDaoJdbc dao = context.getBean("articleDaoJdbc", ArticleDaoJdbc.class);
        List<Article> list = dao.selectAllArticles();
        Assert.assertTrue(list.size() > 0);
        System.out.println(list.size());
        Assert.assertTrue(list.get(0).getAuthor().equals("kim"));
    }

    @Test
    public void testInsertArticle() {
        ArticleDaoJdbc dao = context.getBean("articleDaoJdbc", ArticleDaoJdbc.class);

        Article article = new Article();
        article.setArticleId("3");
        article.setTitle("테스트케이스");
        article.setAuthor("tc");
        article.setContent("테스트케이스 입니다.");

        dao.insertArticle(article);
    }
}
