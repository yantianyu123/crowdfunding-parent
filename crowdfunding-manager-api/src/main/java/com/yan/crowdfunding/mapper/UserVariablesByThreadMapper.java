package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.UserVariablesByThread;
import com.yan.crowdfunding.entity.UserVariablesByThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserVariablesByThreadMapper {
    int countByExample(UserVariablesByThreadExample example);

    int deleteByExample(UserVariablesByThreadExample example);

    int insert(UserVariablesByThread record);

    int insertSelective(UserVariablesByThread record);

    List<UserVariablesByThread> selectByExampleWithBLOBs(UserVariablesByThreadExample example);

    List<UserVariablesByThread> selectByExample(UserVariablesByThreadExample example);

    int updateByExampleSelective(@Param("record") UserVariablesByThread record, @Param("example") UserVariablesByThreadExample example);

    int updateByExampleWithBLOBs(@Param("record") UserVariablesByThread record, @Param("example") UserVariablesByThreadExample example);

    int updateByExample(@Param("record") UserVariablesByThread record, @Param("example") UserVariablesByThreadExample example);
}