package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStatementsHistory;
import com.yan.crowdfunding.entity.EventsStatementsHistoryExample;
import com.yan.crowdfunding.entity.EventsStatementsHistoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistoryMapper {
    int countByExample(EventsStatementsHistoryExample example);

    int deleteByExample(EventsStatementsHistoryExample example);

    int insert(EventsStatementsHistoryWithBLOBs record);

    int insertSelective(EventsStatementsHistoryWithBLOBs record);

    List<EventsStatementsHistoryWithBLOBs> selectByExampleWithBLOBs(EventsStatementsHistoryExample example);

    List<EventsStatementsHistory> selectByExample(EventsStatementsHistoryExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsHistoryWithBLOBs record, @Param("example") EventsStatementsHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsStatementsHistoryWithBLOBs record, @Param("example") EventsStatementsHistoryExample example);

    int updateByExample(@Param("record") EventsStatementsHistory record, @Param("example") EventsStatementsHistoryExample example);
}