package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.OptimizerTrace;
import com.yan.crowdfunding.entity.OptimizerTraceExample;
import com.yan.crowdfunding.entity.OptimizerTraceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OptimizerTraceMapper {
    int countByExample(OptimizerTraceExample example);

    int deleteByExample(OptimizerTraceExample example);

    int insert(OptimizerTraceWithBLOBs record);

    int insertSelective(OptimizerTraceWithBLOBs record);

    List<OptimizerTraceWithBLOBs> selectByExampleWithBLOBs(OptimizerTraceExample example);

    List<OptimizerTrace> selectByExample(OptimizerTraceExample example);

    int updateByExampleSelective(@Param("record") OptimizerTraceWithBLOBs record, @Param("example") OptimizerTraceExample example);

    int updateByExampleWithBLOBs(@Param("record") OptimizerTraceWithBLOBs record, @Param("example") OptimizerTraceExample example);

    int updateByExample(@Param("record") OptimizerTrace record, @Param("example") OptimizerTraceExample example);
}