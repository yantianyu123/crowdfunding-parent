package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TimeZone;
import com.yan.crowdfunding.entity.TimeZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneMapper {
    int countByExample(TimeZoneExample example);

    int deleteByExample(TimeZoneExample example);

    int insert(TimeZone record);

    int insertSelective(TimeZone record);

    List<TimeZone> selectByExample(TimeZoneExample example);

    int updateByExampleSelective(@Param("record") TimeZone record, @Param("example") TimeZoneExample example);

    int updateByExample(@Param("record") TimeZone record, @Param("example") TimeZoneExample example);
}