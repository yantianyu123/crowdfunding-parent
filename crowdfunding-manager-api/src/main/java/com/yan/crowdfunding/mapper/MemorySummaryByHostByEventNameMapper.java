package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.MemorySummaryByHostByEventName;
import com.yan.crowdfunding.entity.MemorySummaryByHostByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryByHostByEventNameMapper {
    int countByExample(MemorySummaryByHostByEventNameExample example);

    int deleteByExample(MemorySummaryByHostByEventNameExample example);

    int insert(MemorySummaryByHostByEventName record);

    int insertSelective(MemorySummaryByHostByEventName record);

    List<MemorySummaryByHostByEventName> selectByExample(MemorySummaryByHostByEventNameExample example);

    int updateByExampleSelective(@Param("record") MemorySummaryByHostByEventName record, @Param("example") MemorySummaryByHostByEventNameExample example);

    int updateByExample(@Param("record") MemorySummaryByHostByEventName record, @Param("example") MemorySummaryByHostByEventNameExample example);
}