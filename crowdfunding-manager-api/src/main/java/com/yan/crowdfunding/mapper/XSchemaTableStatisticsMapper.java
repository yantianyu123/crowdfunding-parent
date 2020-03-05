package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XSchemaTableStatistics;
import com.yan.crowdfunding.entity.XSchemaTableStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSchemaTableStatisticsMapper {
    int countByExample(XSchemaTableStatisticsExample example);

    int deleteByExample(XSchemaTableStatisticsExample example);

    int insert(XSchemaTableStatistics record);

    int insertSelective(XSchemaTableStatistics record);

    List<XSchemaTableStatistics> selectByExample(XSchemaTableStatisticsExample example);

    int updateByExampleSelective(@Param("record") XSchemaTableStatistics record, @Param("example") XSchemaTableStatisticsExample example);

    int updateByExample(@Param("record") XSchemaTableStatistics record, @Param("example") XSchemaTableStatisticsExample example);
}