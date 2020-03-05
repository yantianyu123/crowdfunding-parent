package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.ReplicationApplierStatusByWorker;
import com.yan.crowdfunding.entity.ReplicationApplierStatusByWorkerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierStatusByWorkerMapper {
    int countByExample(ReplicationApplierStatusByWorkerExample example);

    int deleteByExample(ReplicationApplierStatusByWorkerExample example);

    int insert(ReplicationApplierStatusByWorker record);

    int insertSelective(ReplicationApplierStatusByWorker record);

    List<ReplicationApplierStatusByWorker> selectByExample(ReplicationApplierStatusByWorkerExample example);

    int updateByExampleSelective(@Param("record") ReplicationApplierStatusByWorker record, @Param("example") ReplicationApplierStatusByWorkerExample example);

    int updateByExample(@Param("record") ReplicationApplierStatusByWorker record, @Param("example") ReplicationApplierStatusByWorkerExample example);
}