package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.EventsStatementsSummaryByProgram;
import com.yan.crowdfunding.entity.EventsStatementsSummaryByProgramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByProgramMapper {
    int countByExample(EventsStatementsSummaryByProgramExample example);

    int deleteByExample(EventsStatementsSummaryByProgramExample example);

    int insert(EventsStatementsSummaryByProgram record);

    int insertSelective(EventsStatementsSummaryByProgram record);

    List<EventsStatementsSummaryByProgram> selectByExample(EventsStatementsSummaryByProgramExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByProgram record, @Param("example") EventsStatementsSummaryByProgramExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByProgram record, @Param("example") EventsStatementsSummaryByProgramExample example);
}