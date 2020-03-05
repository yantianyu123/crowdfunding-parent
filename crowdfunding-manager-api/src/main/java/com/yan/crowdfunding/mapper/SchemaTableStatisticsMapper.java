package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SchemaTableStatistics;
import com.yan.crowdfunding.entity.SchemaTableStatisticsExample;
import com.yan.crowdfunding.entity.SchemaTableStatisticsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableStatisticsMapper {
    int countByExample(SchemaTableStatisticsExample example);

    int deleteByExample(SchemaTableStatisticsExample example);

    int insert(SchemaTableStatisticsWithBLOBs record);

    int insertSelective(SchemaTableStatisticsWithBLOBs record);

    List<SchemaTableStatisticsWithBLOBs> selectByExampleWithBLOBs(SchemaTableStatisticsExample example);

    List<SchemaTableStatistics> selectByExample(SchemaTableStatisticsExample example);

    int updateByExampleSelective(@Param("record") SchemaTableStatisticsWithBLOBs record, @Param("example") SchemaTableStatisticsExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaTableStatisticsWithBLOBs record, @Param("example") SchemaTableStatisticsExample example);

    int updateByExample(@Param("record") SchemaTableStatistics record, @Param("example") SchemaTableStatisticsExample example);
}