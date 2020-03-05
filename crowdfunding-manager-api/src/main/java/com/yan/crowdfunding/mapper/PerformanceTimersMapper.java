package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.PerformanceTimers;
import com.yan.crowdfunding.entity.PerformanceTimersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerformanceTimersMapper {
    int countByExample(PerformanceTimersExample example);

    int deleteByExample(PerformanceTimersExample example);

    int insert(PerformanceTimers record);

    int insertSelective(PerformanceTimers record);

    List<PerformanceTimers> selectByExample(PerformanceTimersExample example);

    int updateByExampleSelective(@Param("record") PerformanceTimers record, @Param("example") PerformanceTimersExample example);

    int updateByExample(@Param("record") PerformanceTimers record, @Param("example") PerformanceTimersExample example);
}