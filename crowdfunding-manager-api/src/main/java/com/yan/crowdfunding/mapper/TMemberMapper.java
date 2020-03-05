package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TMember;
import com.yan.crowdfunding.entity.TMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMemberMapper {
    int countByExample(TMemberExample example);

    int deleteByExample(TMemberExample example);

    int insert(TMember record);

    int insertSelective(TMember record);

    List<TMember> selectByExample(TMemberExample example);

    int updateByExampleSelective(@Param("record") TMember record, @Param("example") TMemberExample example);

    int updateByExample(@Param("record") TMember record, @Param("example") TMemberExample example);
}