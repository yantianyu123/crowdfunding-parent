package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.IoGlobalByFileByLatency;
import com.yan.crowdfunding.entity.IoGlobalByFileByLatencyExample;
import com.yan.crowdfunding.entity.IoGlobalByFileByLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByFileByLatencyMapper {
    int countByExample(IoGlobalByFileByLatencyExample example);

    int deleteByExample(IoGlobalByFileByLatencyExample example);

    int insert(IoGlobalByFileByLatencyWithBLOBs record);

    int insertSelective(IoGlobalByFileByLatencyWithBLOBs record);

    List<IoGlobalByFileByLatencyWithBLOBs> selectByExampleWithBLOBs(IoGlobalByFileByLatencyExample example);

    List<IoGlobalByFileByLatency> selectByExample(IoGlobalByFileByLatencyExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByFileByLatencyWithBLOBs record, @Param("example") IoGlobalByFileByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") IoGlobalByFileByLatencyWithBLOBs record, @Param("example") IoGlobalByFileByLatencyExample example);

    int updateByExample(@Param("record") IoGlobalByFileByLatency record, @Param("example") IoGlobalByFileByLatencyExample example);
}