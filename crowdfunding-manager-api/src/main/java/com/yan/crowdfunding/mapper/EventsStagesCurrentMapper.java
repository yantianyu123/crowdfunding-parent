package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStagesCurrent;
import com.yan.crowdfunding.entity.EventsStagesCurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesCurrentMapper {
    int countByExample(EventsStagesCurrentExample example);

    int deleteByExample(EventsStagesCurrentExample example);

    int insert(EventsStagesCurrent record);

    int insertSelective(EventsStagesCurrent record);

    List<EventsStagesCurrent> selectByExample(EventsStagesCurrentExample example);

    int updateByExampleSelective(@Param("record") EventsStagesCurrent record, @Param("example") EventsStagesCurrentExample example);

    int updateByExample(@Param("record") EventsStagesCurrent record, @Param("example") EventsStagesCurrentExample example);
}