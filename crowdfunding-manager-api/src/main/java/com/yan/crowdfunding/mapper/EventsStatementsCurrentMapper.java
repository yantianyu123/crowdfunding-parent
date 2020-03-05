package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStatementsCurrent;
import com.yan.crowdfunding.entity.EventsStatementsCurrentExample;
import com.yan.crowdfunding.entity.EventsStatementsCurrentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsCurrentMapper {
    int countByExample(EventsStatementsCurrentExample example);

    int deleteByExample(EventsStatementsCurrentExample example);

    int insert(EventsStatementsCurrentWithBLOBs record);

    int insertSelective(EventsStatementsCurrentWithBLOBs record);

    List<EventsStatementsCurrentWithBLOBs> selectByExampleWithBLOBs(EventsStatementsCurrentExample example);

    List<EventsStatementsCurrent> selectByExample(EventsStatementsCurrentExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsCurrentWithBLOBs record, @Param("example") EventsStatementsCurrentExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsStatementsCurrentWithBLOBs record, @Param("example") EventsStatementsCurrentExample example);

    int updateByExample(@Param("record") EventsStatementsCurrent record, @Param("example") EventsStatementsCurrentExample example);
}