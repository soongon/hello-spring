package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class AmigoDao {

    @Autowired
    private DataSource dataSource;

    public void insertAmigo(Amigo amigo) {

        String query = "insert INTO amigo (name, hp_num, email)\n" +
                "    VALUES (?, ?, ?)";

        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, amigo.getName());
            pstmt.setString(2, amigo.getHpNum());
            pstmt.setString(3, amigo.getEmail());
            pstmt.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
