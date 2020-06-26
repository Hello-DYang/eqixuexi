package com.mapping;

import com.entity.Directions;
import com.entity.DirectionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectionsMapper {
    long countByExample(DirectionsExample example);

    int deleteByExample(DirectionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Directions record);

    int insertSelective(Directions record);

    List<Directions> selectByExample(DirectionsExample example);

    List<Directions> selectAllDirections();

    Directions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Directions record, @Param("example") DirectionsExample example);

    int updateByExample(@Param("record") Directions record, @Param("example") DirectionsExample example);

    int updateByPrimaryKeySelective(Directions record);

    int updateByPrimaryKey(Directions record);
}