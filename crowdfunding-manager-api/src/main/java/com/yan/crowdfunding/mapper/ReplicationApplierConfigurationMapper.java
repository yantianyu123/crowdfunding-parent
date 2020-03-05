package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.ReplicationApplierConfiguration;
import com.yan.crowdfunding.entity.ReplicationApplierConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierConfigurationMapper {
    int countByExample(ReplicationApplierConfigurationExample example);

    int deleteByExample(ReplicationApplierConfigurationExample example);

    int insert(ReplicationApplierConfiguration record);

    int insertSelective(ReplicationApplierConfiguration record);

    List<ReplicationApplierConfiguration> selectByExample(ReplicationApplierConfigurationExample example);

    int updateByExampleSelective(@Param("record") ReplicationApplierConfiguration record, @Param("example") ReplicationApplierConfigurationExample example);

    int updateByExample(@Param("record") ReplicationApplierConfiguration record, @Param("example") ReplicationApplierConfigurationExample example);
}