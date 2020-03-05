package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStatementsSummaryGlobalByEventName;
import com.yan.crowdfunding.entity.EventsStatementsSummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryGlobalByEventNameMapper {
    int countByExample(EventsStatementsSummaryGlobalByEventNameExample example);

    int deleteByExample(EventsStatementsSummaryGlobalByEventNameExample example);

    int insert(EventsStatementsSummaryGlobalByEventName record);

    int insertSelective(EventsStatementsSummaryGlobalByEventName record);

    List<EventsStatementsSummaryGlobalByEventName> selectByExample(EventsStatementsSummaryGlobalByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryGlobalByEventName record, @Param("example") EventsStatementsSummaryGlobalByEventNameExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryGlobalByEventName record, @Param("example") EventsStatementsSummaryGlobalByEventNameExample example);
}