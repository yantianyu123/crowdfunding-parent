package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TimeZoneName;
import com.yan.crowdfunding.entity.TimeZoneNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneNameMapper {
    int countByExample(TimeZoneNameExample example);

    int deleteByExample(TimeZoneNameExample example);

    int insert(TimeZoneName record);

    int insertSelective(TimeZoneName record);

    List<TimeZoneName> selectByExample(TimeZoneNameExample example);

    int updateByExampleSelective(@Param("record") TimeZoneName record, @Param("example") TimeZoneNameExample example);

    int updateByExample(@Param("record") TimeZoneName record, @Param("example") TimeZoneNameExample example);
}