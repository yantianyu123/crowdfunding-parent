package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SessionVariables;
import com.yan.crowdfunding.entity.SessionVariablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionVariablesMapper {
    int countByExample(SessionVariablesExample example);

    int deleteByExample(SessionVariablesExample example);

    int insert(SessionVariables record);

    int insertSelective(SessionVariables record);

    List<SessionVariables> selectByExample(SessionVariablesExample example);

    int updateByExampleSelective(@Param("record") SessionVariables record, @Param("example") SessionVariablesExample example);

    int updateByExample(@Param("record") SessionVariables record, @Param("example") SessionVariablesExample example);
}