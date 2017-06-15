package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Amigo;
import kr.re.kitri.hello.service.AmigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *  /amigo .. 친구 전체보기
 *  /amigo/regist (GET) .. 친구 등록화면으로 이동
 *  /amigo/regist (POST) .. 친구 등록
 *  /amigo/{id} .. 친구 상세보기
 *  /amigo/{id}/modify (GET) .. 친구 수정하기 화면으로 이동
 *  /amigo/{id}/modify (POST) .. 친구 수정하기
 *  /amigo/{id}/remove (GET) .. 친구 삭제하기
 *
 */
@Controller
@RequestMapping("/amigo")
public class AmigoController {

    @Autowired
    private AmigoService service;

    /**
     * 친구 등록화면 이동
     */
    @GetMapping("/regist")
    public String registAmigo() {
        return "amigo/regist";
    }

    /**
     * 친구 등록 수행
     */
    @PostMapping("/regist")
    public ModelAndView doRegist(Amigo amigo) {

        service.registAmigo(amigo);

        return new ModelAndView("amigo/regist_ok")
                .addObject("amigo", amigo);
    }
}
