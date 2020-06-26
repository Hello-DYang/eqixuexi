package com.service.studentServiceImpl;

import com.entity.HomeWork;
import com.entity.HomeWorkExample;
import com.mapping.HomeWorkMapper;
import com.service.HomeWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class HomeWorkServiceImpl implements HomeWorkService {
    @Autowired
    private HomeWorkMapper homeWorkMapper;

    @Override
    public List<HomeWork> selectByStatus(int studentid) {
        HomeWorkExample homeWorkExample=new HomeWorkExample();
        homeWorkExample.createCriteria().andStatusEqualTo("已发布").andStudentidEqualTo(studentid);
        return homeWorkMapper.selectByExample(homeWorkExample);
    }

    @Override
    public List<HomeWork> selectByStatusFinish(int studentid) {
        HomeWorkExample homeWorkExample=new HomeWorkExample();
        homeWorkExample.createCriteria().andStatusEqualTo("已批改").andStudentidEqualTo(studentid);
        return homeWorkMapper.selectByExample(homeWorkExample);
    }

    @Override
    public boolean uploadHomeWork(int studentid, String upload,String coursetitle) {
        HomeWork homeWork=new HomeWork();
        homeWork.setUpload(upload);
        homeWork.setStatus("已提交");
        HomeWorkExample homeWorkExample=new HomeWorkExample();
        homeWorkExample.createCriteria().andStudentidEqualTo(studentid).andHometitleEqualTo(coursetitle);
        return homeWorkMapper.updateByExampleSelective(homeWork,homeWorkExample)>0?true:false;
    }

    @Override
    public boolean uploadScore(int sid, double score,String coursetitle) {
        HomeWork homeWork=new HomeWork();
        homeWork.setScore(score);
        homeWork.setStatus("已批改");
        HomeWorkExample homeWorkExample=new HomeWorkExample();
        homeWorkExample.createCriteria().andStudentidEqualTo(sid).andHometitleEqualTo(coursetitle);
        return homeWorkMapper.updateByExampleSelective(homeWork,homeWorkExample)>0?true:false;
    }

    @Override
    public List<HomeWork> selectAllHome(int teacherid) {
        HomeWorkExample homeWorkExample=new HomeWorkExample();
        homeWorkExample.createCriteria().andTeacheridEqualTo(teacherid).andStatusEqualTo("已提交");
        return homeWorkMapper.selectByExample(homeWorkExample);
    }

    @Override
    public List<HomeWork> selectWithScore(int studentid) {
        HomeWorkExample homeWorkExample=new HomeWorkExample();
        List<String> list=new ArrayList<>();
        list.add("已批改");
        list.add("已提交");
        homeWorkExample.createCriteria().andStatusIn(list).andStudentidEqualTo(studentid);
        return homeWorkMapper.selectByExample(homeWorkExample);
    }

    @Override
    public boolean fbHomeWork(String coursename, String coursetitle, String coursefile, Date fbtime, Date lasttime, int teacherid,int i) {
           HomeWork homeWork=new HomeWork();
           homeWork.setCoursename(coursename);
           homeWork.setHometitle(coursetitle);
           homeWork.setDownload(coursefile);
           homeWork.setFbtime(fbtime);
           homeWork.setLasttime(lasttime);
           homeWork.setTeacherid(teacherid);
           homeWork.setStatus("已发布");
           homeWork.setCourseid(1);
           homeWork.setStudentid(i);
           return homeWorkMapper.insertSelective(homeWork)>0?true:false;
    }
}
