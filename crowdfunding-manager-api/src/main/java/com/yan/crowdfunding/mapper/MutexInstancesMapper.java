package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.MutexInstances;
import com.yan.crowdfunding.entity.MutexInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MutexInstancesMapper {
    int countByExample(MutexInstancesExample example);

    int deleteByExample(MutexInstancesExample example);

    int insert(MutexInstances record);

    int insertSelective(MutexInstances record);

    List<MutexInstances> selectByExample(MutexInstancesExample example);

    int updateByExampleSelective(@Param("record") MutexInstances record, @Param("example") MutexInstancesExample example);

    int updateByExample(@Param("record") MutexInstances record, @Param("example") MutexInstancesExample example);
}