package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.MemberDao;
import kr.re.kitri.hello.dao.PostDao;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private PostDao postDao;

    /**
     * 글을 등록하고, 멤버에게 포인트를 10점 준다.
     * @param post
     */
    public void registPost(Post post) {
        postDao.insertPost(post);
        memberDao.updatePoint(post.getMemberSeq());
    }
}

