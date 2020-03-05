package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.WaitsGlobalByLatency;
import com.yan.crowdfunding.entity.WaitsGlobalByLatencyExample;
import com.yan.crowdfunding.entity.WaitsGlobalByLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsGlobalByLatencyMapper {
    int countByExample(WaitsGlobalByLatencyExample example);

    int deleteByExample(WaitsGlobalByLatencyExample example);

    int insert(WaitsGlobalByLatencyWithBLOBs record);

    int insertSelective(WaitsGlobalByLatencyWithBLOBs record);

    List<WaitsGlobalByLatencyWithBLOBs> selectByExampleWithBLOBs(WaitsGlobalByLatencyExample example);

    List<WaitsGlobalByLatency> selectByExample(WaitsGlobalByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitsGlobalByLatencyWithBLOBs record, @Param("example") WaitsGlobalByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") WaitsGlobalByLatencyWithBLOBs record, @Param("example") WaitsGlobalByLatencyExample example);

    int updateByExample(@Param("record") WaitsGlobalByLatency record, @Param("example") WaitsGlobalByLatencyExample example);
}