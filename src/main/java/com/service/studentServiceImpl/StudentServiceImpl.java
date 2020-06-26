package com.service.studentServiceImpl;

import com.entity.Directions;
import com.entity.DirectionsExample;
import com.entity.Student;
import com.entity.StudentExample;
import com.mapping.DirectionsMapper;
import com.mapping.StudentMapper;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private DirectionsMapper directionsMapper;

    @Override
   public boolean validateStudent(String username,String pwd){
       StudentExample studentExample=new StudentExample();
       studentExample.createCriteria().andNameEqualTo(username).andPasswordEqualTo(pwd);
        List<Student> studentList=studentMapper.selectByExample(studentExample);
        return studentList.size()>0?true:false;
   }

    @Override
    public List<Directions> selectAllDirect() {
        System.out.println("访问到ServiceImpl");
       return directionsMapper.selectByExample(new DirectionsExample());
    }

    @Override
    public List<Student> selectByName(String name) {
        StudentExample studentExample=new StudentExample();
        studentExample.createCriteria().andNameEqualTo(name);
        return studentMapper.selectByExample(studentExample);
    }

    @Override
    public Student selectById(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

}
