package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TimeZoneTransition;
import com.yan.crowdfunding.entity.TimeZoneTransitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneTransitionMapper {
    int countByExample(TimeZoneTransitionExample example);

    int deleteByExample(TimeZoneTransitionExample example);

    int insert(TimeZoneTransition record);

    int insertSelective(TimeZoneTransition record);

    List<TimeZoneTransition> selectByExample(TimeZoneTransitionExample example);

    int updateByExampleSelective(@Param("record") TimeZoneTransition record, @Param("example") TimeZoneTransitionExample example);

    int updateByExample(@Param("record") TimeZoneTransition record, @Param("example") TimeZoneTransitionExample example);
}