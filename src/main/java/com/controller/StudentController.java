package com.controller;

import com.service.StudentService;
import com.service.studentServiceImpl.StudentServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

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


    @CrossOrigin(origins = "*")
//    @PostMapping("/validate")
    @RequestMapping("/validate")
    @ResponseBody
    public String validate(@RequestParam String username, @RequestParam String pwd){
        System.out.println(username+pwd);
        boolean b=studentService.validateStudent(username,pwd);
        if (b){
            return "登陆成功！！";
        }else {
            return "登陆失败!!";
        }
    }

}
