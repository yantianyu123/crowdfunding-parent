package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TimeZoneLeapSecond;
import com.yan.crowdfunding.entity.TimeZoneLeapSecondExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneLeapSecondMapper {
    int countByExample(TimeZoneLeapSecondExample example);

    int deleteByExample(TimeZoneLeapSecondExample example);

    int insert(TimeZoneLeapSecond record);

    int insertSelective(TimeZoneLeapSecond record);

    List<TimeZoneLeapSecond> selectByExample(TimeZoneLeapSecondExample example);

    int updateByExampleSelective(@Param("record") TimeZoneLeapSecond record, @Param("example") TimeZoneLeapSecondExample example);

    int updateByExample(@Param("record") TimeZoneLeapSecond record, @Param("example") TimeZoneLeapSecondExample example);
}