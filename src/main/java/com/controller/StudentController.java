package com.controller;

import com.entity.Directions;
import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/news")
    public ModelAndView method(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("new");
        modelAndView.addObject("nums",99);
        return modelAndView;
    }


    @CrossOrigin(origins = "*")
    @RequestMapping("/validate")
    @ResponseBody
    public String validate(@RequestParam String username, @RequestParam String pwd){
        System.out.println(username+pwd);
        boolean b=studentService.validateStudent(username,pwd);
        if (b){
            return "登陆成功";
        }else {
            return "登陆失败";
        }
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/SelectByName")
    @ResponseBody
    public List<Student> SelectByName(@RequestParam String name){
        return studentService.selectByName(name);
    }


    @CrossOrigin(origins = "*")
    @RequestMapping("/selectAllDirect")
    @ResponseBody
    public List<Directions> selectAllDirect(){
       return studentService.selectAllDirect();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/selectStudentById")
    @ResponseBody
    public Student selectStudentById(@RequestParam int nameid){
        return studentService.selectById(nameid);
    }


}
