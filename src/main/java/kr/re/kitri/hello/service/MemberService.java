package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.MemberDao;
import kr.re.kitri.hello.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberDao memberDao;

    public void registMember(Member member) {
        memberDao.insertMember(member);
    }
}
