package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.ReplicationApplierStatusByCoordinator;
import com.yan.crowdfunding.entity.ReplicationApplierStatusByCoordinatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierStatusByCoordinatorMapper {
    int countByExample(ReplicationApplierStatusByCoordinatorExample example);

    int deleteByExample(ReplicationApplierStatusByCoordinatorExample example);

    int insert(ReplicationApplierStatusByCoordinator record);

    int insertSelective(ReplicationApplierStatusByCoordinator record);

    List<ReplicationApplierStatusByCoordinator> selectByExample(ReplicationApplierStatusByCoordinatorExample example);

    int updateByExampleSelective(@Param("record") ReplicationApplierStatusByCoordinator record, @Param("example") ReplicationApplierStatusByCoordinatorExample example);

    int updateByExample(@Param("record") ReplicationApplierStatusByCoordinator record, @Param("example") ReplicationApplierStatusByCoordinatorExample example);
}