package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsWaitsSummaryByInstance;
import com.yan.crowdfunding.entity.EventsWaitsSummaryByInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByInstanceMapper {
    int countByExample(EventsWaitsSummaryByInstanceExample example);

    int deleteByExample(EventsWaitsSummaryByInstanceExample example);

    int insert(EventsWaitsSummaryByInstance record);

    int insertSelective(EventsWaitsSummaryByInstance record);

    List<EventsWaitsSummaryByInstance> selectByExample(EventsWaitsSummaryByInstanceExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByInstance record, @Param("example") EventsWaitsSummaryByInstanceExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryByInstance record, @Param("example") EventsWaitsSummaryByInstanceExample example);
}