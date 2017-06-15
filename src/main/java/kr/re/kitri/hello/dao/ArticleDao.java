package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class ArticleDao {

    @Autowired
    private DataSource dataSource;

    public void insertArticle(Article article) {

        try {
            //1. connection 확보
            Connection conn = dataSource.getConnection();

            //2. 쿼리를 생성 - PreparedStatement 생성
            String query =
                    "insert into article (article_id, title, author, content)\n" +
                    "VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(article.getArticleId()));
            pstmt.setString(2, article.getTitle());
            pstmt.setString(3, article.getAuthor());
            pstmt.setString(4, article.getContent());

            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}









