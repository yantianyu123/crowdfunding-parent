package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsWaitsSummaryGlobalByEventName;
import com.yan.crowdfunding.entity.EventsWaitsSummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryGlobalByEventNameMapper {
    int countByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    int deleteByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    int insert(EventsWaitsSummaryGlobalByEventName record);

    int insertSelective(EventsWaitsSummaryGlobalByEventName record);

    List<EventsWaitsSummaryGlobalByEventName> selectByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryGlobalByEventName record, @Param("example") EventsWaitsSummaryGlobalByEventNameExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryGlobalByEventName record, @Param("example") EventsWaitsSummaryGlobalByEventNameExample example);
}