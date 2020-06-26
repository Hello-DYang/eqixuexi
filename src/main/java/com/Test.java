//package com;
//
//import com.entity.Directions;
//import com.entity.DirectionsExample;
//import com.mapping.DirectionsMapper;
//import com.service.StudentService;
//import com.service.studentServiceImpl.StudentServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.util.List;
//
//public class Test {
//    public static void main(String[] args) {
//        ApplicationContext ac= new ClassPathXmlApplicationContext("applicaitonContext.xml");
//        StudentServiceImpl ssi=(StudentServiceImpl)ac.getBean("studentServiceImpl");
//        List<Directions> directionsList=ssi.selectAllDirect();
//        System.out.println(directionsList);
//
//    }
//}
