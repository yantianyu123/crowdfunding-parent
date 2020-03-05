package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.ReplicationApplierStatus;
import com.yan.crowdfunding.entity.ReplicationApplierStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierStatusMapper {
    int countByExample(ReplicationApplierStatusExample example);

    int deleteByExample(ReplicationApplierStatusExample example);

    int insert(ReplicationApplierStatus record);

    int insertSelective(ReplicationApplierStatus record);

    List<ReplicationApplierStatus> selectByExample(ReplicationApplierStatusExample example);

    int updateByExampleSelective(@Param("record") ReplicationApplierStatus record, @Param("example") ReplicationApplierStatusExample example);

    int updateByExample(@Param("record") ReplicationApplierStatus record, @Param("example") ReplicationApplierStatusExample example);
}