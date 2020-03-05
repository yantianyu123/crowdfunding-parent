package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.WaitsByHostByLatency;
import com.yan.crowdfunding.entity.WaitsByHostByLatencyExample;
import com.yan.crowdfunding.entity.WaitsByHostByLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsByHostByLatencyMapper {
    int countByExample(WaitsByHostByLatencyExample example);

    int deleteByExample(WaitsByHostByLatencyExample example);

    int insert(WaitsByHostByLatencyWithBLOBs record);

    int insertSelective(WaitsByHostByLatencyWithBLOBs record);

    List<WaitsByHostByLatencyWithBLOBs> selectByExampleWithBLOBs(WaitsByHostByLatencyExample example);

    List<WaitsByHostByLatency> selectByExample(WaitsByHostByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitsByHostByLatencyWithBLOBs record, @Param("example") WaitsByHostByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") WaitsByHostByLatencyWithBLOBs record, @Param("example") WaitsByHostByLatencyExample example);

    int updateByExample(@Param("record") WaitsByHostByLatency record, @Param("example") WaitsByHostByLatencyExample example);
}