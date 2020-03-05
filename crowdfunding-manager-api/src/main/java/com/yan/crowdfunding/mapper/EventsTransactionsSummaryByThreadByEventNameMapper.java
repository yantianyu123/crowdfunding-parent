package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsTransactionsSummaryByThreadByEventName;
import com.yan.crowdfunding.entity.EventsTransactionsSummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsSummaryByThreadByEventNameMapper {
    int countByExample(EventsTransactionsSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsTransactionsSummaryByThreadByEventNameExample example);

    int insert(EventsTransactionsSummaryByThreadByEventName record);

    int insertSelective(EventsTransactionsSummaryByThreadByEventName record);

    List<EventsTransactionsSummaryByThreadByEventName> selectByExample(EventsTransactionsSummaryByThreadByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsTransactionsSummaryByThreadByEventName record, @Param("example") EventsTransactionsSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsTransactionsSummaryByThreadByEventName record, @Param("example") EventsTransactionsSummaryByThreadByEventNameExample example);
}