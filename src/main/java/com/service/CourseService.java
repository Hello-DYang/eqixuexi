package com.service;

import com.entity.*;

import java.util.Date;
import java.util.List;

public interface CourseService {
 List<Directions> selectAll();

 List<Carousel> selectAllCarouse();

 List<Course> selectAllCourse();

 List<Course> selectByContent(String content);

 List<Chapter> selectByCourseId(int id);

 Session selectSessionById(int num);

 List<Course> selectByTime(Date firstTime,Date lastTime);

 boolean insertCourse(String coursename,int classifyid,String coursefile,Date fbtime,int directionid,int id);
}
