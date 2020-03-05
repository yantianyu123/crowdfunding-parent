package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStagesHistoryLong;
import com.yan.crowdfunding.entity.EventsStagesHistoryLongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesHistoryLongMapper {
    int countByExample(EventsStagesHistoryLongExample example);

    int deleteByExample(EventsStagesHistoryLongExample example);

    int insert(EventsStagesHistoryLong record);

    int insertSelective(EventsStagesHistoryLong record);

    List<EventsStagesHistoryLong> selectByExample(EventsStagesHistoryLongExample example);

    int updateByExampleSelective(@Param("record") EventsStagesHistoryLong record, @Param("example") EventsStagesHistoryLongExample example);

    int updateByExample(@Param("record") EventsStagesHistoryLong record, @Param("example") EventsStagesHistoryLongExample example);
}