package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.MemorySummaryByUserByEventName;
import com.yan.crowdfunding.entity.MemorySummaryByUserByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryByUserByEventNameMapper {
    int countByExample(MemorySummaryByUserByEventNameExample example);

    int deleteByExample(MemorySummaryByUserByEventNameExample example);

    int insert(MemorySummaryByUserByEventName record);

    int insertSelective(MemorySummaryByUserByEventName record);

    List<MemorySummaryByUserByEventName> selectByExample(MemorySummaryByUserByEventNameExample example);

    int updateByExampleSelective(@Param("record") MemorySummaryByUserByEventName record, @Param("example") MemorySummaryByUserByEventNameExample example);

    int updateByExample(@Param("record") MemorySummaryByUserByEventName record, @Param("example") MemorySummaryByUserByEventNameExample example);
}