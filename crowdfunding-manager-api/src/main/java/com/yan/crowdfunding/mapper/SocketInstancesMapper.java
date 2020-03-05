package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SocketInstances;
import com.yan.crowdfunding.entity.SocketInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocketInstancesMapper {
    int countByExample(SocketInstancesExample example);

    int deleteByExample(SocketInstancesExample example);

    int insert(SocketInstances record);

    int insertSelective(SocketInstances record);

    List<SocketInstances> selectByExample(SocketInstancesExample example);

    int updateByExampleSelective(@Param("record") SocketInstances record, @Param("example") SocketInstancesExample example);

    int updateByExample(@Param("record") SocketInstances record, @Param("example") SocketInstancesExample example);
}