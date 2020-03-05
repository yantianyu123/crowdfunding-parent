package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStagesSummaryGlobalByEventName;
import com.yan.crowdfunding.entity.EventsStagesSummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryGlobalByEventNameMapper {
    int countByExample(EventsStagesSummaryGlobalByEventNameExample example);

    int deleteByExample(EventsStagesSummaryGlobalByEventNameExample example);

    int insert(EventsStagesSummaryGlobalByEventName record);

    int insertSelective(EventsStagesSummaryGlobalByEventName record);

    List<EventsStagesSummaryGlobalByEventName> selectByExample(EventsStagesSummaryGlobalByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStagesSummaryGlobalByEventName record, @Param("example") EventsStagesSummaryGlobalByEventNameExample example);

    int updateByExample(@Param("record") EventsStagesSummaryGlobalByEventName record, @Param("example") EventsStagesSummaryGlobalByEventNameExample example);
}