package kr.re.kitri.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by danawacomputer on 2017-06-12.
 */
@Controller
public class AmigoController {

    @RequestMapping(value="/amigo/regist", method=RequestMethod.GET)
    public String registAmigo() {
        return "amigo/regist";
    }

    @RequestMapping(value="/amigo/regist", method=RequestMethod.POST)
    public ModelAndView doRegist(@RequestParam String amigoName,
                                 @RequestParam String hpNum,
                                 @RequestParam String email) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/do_regist");
        mav.addObject("amigoName", amigoName);
        mav.addObject("hpNum", hpNum);
        mav.addObject("email", email);

        return mav;
    }
}
