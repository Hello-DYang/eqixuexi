package com.service;

import com.entity.Centre;
import com.entity.Classify;

import java.util.List;

public interface ClassifyService {
    public List<Classify> selectAllClassify();

    public List<Centre> selectCourseAndCentre(int sid);
}
