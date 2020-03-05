package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsTransactionsSummaryByUserByEventName;
import com.yan.crowdfunding.entity.EventsTransactionsSummaryByUserByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsSummaryByUserByEventNameMapper {
    int countByExample(EventsTransactionsSummaryByUserByEventNameExample example);

    int deleteByExample(EventsTransactionsSummaryByUserByEventNameExample example);

    int insert(EventsTransactionsSummaryByUserByEventName record);

    int insertSelective(EventsTransactionsSummaryByUserByEventName record);

    List<EventsTransactionsSummaryByUserByEventName> selectByExample(EventsTransactionsSummaryByUserByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsTransactionsSummaryByUserByEventName record, @Param("example") EventsTransactionsSummaryByUserByEventNameExample example);

    int updateByExample(@Param("record") EventsTransactionsSummaryByUserByEventName record, @Param("example") EventsTransactionsSummaryByUserByEventNameExample example);
}