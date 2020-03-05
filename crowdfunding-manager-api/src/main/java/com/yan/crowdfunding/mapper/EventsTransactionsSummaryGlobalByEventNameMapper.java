package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsTransactionsSummaryGlobalByEventName;
import com.yan.crowdfunding.entity.EventsTransactionsSummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsSummaryGlobalByEventNameMapper {
    int countByExample(EventsTransactionsSummaryGlobalByEventNameExample example);

    int deleteByExample(EventsTransactionsSummaryGlobalByEventNameExample example);

    int insert(EventsTransactionsSummaryGlobalByEventName record);

    int insertSelective(EventsTransactionsSummaryGlobalByEventName record);

    List<EventsTransactionsSummaryGlobalByEventName> selectByExample(EventsTransactionsSummaryGlobalByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsTransactionsSummaryGlobalByEventName record, @Param("example") EventsTransactionsSummaryGlobalByEventNameExample example);

    int updateByExample(@Param("record") EventsTransactionsSummaryGlobalByEventName record, @Param("example") EventsTransactionsSummaryGlobalByEventNameExample example);
}