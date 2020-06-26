package com.service.studentServiceImpl;

import com.entity.Course;
import com.entity.CourseExample;
import com.entity.Teacher;
import com.entity.TeacherExample;
import com.mapping.CourseMapper;
import com.mapping.TeacherMapper;
import com.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Teacher> findAllTeacher() {
        return teacherMapper.selectByExample(new TeacherExample());
    }

    @Override
    public List<Course> findCourseById(int id) {
        CourseExample courseExample = new CourseExample();
        courseExample.createCriteria().andTeacheridEqualTo(id);
        return courseMapper.selectByExample(courseExample);
    }
}
