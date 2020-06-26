package com.mapping;

import com.entity.Centre;
import com.entity.CentreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CentreMapper {
    long countByExample(CentreExample example);

    int deleteByExample(CentreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Centre record);

    int insertSelective(Centre record);

    List<Centre> selectByExample(CentreExample example);

    List<Centre> selectCentreAndCourse(@Param("sid") int sid);

    Centre selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Centre record, @Param("example") CentreExample example);

    int updateByExample(@Param("record") Centre record, @Param("example") CentreExample example);

    int updateByPrimaryKeySelective(Centre record);

    int updateByPrimaryKey(Centre record);
}