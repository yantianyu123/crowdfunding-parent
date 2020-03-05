package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsWaitsSummaryByThreadByEventName;
import com.yan.crowdfunding.entity.EventsWaitsSummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByThreadByEventNameMapper {
    int countByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    int insert(EventsWaitsSummaryByThreadByEventName record);

    int insertSelective(EventsWaitsSummaryByThreadByEventName record);

    List<EventsWaitsSummaryByThreadByEventName> selectByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByThreadByEventName record, @Param("example") EventsWaitsSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryByThreadByEventName record, @Param("example") EventsWaitsSummaryByThreadByEventNameExample example);
}