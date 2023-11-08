package com.example.develop.sample;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @RequestMapping(value="/index", method = {RequestMethod.POST, RequestMethod.GET})
    public String index(HttpServletRequest request, Model model) {

        System.out.println("인덱스 페이지 호출");
        model.addAttribute("test", "테스트");
        return "index";
    }

    @RequestMapping(value="/sample/dashboard", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView dashboard() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sample/dashboard");
        return mv;
    }

}