package com.service;

import com.entity.Course;
import com.entity.Teacher;

import java.util.List;

public interface TeacherService {
    public List<Teacher> findAllTeacher();

    public List<Course> findCourseById(int id);
}
