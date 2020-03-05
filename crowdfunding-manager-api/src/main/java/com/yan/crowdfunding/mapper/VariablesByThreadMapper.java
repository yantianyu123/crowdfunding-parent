package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.VariablesByThread;
import com.yan.crowdfunding.entity.VariablesByThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VariablesByThreadMapper {
    int countByExample(VariablesByThreadExample example);

    int deleteByExample(VariablesByThreadExample example);

    int insert(VariablesByThread record);

    int insertSelective(VariablesByThread record);

    List<VariablesByThread> selectByExample(VariablesByThreadExample example);

    int updateByExampleSelective(@Param("record") VariablesByThread record, @Param("example") VariablesByThreadExample example);

    int updateByExample(@Param("record") VariablesByThread record, @Param("example") VariablesByThreadExample example);
}