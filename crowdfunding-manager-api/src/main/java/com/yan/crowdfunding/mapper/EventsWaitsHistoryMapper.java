package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsWaitsHistory;
import com.yan.crowdfunding.entity.EventsWaitsHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsHistoryMapper {
    int countByExample(EventsWaitsHistoryExample example);

    int deleteByExample(EventsWaitsHistoryExample example);

    int insert(EventsWaitsHistory record);

    int insertSelective(EventsWaitsHistory record);

    List<EventsWaitsHistory> selectByExample(EventsWaitsHistoryExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsHistory record, @Param("example") EventsWaitsHistoryExample example);

    int updateByExample(@Param("record") EventsWaitsHistory record, @Param("example") EventsWaitsHistoryExample example);
}