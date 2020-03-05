package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SocketSummaryByInstance;
import com.yan.crowdfunding.entity.SocketSummaryByInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocketSummaryByInstanceMapper {
    int countByExample(SocketSummaryByInstanceExample example);

    int deleteByExample(SocketSummaryByInstanceExample example);

    int insert(SocketSummaryByInstance record);

    int insertSelective(SocketSummaryByInstance record);

    List<SocketSummaryByInstance> selectByExample(SocketSummaryByInstanceExample example);

    int updateByExampleSelective(@Param("record") SocketSummaryByInstance record, @Param("example") SocketSummaryByInstanceExample example);

    int updateByExample(@Param("record") SocketSummaryByInstance record, @Param("example") SocketSummaryByInstanceExample example);
}