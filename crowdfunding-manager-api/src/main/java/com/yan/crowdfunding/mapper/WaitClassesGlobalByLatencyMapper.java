package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.WaitClassesGlobalByLatency;
import com.yan.crowdfunding.entity.WaitClassesGlobalByLatencyExample;
import com.yan.crowdfunding.entity.WaitClassesGlobalByLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitClassesGlobalByLatencyMapper {
    int countByExample(WaitClassesGlobalByLatencyExample example);

    int deleteByExample(WaitClassesGlobalByLatencyExample example);

    int insert(WaitClassesGlobalByLatencyWithBLOBs record);

    int insertSelective(WaitClassesGlobalByLatencyWithBLOBs record);

    List<WaitClassesGlobalByLatencyWithBLOBs> selectByExampleWithBLOBs(WaitClassesGlobalByLatencyExample example);

    List<WaitClassesGlobalByLatency> selectByExample(WaitClassesGlobalByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitClassesGlobalByLatencyWithBLOBs record, @Param("example") WaitClassesGlobalByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") WaitClassesGlobalByLatencyWithBLOBs record, @Param("example") WaitClassesGlobalByLatencyExample example);

    int updateByExample(@Param("record") WaitClassesGlobalByLatency record, @Param("example") WaitClassesGlobalByLatencyExample example);
}