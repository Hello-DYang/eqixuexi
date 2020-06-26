package com.controller;

import com.entity.HomeWork;
import com.service.HomeWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@CrossOrigin(origins = "*")
public class HomeWorkController {

    @Autowired
    private HomeWorkService homeWorkService;
//--------------查询需要提交的作业--------------
    @RequestMapping("/selectHomeWork")
    @ResponseBody
    public List<HomeWork> selectHomeWork(@RequestParam("studentid") int studentid){
        List<HomeWork> homeWorkList=homeWorkService.selectByStatus(studentid);
        return homeWorkList;
    }
//--------------查询所有已提交的作业-----------------
    @RequestMapping("/selectHomeWorkFinish")
    @ResponseBody
    public List<HomeWork> selectHomeWorkFinish(@RequestParam("studentid") int studentid){
        List<HomeWork> homeWorkList=homeWorkService.selectByStatusFinish(studentid);
        System.out.println(homeWorkList);
        return homeWorkList;
    }
//---------------学生上传作业文件-------------
    @RequestMapping("/uploadHomeWork")
    @ResponseBody
    public String uploadHomeWork(@RequestParam("studentid") int studentid,@RequestParam("upload") String upload,@RequestParam("coursetitle") String coursetitle){
        if(homeWorkService.uploadHomeWork(studentid,upload,coursetitle)){
            return "上传成功";
        }else {
            return "上传失败";
        }

    }
//------------------给作业打分------------------
    @RequestMapping("/uploadScore")
    @ResponseBody
    public String selectHomeWork(@RequestParam("sid") int sid,@RequestParam("score") double score,@RequestParam("coursetitle") String coursetitle){
        if(homeWorkService.uploadScore(sid,score,coursetitle)){
            return "批改成功";
        }else {
            return "批改失败";
        }
    }
//--------------老师查询所有已提交的作业--------
    @RequestMapping("/selectAllHome")
    @ResponseBody
    public List<HomeWork> selectAllHome(@RequestParam("teacherid") int teacherid){
        List<HomeWork> homeWorkList=homeWorkService.selectAllHome(teacherid);
        return homeWorkList;
    }
//--------------查询已批改的作业---------------
    @RequestMapping("/selectWithScore")
    @ResponseBody
    public List<HomeWork> selectWithScore(@RequestParam("studentid") int studentid){
        List<HomeWork> homeWorkList=homeWorkService.selectWithScore(studentid);
        return homeWorkList;
    }
//---------------发布作业---------------
    @RequestMapping("/fbHomeWork")
    @ResponseBody
    public String fbHomeWork(@RequestParam("coursename") String coursename, @RequestParam("coursetitle") String coursetitle, @RequestParam("coursefile") String coursefile, @RequestParam("fbtime") String fbtime, @RequestParam("lasttime") String lasttime, @RequestParam("id") int teacherid){
        boolean flag=false;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fbtime1=simpleDateFormat.parse(fbtime);
            Date lasttime1=simpleDateFormat.parse(lasttime);
            for (int i=1;i<7;i++){
                flag= homeWorkService.fbHomeWork(coursename,coursetitle,coursefile,fbtime1,lasttime1,teacherid,i);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
     if (flag){
         return "发布成功";
     }else {
         return "发布失败";
     }
    }
}
