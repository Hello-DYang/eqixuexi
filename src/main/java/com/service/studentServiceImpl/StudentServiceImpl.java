package com.service.studentServiceImpl;

import com.entity.Student;
import com.entity.StudentExample;
import com.mapping.StudentMapper;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
   public boolean validateStudent(String username,String pwd){
       StudentExample studentExample=new StudentExample();
       studentExample.createCriteria().andNicknameEqualTo(username).andPasswordEqualTo(pwd);
//        studentExample.createCriteria().andNicknameEqualTo(username);
//        studentExample.createCriteria().andPasswordEqualTo(pwd);
        List<Student> studentList=studentMapper.selectByExample(studentExample);
        return studentList.size()>0?true:false;
   }
}
