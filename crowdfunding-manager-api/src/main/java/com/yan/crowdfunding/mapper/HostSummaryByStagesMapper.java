package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.HostSummaryByStages;
import com.yan.crowdfunding.entity.HostSummaryByStagesExample;
import com.yan.crowdfunding.entity.HostSummaryByStagesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByStagesMapper {
    int countByExample(HostSummaryByStagesExample example);

    int deleteByExample(HostSummaryByStagesExample example);

    int insert(HostSummaryByStagesWithBLOBs record);

    int insertSelective(HostSummaryByStagesWithBLOBs record);

    List<HostSummaryByStagesWithBLOBs> selectByExampleWithBLOBs(HostSummaryByStagesExample example);

    List<HostSummaryByStages> selectByExample(HostSummaryByStagesExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByStagesWithBLOBs record, @Param("example") HostSummaryByStagesExample example);

    int updateByExampleWithBLOBs(@Param("record") HostSummaryByStagesWithBLOBs record, @Param("example") HostSummaryByStagesExample example);

    int updateByExample(@Param("record") HostSummaryByStages record, @Param("example") HostSummaryByStagesExample example);
}