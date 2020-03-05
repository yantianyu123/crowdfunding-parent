package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Event;
import com.yan.crowdfunding.entity.EventExample;
import com.yan.crowdfunding.entity.EventWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventMapper {
    int countByExample(EventExample example);

    int deleteByExample(EventExample example);

    int insert(EventWithBLOBs record);

    int insertSelective(EventWithBLOBs record);

    List<EventWithBLOBs> selectByExampleWithBLOBs(EventExample example);

    List<Event> selectByExample(EventExample example);

    int updateByExampleSelective(@Param("record") EventWithBLOBs record, @Param("example") EventExample example);

    int updateByExampleWithBLOBs(@Param("record") EventWithBLOBs record, @Param("example") EventExample example);

    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);
}