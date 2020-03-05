package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.IoGlobalByWaitByLatency;
import com.yan.crowdfunding.entity.IoGlobalByWaitByLatencyExample;
import com.yan.crowdfunding.entity.IoGlobalByWaitByLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByWaitByLatencyMapper {
    int countByExample(IoGlobalByWaitByLatencyExample example);

    int deleteByExample(IoGlobalByWaitByLatencyExample example);

    int insert(IoGlobalByWaitByLatencyWithBLOBs record);

    int insertSelective(IoGlobalByWaitByLatencyWithBLOBs record);

    List<IoGlobalByWaitByLatencyWithBLOBs> selectByExampleWithBLOBs(IoGlobalByWaitByLatencyExample example);

    List<IoGlobalByWaitByLatency> selectByExample(IoGlobalByWaitByLatencyExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByWaitByLatencyWithBLOBs record, @Param("example") IoGlobalByWaitByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") IoGlobalByWaitByLatencyWithBLOBs record, @Param("example") IoGlobalByWaitByLatencyExample example);

    int updateByExample(@Param("record") IoGlobalByWaitByLatency record, @Param("example") IoGlobalByWaitByLatencyExample example);
}