package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStatementsSummaryByAccountByEventName;
import com.yan.crowdfunding.entity.EventsStatementsSummaryByAccountByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByAccountByEventNameMapper {
    int countByExample(EventsStatementsSummaryByAccountByEventNameExample example);

    int deleteByExample(EventsStatementsSummaryByAccountByEventNameExample example);

    int insert(EventsStatementsSummaryByAccountByEventName record);

    int insertSelective(EventsStatementsSummaryByAccountByEventName record);

    List<EventsStatementsSummaryByAccountByEventName> selectByExample(EventsStatementsSummaryByAccountByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByAccountByEventName record, @Param("example") EventsStatementsSummaryByAccountByEventNameExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByAccountByEventName record, @Param("example") EventsStatementsSummaryByAccountByEventNameExample example);
}