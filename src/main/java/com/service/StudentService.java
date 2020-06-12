package com.service;

import com.entity.Student;
import com.entity.StudentExample;
import com.mapping.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface StudentService {

   public boolean validateStudent(String username,String pwd);


   }

