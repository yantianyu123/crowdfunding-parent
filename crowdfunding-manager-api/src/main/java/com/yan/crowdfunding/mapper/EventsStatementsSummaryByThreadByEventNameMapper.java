package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStatementsSummaryByThreadByEventName;
import com.yan.crowdfunding.entity.EventsStatementsSummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByThreadByEventNameMapper {
    int countByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    int insert(EventsStatementsSummaryByThreadByEventName record);

    int insertSelective(EventsStatementsSummaryByThreadByEventName record);

    List<EventsStatementsSummaryByThreadByEventName> selectByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByThreadByEventName record, @Param("example") EventsStatementsSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByThreadByEventName record, @Param("example") EventsStatementsSummaryByThreadByEventNameExample example);
}