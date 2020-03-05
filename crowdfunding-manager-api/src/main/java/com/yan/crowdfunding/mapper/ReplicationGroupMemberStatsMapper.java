package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.ReplicationGroupMemberStats;
import com.yan.crowdfunding.entity.ReplicationGroupMemberStatsExample;
import com.yan.crowdfunding.entity.ReplicationGroupMemberStatsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationGroupMemberStatsMapper {
    int countByExample(ReplicationGroupMemberStatsExample example);

    int deleteByExample(ReplicationGroupMemberStatsExample example);

    int insert(ReplicationGroupMemberStatsWithBLOBs record);

    int insertSelective(ReplicationGroupMemberStatsWithBLOBs record);

    List<ReplicationGroupMemberStatsWithBLOBs> selectByExampleWithBLOBs(ReplicationGroupMemberStatsExample example);

    List<ReplicationGroupMemberStats> selectByExample(ReplicationGroupMemberStatsExample example);

    int updateByExampleSelective(@Param("record") ReplicationGroupMemberStatsWithBLOBs record, @Param("example") ReplicationGroupMemberStatsExample example);

    int updateByExampleWithBLOBs(@Param("record") ReplicationGroupMemberStatsWithBLOBs record, @Param("example") ReplicationGroupMemberStatsExample example);

    int updateByExample(@Param("record") ReplicationGroupMemberStats record, @Param("example") ReplicationGroupMemberStatsExample example);
}