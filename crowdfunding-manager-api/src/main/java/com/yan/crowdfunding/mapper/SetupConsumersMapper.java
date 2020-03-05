package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SetupConsumers;
import com.yan.crowdfunding.entity.SetupConsumersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupConsumersMapper {
    int countByExample(SetupConsumersExample example);

    int deleteByExample(SetupConsumersExample example);

    int insert(SetupConsumers record);

    int insertSelective(SetupConsumers record);

    List<SetupConsumers> selectByExample(SetupConsumersExample example);

    int updateByExampleSelective(@Param("record") SetupConsumers record, @Param("example") SetupConsumersExample example);

    int updateByExample(@Param("record") SetupConsumers record, @Param("example") SetupConsumersExample example);
}