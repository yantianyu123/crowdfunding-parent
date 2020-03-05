package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.MemorySummaryGlobalByEventName;
import com.yan.crowdfunding.entity.MemorySummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryGlobalByEventNameMapper {
    int countByExample(MemorySummaryGlobalByEventNameExample example);

    int deleteByExample(MemorySummaryGlobalByEventNameExample example);

    int insert(MemorySummaryGlobalByEventName record);

    int insertSelective(MemorySummaryGlobalByEventName record);

    List<MemorySummaryGlobalByEventName> selectByExample(MemorySummaryGlobalByEventNameExample example);

    int updateByExampleSelective(@Param("record") MemorySummaryGlobalByEventName record, @Param("example") MemorySummaryGlobalByEventNameExample example);

    int updateByExample(@Param("record") MemorySummaryGlobalByEventName record, @Param("example") MemorySummaryGlobalByEventNameExample example);
}