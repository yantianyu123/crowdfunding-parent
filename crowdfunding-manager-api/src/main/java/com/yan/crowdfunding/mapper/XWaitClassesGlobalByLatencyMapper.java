package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XWaitClassesGlobalByLatency;
import com.yan.crowdfunding.entity.XWaitClassesGlobalByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitClassesGlobalByLatencyMapper {
    int countByExample(XWaitClassesGlobalByLatencyExample example);

    int deleteByExample(XWaitClassesGlobalByLatencyExample example);

    int insert(XWaitClassesGlobalByLatency record);

    int insertSelective(XWaitClassesGlobalByLatency record);

    List<XWaitClassesGlobalByLatency> selectByExample(XWaitClassesGlobalByLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitClassesGlobalByLatency record, @Param("example") XWaitClassesGlobalByLatencyExample example);

    int updateByExample(@Param("record") XWaitClassesGlobalByLatency record, @Param("example") XWaitClassesGlobalByLatencyExample example);
}