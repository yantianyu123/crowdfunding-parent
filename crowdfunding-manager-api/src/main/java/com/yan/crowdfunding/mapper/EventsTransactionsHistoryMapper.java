package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsTransactionsHistory;
import com.yan.crowdfunding.entity.EventsTransactionsHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsHistoryMapper {
    int countByExample(EventsTransactionsHistoryExample example);

    int deleteByExample(EventsTransactionsHistoryExample example);

    int insert(EventsTransactionsHistory record);

    int insertSelective(EventsTransactionsHistory record);

    List<EventsTransactionsHistory> selectByExample(EventsTransactionsHistoryExample example);

    int updateByExampleSelective(@Param("record") EventsTransactionsHistory record, @Param("example") EventsTransactionsHistoryExample example);

    int updateByExample(@Param("record") EventsTransactionsHistory record, @Param("example") EventsTransactionsHistoryExample example);
}