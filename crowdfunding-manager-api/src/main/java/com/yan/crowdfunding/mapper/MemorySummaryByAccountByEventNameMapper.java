package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.MemorySummaryByAccountByEventName;
import com.yan.crowdfunding.entity.MemorySummaryByAccountByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryByAccountByEventNameMapper {
    int countByExample(MemorySummaryByAccountByEventNameExample example);

    int deleteByExample(MemorySummaryByAccountByEventNameExample example);

    int insert(MemorySummaryByAccountByEventName record);

    int insertSelective(MemorySummaryByAccountByEventName record);

    List<MemorySummaryByAccountByEventName> selectByExample(MemorySummaryByAccountByEventNameExample example);

    int updateByExampleSelective(@Param("record") MemorySummaryByAccountByEventName record, @Param("example") MemorySummaryByAccountByEventNameExample example);

    int updateByExample(@Param("record") MemorySummaryByAccountByEventName record, @Param("example") MemorySummaryByAccountByEventNameExample example);
}