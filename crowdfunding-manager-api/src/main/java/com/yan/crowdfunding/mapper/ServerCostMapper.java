package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.ServerCost;
import com.yan.crowdfunding.entity.ServerCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerCostMapper {
    int countByExample(ServerCostExample example);

    int deleteByExample(ServerCostExample example);

    int insert(ServerCost record);

    int insertSelective(ServerCost record);

    List<ServerCost> selectByExample(ServerCostExample example);

    int updateByExampleSelective(@Param("record") ServerCost record, @Param("example") ServerCostExample example);

    int updateByExample(@Param("record") ServerCost record, @Param("example") ServerCostExample example);
}