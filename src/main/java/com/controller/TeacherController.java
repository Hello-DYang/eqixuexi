package com.controller;

import com.entity.Course;
import com.entity.Student;
import com.entity.Teacher;
import com.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
//查询所有老师
    @CrossOrigin(origins = "*")
    @RequestMapping("/allteacher")
    @ResponseBody
    public List<Teacher> findAllTeacher(){
        return teacherService.findAllTeacher();
    }
//查询老师发布的课程
    @CrossOrigin(origins = "*")
    @RequestMapping("/findAllTeacherCourse")
    @ResponseBody
    public List<Course> findAllTeacherCourse(@RequestParam("tid") int id){
        return teacherService.findCourseById(id);
    }
}
