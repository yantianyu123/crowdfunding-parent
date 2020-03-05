package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SetupActors;
import com.yan.crowdfunding.entity.SetupActorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupActorsMapper {
    int countByExample(SetupActorsExample example);

    int deleteByExample(SetupActorsExample example);

    int insert(SetupActors record);

    int insertSelective(SetupActors record);

    List<SetupActors> selectByExample(SetupActorsExample example);

    int updateByExampleSelective(@Param("record") SetupActors record, @Param("example") SetupActorsExample example);

    int updateByExample(@Param("record") SetupActors record, @Param("example") SetupActorsExample example);
}