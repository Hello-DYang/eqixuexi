package com.controller;

import com.entity.*;
import com.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

//-----------------首页视图展示------------------
    @CrossOrigin(origins = "*")
    @RequestMapping("/allDirections")
    @ResponseBody
    public List<Directions> allDirections(){
        return courseService.selectAll();
    }

//------------------轮播图---------------------
    @CrossOrigin(origins = "*")
    @RequestMapping("/allCarouse")
    @ResponseBody
    public List<Carousel> selectAllCarouse(){
        return courseService.selectAllCarouse();
    }

//---------------课程资源展示------------------
    @CrossOrigin(origins = "*")
    @RequestMapping("/allCourse")
    @ResponseBody
    public List<Course> selectAllCourse(){
        return courseService.selectAllCourse();
    }

//----------------课程搜索-----------------
@CrossOrigin(origins = "*")
@RequestMapping("/selectByContent")
@ResponseBody
public List<Course> validate(@RequestParam String content) {
    System.out.println(content);
    List<Course> courses=courseService.selectByContent(content);
    System.out.println(courses);
    return courses;
}
//------------------传递字段------------
    @CrossOrigin(origins = "*")
    @RequestMapping("/content")
    @ResponseBody
    public String content(@RequestParam String content) {
        String newContent=content;
        System.out.println(content);
        return newContent;
    }

//--------------------查询章节-----------------
    @CrossOrigin(origins = "*")
    @RequestMapping("/selectByCourseId")
    @ResponseBody
    public List<Chapter> selectByCourseId(@RequestParam int id){
        return courseService.selectByCourseId(id);
    }
//--------------------视频号码------------------
     @CrossOrigin(origins = "*")
     @RequestMapping("/selectSessionById")
     @ResponseBody
     public Session selectSessionById(@RequestParam int num){
         return courseService.selectSessionById(num);
     }
//--------------------按时间查询------------------
    @CrossOrigin(origins = "*")
    @RequestMapping("/selectByTime")
    @ResponseBody
    public List<Course> selectByTime(@RequestParam("date") String date){
        //2019-2020-1-2
        String lastTime=date.substring(date.indexOf("-")+1);
        String first=date.substring(0,date.indexOf("-"));
        String firstTime=first+"-1-1";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        List<Course> courseList=null;
        try {
            Date firstTime1=simpleDateFormat.parse(firstTime);
            Date lastTime1=simpleDateFormat.parse(lastTime);
            courseList= courseService.selectByTime(firstTime1,lastTime1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  courseList;
    }
    @CrossOrigin(origins = "*")
    @RequestMapping("/insertCourse")
    @ResponseBody
    public String insertCourse(@RequestParam("coursename") String coursename,@RequestParam("classifyid") int classifyid,@RequestParam("coursefile") String coursefile,@RequestParam("fbtime") String fbtime,@RequestParam("directionid") int directionid,@RequestParam("id") int id){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date fbtime1= null;
        try {
            fbtime1 = simpleDateFormat.parse(fbtime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        boolean flag=courseService.insertCourse(coursename,classifyid,coursefile,fbtime1,directionid,id);
        if (flag){
            return "发布成功";
        }else {
            return "发布失败";
        }
    }
     }

