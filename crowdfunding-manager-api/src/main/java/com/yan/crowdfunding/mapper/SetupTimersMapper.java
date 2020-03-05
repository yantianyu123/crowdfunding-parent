package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SetupTimers;
import com.yan.crowdfunding.entity.SetupTimersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupTimersMapper {
    int countByExample(SetupTimersExample example);

    int deleteByExample(SetupTimersExample example);

    int insert(SetupTimers record);

    int insertSelective(SetupTimers record);

    List<SetupTimers> selectByExample(SetupTimersExample example);

    int updateByExampleSelective(@Param("record") SetupTimers record, @Param("example") SetupTimersExample example);

    int updateByExample(@Param("record") SetupTimers record, @Param("example") SetupTimersExample example);
}