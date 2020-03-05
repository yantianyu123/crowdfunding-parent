package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SchemaTableStatisticsWithBuffer;
import com.yan.crowdfunding.entity.SchemaTableStatisticsWithBufferExample;
import com.yan.crowdfunding.entity.SchemaTableStatisticsWithBufferWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableStatisticsWithBufferMapper {
    int countByExample(SchemaTableStatisticsWithBufferExample example);

    int deleteByExample(SchemaTableStatisticsWithBufferExample example);

    int insert(SchemaTableStatisticsWithBufferWithBLOBs record);

    int insertSelective(SchemaTableStatisticsWithBufferWithBLOBs record);

    List<SchemaTableStatisticsWithBufferWithBLOBs> selectByExampleWithBLOBs(SchemaTableStatisticsWithBufferExample example);

    List<SchemaTableStatisticsWithBuffer> selectByExample(SchemaTableStatisticsWithBufferExample example);

    int updateByExampleSelective(@Param("record") SchemaTableStatisticsWithBufferWithBLOBs record, @Param("example") SchemaTableStatisticsWithBufferExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaTableStatisticsWithBufferWithBLOBs record, @Param("example") SchemaTableStatisticsWithBufferExample example);

    int updateByExample(@Param("record") SchemaTableStatisticsWithBuffer record, @Param("example") SchemaTableStatisticsWithBufferExample example);
}