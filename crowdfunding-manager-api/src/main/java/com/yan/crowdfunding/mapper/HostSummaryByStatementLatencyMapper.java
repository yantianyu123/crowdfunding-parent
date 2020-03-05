package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.HostSummaryByStatementLatency;
import com.yan.crowdfunding.entity.HostSummaryByStatementLatencyExample;
import com.yan.crowdfunding.entity.HostSummaryByStatementLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByStatementLatencyMapper {
    int countByExample(HostSummaryByStatementLatencyExample example);

    int deleteByExample(HostSummaryByStatementLatencyExample example);

    int insert(HostSummaryByStatementLatencyWithBLOBs record);

    int insertSelective(HostSummaryByStatementLatencyWithBLOBs record);

    List<HostSummaryByStatementLatencyWithBLOBs> selectByExampleWithBLOBs(HostSummaryByStatementLatencyExample example);

    List<HostSummaryByStatementLatency> selectByExample(HostSummaryByStatementLatencyExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByStatementLatencyWithBLOBs record, @Param("example") HostSummaryByStatementLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") HostSummaryByStatementLatencyWithBLOBs record, @Param("example") HostSummaryByStatementLatencyExample example);

    int updateByExample(@Param("record") HostSummaryByStatementLatency record, @Param("example") HostSummaryByStatementLatencyExample example);
}