package com.mapping;

import com.entity.HomeWork;
import com.entity.HomeWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomeWorkMapper {
    long countByExample(HomeWorkExample example);

    int deleteByExample(HomeWorkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HomeWork record);

    int insertSelective(HomeWork record);

    List<HomeWork> selectByExample(HomeWorkExample example);

    HomeWork selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HomeWork record, @Param("example") HomeWorkExample example);

    int updateByExample(@Param("record") HomeWork record, @Param("example") HomeWorkExample example);

    int updateByPrimaryKeySelective(HomeWork record);

    int updateByPrimaryKey(HomeWork record);
}