package com.service;

import com.entity.Directions;
import com.entity.Student;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;


public interface StudentService {

   public boolean validateStudent(String username,String pwd);

   public List<Directions> selectAllDirect();

   public List<Student> selectByName(String name);

   public Student selectById(int id);


   }

