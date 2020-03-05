package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsWaitsHistoryLong;
import com.yan.crowdfunding.entity.EventsWaitsHistoryLongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsHistoryLongMapper {
    int countByExample(EventsWaitsHistoryLongExample example);

    int deleteByExample(EventsWaitsHistoryLongExample example);

    int insert(EventsWaitsHistoryLong record);

    int insertSelective(EventsWaitsHistoryLong record);

    List<EventsWaitsHistoryLong> selectByExample(EventsWaitsHistoryLongExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsHistoryLong record, @Param("example") EventsWaitsHistoryLongExample example);

    int updateByExample(@Param("record") EventsWaitsHistoryLong record, @Param("example") EventsWaitsHistoryLongExample example);
}