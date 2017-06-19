package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * /members .. 회원 전체보기
 * /member/regist (GET) .. 회원 가입화면 이동
 * /member/regist (POST) .. 회원가입
 */
@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public String regist() {
        return "member/regist";
    }

    @PostMapping
    public String doRegist(Member member) {
        memberService.registMember(member);
        return "member/regist_ok";
    }
}
