package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsWaitsCurrent;
import com.yan.crowdfunding.entity.EventsWaitsCurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsCurrentMapper {
    int countByExample(EventsWaitsCurrentExample example);

    int deleteByExample(EventsWaitsCurrentExample example);

    int insert(EventsWaitsCurrent record);

    int insertSelective(EventsWaitsCurrent record);

    List<EventsWaitsCurrent> selectByExample(EventsWaitsCurrentExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsCurrent record, @Param("example") EventsWaitsCurrentExample example);

    int updateByExample(@Param("record") EventsWaitsCurrent record, @Param("example") EventsWaitsCurrentExample example);
}