package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SocketSummaryByEventName;
import com.yan.crowdfunding.entity.SocketSummaryByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocketSummaryByEventNameMapper {
    int countByExample(SocketSummaryByEventNameExample example);

    int deleteByExample(SocketSummaryByEventNameExample example);

    int insert(SocketSummaryByEventName record);

    int insertSelective(SocketSummaryByEventName record);

    List<SocketSummaryByEventName> selectByExample(SocketSummaryByEventNameExample example);

    int updateByExampleSelective(@Param("record") SocketSummaryByEventName record, @Param("example") SocketSummaryByEventNameExample example);

    int updateByExample(@Param("record") SocketSummaryByEventName record, @Param("example") SocketSummaryByEventNameExample example);
}