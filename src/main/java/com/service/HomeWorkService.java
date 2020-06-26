package com.service;

import com.entity.HomeWork;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

public interface HomeWorkService {
    public List<HomeWork> selectByStatus(int studentid);

    public List<HomeWork> selectByStatusFinish(int studentid);

    public boolean  uploadHomeWork(int studentid, String upload,String coursetitle);

    public boolean  uploadScore(int sid, double score,String coursetitle);

    public List<HomeWork> selectAllHome(int teacherid);

    List<HomeWork> selectWithScore(int studentid);

    public boolean fbHomeWork(String coursename,String coursetitle,String coursefile, Date fbtime,Date lasttime,int teacherid,int i);
}
