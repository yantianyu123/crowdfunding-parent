package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XWaitsByHostByLatency;
import com.yan.crowdfunding.entity.XWaitsByHostByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitsByHostByLatencyMapper {
    int countByExample(XWaitsByHostByLatencyExample example);

    int deleteByExample(XWaitsByHostByLatencyExample example);

    int insert(XWaitsByHostByLatency record);

    int insertSelective(XWaitsByHostByLatency record);

    List<XWaitsByHostByLatency> selectByExample(XWaitsByHostByLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitsByHostByLatency record, @Param("example") XWaitsByHostByLatencyExample example);

    int updateByExample(@Param("record") XWaitsByHostByLatency record, @Param("example") XWaitsByHostByLatencyExample example);
}