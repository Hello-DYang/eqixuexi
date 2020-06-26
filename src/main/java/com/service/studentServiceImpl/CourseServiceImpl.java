package com.service.studentServiceImpl;

import com.entity.*;
import com.mapping.*;
import com.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private DirectionsMapper directionsMapper;

    @Autowired
    private CarouselMapper carouselMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private ChapterMapper chapterMapper;

    @Autowired
    private SessionMapper sessionMapper;

    @Override
    public List<Directions> selectAll() {
        return directionsMapper.selectAllDirections();
    }

    @Override
    public List<Carousel> selectAllCarouse() {
        return carouselMapper.selectByExample(new CarouselExample());
    }

    @Override
    public List<Course> selectAllCourse() {
        return courseMapper.selectByExample(new CourseExample());
    }

    @Override
    public List<Course> selectByContent(String content) {
        CourseExample courseExample=new CourseExample();
        courseExample.createCriteria().andDescriptionLike("%" + content + "%");
        return courseMapper.selectByExample(courseExample);
    }

    @Override
    public List<Chapter> selectByCourseId(int id) {
        return chapterMapper.selectByCourseId(id);
    }

    @Override
    public Session selectSessionById(int num) {
        return sessionMapper.selectByPrimaryKey(num);
    }

    @Override
    public List<Course> selectByTime(Date firstTime, Date lastTime) {
        CourseExample courseExample=new CourseExample();
        courseExample.createCriteria().andFbtimeBetween(firstTime,lastTime);
        return courseMapper.selectByExample(courseExample);
    }

    @Override
    public boolean insertCourse(String coursename, int classifyid, String coursefile, Date fbtime, int directionid, int id) {
        Course course=new Course();
        course.setDescription(coursename);
        course.setClassifyid(classifyid);
        course.setIcon(coursefile);
        course.setFbtime(fbtime);
        course.setDirectionid(directionid);
        course.setTeacherid(id);
        return courseMapper.insertSelective(course)>0?true:false;
    }

}
