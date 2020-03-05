package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SetupObjects;
import com.yan.crowdfunding.entity.SetupObjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupObjectsMapper {
    int countByExample(SetupObjectsExample example);

    int deleteByExample(SetupObjectsExample example);

    int insert(SetupObjects record);

    int insertSelective(SetupObjects record);

    List<SetupObjects> selectByExample(SetupObjectsExample example);

    int updateByExampleSelective(@Param("record") SetupObjects record, @Param("example") SetupObjectsExample example);

    int updateByExample(@Param("record") SetupObjects record, @Param("example") SetupObjectsExample example);
}