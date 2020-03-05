package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XWaitClassesGlobalByAvgLatency;
import com.yan.crowdfunding.entity.XWaitClassesGlobalByAvgLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitClassesGlobalByAvgLatencyMapper {
    int countByExample(XWaitClassesGlobalByAvgLatencyExample example);

    int deleteByExample(XWaitClassesGlobalByAvgLatencyExample example);

    int insert(XWaitClassesGlobalByAvgLatency record);

    int insertSelective(XWaitClassesGlobalByAvgLatency record);

    List<XWaitClassesGlobalByAvgLatency> selectByExample(XWaitClassesGlobalByAvgLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitClassesGlobalByAvgLatency record, @Param("example") XWaitClassesGlobalByAvgLatencyExample example);

    int updateByExample(@Param("record") XWaitClassesGlobalByAvgLatency record, @Param("example") XWaitClassesGlobalByAvgLatencyExample example);
}