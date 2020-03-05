package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.RwlockInstances;
import com.yan.crowdfunding.entity.RwlockInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RwlockInstancesMapper {
    int countByExample(RwlockInstancesExample example);

    int deleteByExample(RwlockInstancesExample example);

    int insert(RwlockInstances record);

    int insertSelective(RwlockInstances record);

    List<RwlockInstances> selectByExample(RwlockInstancesExample example);

    int updateByExampleSelective(@Param("record") RwlockInstances record, @Param("example") RwlockInstancesExample example);

    int updateByExample(@Param("record") RwlockInstances record, @Param("example") RwlockInstancesExample example);
}