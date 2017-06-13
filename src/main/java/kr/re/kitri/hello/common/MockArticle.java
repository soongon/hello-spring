package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class MockArticle {

    public List<Article> getArticles() {
        List<Article> list = new ArrayList<>();

        Article a = new Article();
        a.setArticleId("1");
        a.setTitle("1번 게시물입니다.");
        a.setAuthor("박찬호");
        a.setContent("박찬호는 한때 메이저리그에서 잘 던졌습니다. 아이엠에프때 많은 사람들에게 희망을 주었죠.");
        list.add(a);

        a = new Article();
        a.setArticleId("2");
        a.setTitle("2번 게시물입니다.");
        a.setAuthor("박세리");
        a.setContent("박세리도 한때 LPGA에서 우승을 많이 했죠. 아이엠에프때 많은 사람들에게 희망을 주었죠.");
        list.add(a);

        a = new Article();
        a.setArticleId("3");
        a.setTitle("3번 게시물입니다.");
        a.setAuthor("스칼렛 요한슨");
        a.setContent("괜찮아요. 깔끔한게");
        list.add(a);

        a = new Article();
        a.setArticleId("4");
        a.setTitle("4번 게시물입니다.");
        a.setAuthor("제니퍼 로렌스");
        a.setContent("탁월한 여배우입니다.");
        list.add(a);

        a = new Article();
        a.setArticleId("5");
        a.setTitle("5번 게시물입니다.");
        a.setAuthor("에바 그린");
        a.setContent("외모는 짱이에요.");
        list.add(a);

        return list;
    }
}
