package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Schemata;
import com.yan.crowdfunding.entity.SchemataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemataMapper {
    int countByExample(SchemataExample example);

    int deleteByExample(SchemataExample example);

    int insert(Schemata record);

    int insertSelective(Schemata record);

    List<Schemata> selectByExample(SchemataExample example);

    int updateByExampleSelective(@Param("record") Schemata record, @Param("example") SchemataExample example);

    int updateByExample(@Param("record") Schemata record, @Param("example") SchemataExample example);
}