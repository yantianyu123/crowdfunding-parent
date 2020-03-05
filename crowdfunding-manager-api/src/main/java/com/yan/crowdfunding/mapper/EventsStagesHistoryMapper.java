package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStagesHistory;
import com.yan.crowdfunding.entity.EventsStagesHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesHistoryMapper {
    int countByExample(EventsStagesHistoryExample example);

    int deleteByExample(EventsStagesHistoryExample example);

    int insert(EventsStagesHistory record);

    int insertSelective(EventsStagesHistory record);

    List<EventsStagesHistory> selectByExample(EventsStagesHistoryExample example);

    int updateByExampleSelective(@Param("record") EventsStagesHistory record, @Param("example") EventsStagesHistoryExample example);

    int updateByExample(@Param("record") EventsStagesHistory record, @Param("example") EventsStagesHistoryExample example);
}