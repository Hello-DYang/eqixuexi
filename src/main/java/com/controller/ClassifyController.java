package com.controller;

import com.entity.Centre;
import com.entity.Classify;
import com.entity.Directions;
import com.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClassifyController {
    @Autowired
    private ClassifyService classifyService;


    //---------育人项目展示------------------
    @CrossOrigin(origins = "*")
    @RequestMapping("/selectAllClassify")
    @ResponseBody
    public List<Classify> selectAllClassify(){
        return classifyService.selectAllClassify();
    }


    //------------学习中心-----------------
    @CrossOrigin(origins = "*")
    @RequestMapping("/selectCentreCourse")
    @ResponseBody
    public List<Centre> selectCentreCourse(@RequestParam("sid") int sid){
        return classifyService.selectCourseAndCentre(sid);
    }
}
