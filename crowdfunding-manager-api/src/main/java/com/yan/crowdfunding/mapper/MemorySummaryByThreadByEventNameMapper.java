package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.MemorySummaryByThreadByEventName;
import com.yan.crowdfunding.entity.MemorySummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryByThreadByEventNameMapper {
    int countByExample(MemorySummaryByThreadByEventNameExample example);

    int deleteByExample(MemorySummaryByThreadByEventNameExample example);

    int insert(MemorySummaryByThreadByEventName record);

    int insertSelective(MemorySummaryByThreadByEventName record);

    List<MemorySummaryByThreadByEventName> selectByExample(MemorySummaryByThreadByEventNameExample example);

    int updateByExampleSelective(@Param("record") MemorySummaryByThreadByEventName record, @Param("example") MemorySummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") MemorySummaryByThreadByEventName record, @Param("example") MemorySummaryByThreadByEventNameExample example);
}