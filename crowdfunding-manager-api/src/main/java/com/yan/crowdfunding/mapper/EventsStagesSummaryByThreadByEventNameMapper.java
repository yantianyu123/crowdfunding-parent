package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStagesSummaryByThreadByEventName;
import com.yan.crowdfunding.entity.EventsStagesSummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryByThreadByEventNameMapper {
    int countByExample(EventsStagesSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsStagesSummaryByThreadByEventNameExample example);

    int insert(EventsStagesSummaryByThreadByEventName record);

    int insertSelective(EventsStagesSummaryByThreadByEventName record);

    List<EventsStagesSummaryByThreadByEventName> selectByExample(EventsStagesSummaryByThreadByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStagesSummaryByThreadByEventName record, @Param("example") EventsStagesSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsStagesSummaryByThreadByEventName record, @Param("example") EventsStagesSummaryByThreadByEventNameExample example);
}