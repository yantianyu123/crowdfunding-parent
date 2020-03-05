package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.WaitClassesGlobalByAvgLatency;
import com.yan.crowdfunding.entity.WaitClassesGlobalByAvgLatencyExample;
import com.yan.crowdfunding.entity.WaitClassesGlobalByAvgLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitClassesGlobalByAvgLatencyMapper {
    int countByExample(WaitClassesGlobalByAvgLatencyExample example);

    int deleteByExample(WaitClassesGlobalByAvgLatencyExample example);

    int insert(WaitClassesGlobalByAvgLatencyWithBLOBs record);

    int insertSelective(WaitClassesGlobalByAvgLatencyWithBLOBs record);

    List<WaitClassesGlobalByAvgLatencyWithBLOBs> selectByExampleWithBLOBs(WaitClassesGlobalByAvgLatencyExample example);

    List<WaitClassesGlobalByAvgLatency> selectByExample(WaitClassesGlobalByAvgLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitClassesGlobalByAvgLatencyWithBLOBs record, @Param("example") WaitClassesGlobalByAvgLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") WaitClassesGlobalByAvgLatencyWithBLOBs record, @Param("example") WaitClassesGlobalByAvgLatencyExample example);

    int updateByExample(@Param("record") WaitClassesGlobalByAvgLatency record, @Param("example") WaitClassesGlobalByAvgLatencyExample example);
}