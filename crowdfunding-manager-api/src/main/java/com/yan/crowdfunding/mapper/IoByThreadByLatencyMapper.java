package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.IoByThreadByLatency;
import com.yan.crowdfunding.entity.IoByThreadByLatencyExample;
import com.yan.crowdfunding.entity.IoByThreadByLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoByThreadByLatencyMapper {
    int countByExample(IoByThreadByLatencyExample example);

    int deleteByExample(IoByThreadByLatencyExample example);

    int insert(IoByThreadByLatencyWithBLOBs record);

    int insertSelective(IoByThreadByLatencyWithBLOBs record);

    List<IoByThreadByLatencyWithBLOBs> selectByExampleWithBLOBs(IoByThreadByLatencyExample example);

    List<IoByThreadByLatency> selectByExample(IoByThreadByLatencyExample example);

    int updateByExampleSelective(@Param("record") IoByThreadByLatencyWithBLOBs record, @Param("example") IoByThreadByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") IoByThreadByLatencyWithBLOBs record, @Param("example") IoByThreadByLatencyExample example);

    int updateByExample(@Param("record") IoByThreadByLatency record, @Param("example") IoByThreadByLatencyExample example);
}