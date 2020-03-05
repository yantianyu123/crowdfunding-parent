package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsTransactionsCurrent;
import com.yan.crowdfunding.entity.EventsTransactionsCurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsCurrentMapper {
    int countByExample(EventsTransactionsCurrentExample example);

    int deleteByExample(EventsTransactionsCurrentExample example);

    int insert(EventsTransactionsCurrent record);

    int insertSelective(EventsTransactionsCurrent record);

    List<EventsTransactionsCurrent> selectByExample(EventsTransactionsCurrentExample example);

    int updateByExampleSelective(@Param("record") EventsTransactionsCurrent record, @Param("example") EventsTransactionsCurrentExample example);

    int updateByExample(@Param("record") EventsTransactionsCurrent record, @Param("example") EventsTransactionsCurrentExample example);
}