package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.WaitsByUserByLatency;
import com.yan.crowdfunding.entity.WaitsByUserByLatencyExample;
import com.yan.crowdfunding.entity.WaitsByUserByLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsByUserByLatencyMapper {
    int countByExample(WaitsByUserByLatencyExample example);

    int deleteByExample(WaitsByUserByLatencyExample example);

    int insert(WaitsByUserByLatencyWithBLOBs record);

    int insertSelective(WaitsByUserByLatencyWithBLOBs record);

    List<WaitsByUserByLatencyWithBLOBs> selectByExampleWithBLOBs(WaitsByUserByLatencyExample example);

    List<WaitsByUserByLatency> selectByExample(WaitsByUserByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitsByUserByLatencyWithBLOBs record, @Param("example") WaitsByUserByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") WaitsByUserByLatencyWithBLOBs record, @Param("example") WaitsByUserByLatencyExample example);

    int updateByExample(@Param("record") WaitsByUserByLatency record, @Param("example") WaitsByUserByLatencyExample example);
}