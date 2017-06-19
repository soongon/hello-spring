package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleDaoSpringJdbc implements ArticleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Article> articleMapper =
            (rs, i) -> {
                Article article = new Article();
                article.setArticleId(rs.getString(1));
                article.setTitle(rs.getString(2));
                article.setAuthor(rs.getString(3));
                article.setContent(rs.getString(4));
                return article;
            };

    @Override
    public void insertArticle(Article article) {

        String query =
                "insert into article (article_id, title, author, content)\n" +
                        "VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(
                query,
                Integer.parseInt(article.getArticleId()),
                article.getTitle(),
                article.getAuthor(),
                article.getContent());
    }

    @Override
    public Article selectArticleById(String articleId) {
        String query =
                "SELECT article_id, title, author, content\n" +
                        "FROM article\n" +
                        "WHERE article_id = ?";

        return jdbcTemplate.queryForObject(
                query, articleMapper, Integer.parseInt(articleId));
    }

    @Override
    public List<Article> selectAllArticles() {
        String query =
                "SELECT article_id, title, author, content\n" +
                        "FROM article";

        return jdbcTemplate.query(query, articleMapper);
    }
}









