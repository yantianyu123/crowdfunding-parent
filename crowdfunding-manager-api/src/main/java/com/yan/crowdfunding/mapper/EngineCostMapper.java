package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EngineCost;
import com.yan.crowdfunding.entity.EngineCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngineCostMapper {
    int countByExample(EngineCostExample example);

    int deleteByExample(EngineCostExample example);

    int insert(EngineCost record);

    int insertSelective(EngineCost record);

    List<EngineCost> selectByExample(EngineCostExample example);

    int updateByExampleSelective(@Param("record") EngineCost record, @Param("example") EngineCostExample example);

    int updateByExample(@Param("record") EngineCost record, @Param("example") EngineCostExample example);
}