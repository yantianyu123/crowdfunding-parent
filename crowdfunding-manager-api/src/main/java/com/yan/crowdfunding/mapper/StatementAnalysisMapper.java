package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.StatementAnalysis;
import com.yan.crowdfunding.entity.StatementAnalysisExample;
import com.yan.crowdfunding.entity.StatementAnalysisWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementAnalysisMapper {
    int countByExample(StatementAnalysisExample example);

    int deleteByExample(StatementAnalysisExample example);

    int insert(StatementAnalysisWithBLOBs record);

    int insertSelective(StatementAnalysisWithBLOBs record);

    List<StatementAnalysisWithBLOBs> selectByExampleWithBLOBs(StatementAnalysisExample example);

    List<StatementAnalysis> selectByExample(StatementAnalysisExample example);

    int updateByExampleSelective(@Param("record") StatementAnalysisWithBLOBs record, @Param("example") StatementAnalysisExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementAnalysisWithBLOBs record, @Param("example") StatementAnalysisExample example);

    int updateByExample(@Param("record") StatementAnalysis record, @Param("example") StatementAnalysisExample example);
}