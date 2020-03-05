package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.ReplicationConnectionConfiguration;
import com.yan.crowdfunding.entity.ReplicationConnectionConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationConnectionConfigurationMapper {
    int countByExample(ReplicationConnectionConfigurationExample example);

    int deleteByExample(ReplicationConnectionConfigurationExample example);

    int insert(ReplicationConnectionConfiguration record);

    int insertSelective(ReplicationConnectionConfiguration record);

    List<ReplicationConnectionConfiguration> selectByExample(ReplicationConnectionConfigurationExample example);

    int updateByExampleSelective(@Param("record") ReplicationConnectionConfiguration record, @Param("example") ReplicationConnectionConfigurationExample example);

    int updateByExample(@Param("record") ReplicationConnectionConfiguration record, @Param("example") ReplicationConnectionConfigurationExample example);
}