package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.HostSummary;
import com.yan.crowdfunding.entity.HostSummaryExample;
import com.yan.crowdfunding.entity.HostSummaryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryMapper {
    int countByExample(HostSummaryExample example);

    int deleteByExample(HostSummaryExample example);

    int insert(HostSummaryWithBLOBs record);

    int insertSelective(HostSummaryWithBLOBs record);

    List<HostSummaryWithBLOBs> selectByExampleWithBLOBs(HostSummaryExample example);

    List<HostSummary> selectByExample(HostSummaryExample example);

    int updateByExampleSelective(@Param("record") HostSummaryWithBLOBs record, @Param("example") HostSummaryExample example);

    int updateByExampleWithBLOBs(@Param("record") HostSummaryWithBLOBs record, @Param("example") HostSummaryExample example);

    int updateByExample(@Param("record") HostSummary record, @Param("example") HostSummaryExample example);
}