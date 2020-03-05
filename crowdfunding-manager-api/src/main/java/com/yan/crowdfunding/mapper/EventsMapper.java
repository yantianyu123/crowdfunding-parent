package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Events;
import com.yan.crowdfunding.entity.EventsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsMapper {
    int countByExample(EventsExample example);

    int deleteByExample(EventsExample example);

    int insert(Events record);

    int insertSelective(Events record);

    List<Events> selectByExampleWithBLOBs(EventsExample example);

    List<Events> selectByExample(EventsExample example);

    int updateByExampleSelective(@Param("record") Events record, @Param("example") EventsExample example);

    int updateByExampleWithBLOBs(@Param("record") Events record, @Param("example") EventsExample example);

    int updateByExample(@Param("record") Events record, @Param("example") EventsExample example);
}