package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.CondInstances;
import com.yan.crowdfunding.entity.CondInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CondInstancesMapper {
    int countByExample(CondInstancesExample example);

    int deleteByExample(CondInstancesExample example);

    int insert(CondInstances record);

    int insertSelective(CondInstances record);

    List<CondInstances> selectByExample(CondInstancesExample example);

    int updateByExampleSelective(@Param("record") CondInstances record, @Param("example") CondInstancesExample example);

    int updateByExample(@Param("record") CondInstances record, @Param("example") CondInstancesExample example);
}