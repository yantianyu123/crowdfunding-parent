package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStatementsHistoryLong;
import com.yan.crowdfunding.entity.EventsStatementsHistoryLongExample;
import com.yan.crowdfunding.entity.EventsStatementsHistoryLongWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistoryLongMapper {
    int countByExample(EventsStatementsHistoryLongExample example);

    int deleteByExample(EventsStatementsHistoryLongExample example);

    int insert(EventsStatementsHistoryLongWithBLOBs record);

    int insertSelective(EventsStatementsHistoryLongWithBLOBs record);

    List<EventsStatementsHistoryLongWithBLOBs> selectByExampleWithBLOBs(EventsStatementsHistoryLongExample example);

    List<EventsStatementsHistoryLong> selectByExample(EventsStatementsHistoryLongExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsHistoryLongWithBLOBs record, @Param("example") EventsStatementsHistoryLongExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsStatementsHistoryLongWithBLOBs record, @Param("example") EventsStatementsHistoryLongExample example);

    int updateByExample(@Param("record") EventsStatementsHistoryLong record, @Param("example") EventsStatementsHistoryLongExample example);
}