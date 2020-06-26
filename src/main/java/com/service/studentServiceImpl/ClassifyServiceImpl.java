package com.service.studentServiceImpl;

import com.entity.Centre;
import com.entity.Classify;
import com.entity.ClassifyExample;
import com.mapping.CentreMapper;
import com.mapping.ClassifyMapper;
import com.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    private ClassifyMapper classifyMapper;

    @Autowired
    private CentreMapper centreMapper;

    @Override
    public List<Classify> selectAllClassify() {
        return classifyMapper.selectByExample(new ClassifyExample());
    }

    @Override
    public List<Centre> selectCourseAndCentre(int sid) {
        return centreMapper.selectCentreAndCourse(sid);
    }
}
