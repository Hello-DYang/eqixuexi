package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @RequestMapping("/hello")
    public String Hello(){
        return "hello";
    }

    @RequestMapping("/news")
    public ModelAndView method(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("new");
        modelAndView.addObject("nums",99);
        return modelAndView;
    }
}
