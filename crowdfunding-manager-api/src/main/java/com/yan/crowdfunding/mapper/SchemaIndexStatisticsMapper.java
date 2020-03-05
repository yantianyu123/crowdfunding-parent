package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SchemaIndexStatistics;
import com.yan.crowdfunding.entity.SchemaIndexStatisticsExample;
import com.yan.crowdfunding.entity.SchemaIndexStatisticsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaIndexStatisticsMapper {
    int countByExample(SchemaIndexStatisticsExample example);

    int deleteByExample(SchemaIndexStatisticsExample example);

    int insert(SchemaIndexStatisticsWithBLOBs record);

    int insertSelective(SchemaIndexStatisticsWithBLOBs record);

    List<SchemaIndexStatisticsWithBLOBs> selectByExampleWithBLOBs(SchemaIndexStatisticsExample example);

    List<SchemaIndexStatistics> selectByExample(SchemaIndexStatisticsExample example);

    int updateByExampleSelective(@Param("record") SchemaIndexStatisticsWithBLOBs record, @Param("example") SchemaIndexStatisticsExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaIndexStatisticsWithBLOBs record, @Param("example") SchemaIndexStatisticsExample example);

    int updateByExample(@Param("record") SchemaIndexStatistics record, @Param("example") SchemaIndexStatisticsExample example);
}