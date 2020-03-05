package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TimeZoneTransitionType;
import com.yan.crowdfunding.entity.TimeZoneTransitionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneTransitionTypeMapper {
    int countByExample(TimeZoneTransitionTypeExample example);

    int deleteByExample(TimeZoneTransitionTypeExample example);

    int insert(TimeZoneTransitionType record);

    int insertSelective(TimeZoneTransitionType record);

    List<TimeZoneTransitionType> selectByExample(TimeZoneTransitionTypeExample example);

    int updateByExampleSelective(@Param("record") TimeZoneTransitionType record, @Param("example") TimeZoneTransitionTypeExample example);

    int updateByExample(@Param("record") TimeZoneTransitionType record, @Param("example") TimeZoneTransitionTypeExample example);
}