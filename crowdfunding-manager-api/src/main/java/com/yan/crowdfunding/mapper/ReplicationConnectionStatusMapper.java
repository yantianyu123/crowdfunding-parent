package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.ReplicationConnectionStatus;
import com.yan.crowdfunding.entity.ReplicationConnectionStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationConnectionStatusMapper {
    int countByExample(ReplicationConnectionStatusExample example);

    int deleteByExample(ReplicationConnectionStatusExample example);

    int insert(ReplicationConnectionStatus record);

    int insertSelective(ReplicationConnectionStatus record);

    List<ReplicationConnectionStatus> selectByExampleWithBLOBs(ReplicationConnectionStatusExample example);

    List<ReplicationConnectionStatus> selectByExample(ReplicationConnectionStatusExample example);

    int updateByExampleSelective(@Param("record") ReplicationConnectionStatus record, @Param("example") ReplicationConnectionStatusExample example);

    int updateByExampleWithBLOBs(@Param("record") ReplicationConnectionStatus record, @Param("example") ReplicationConnectionStatusExample example);

    int updateByExample(@Param("record") ReplicationConnectionStatus record, @Param("example") ReplicationConnectionStatusExample example);
}