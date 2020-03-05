package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.PreparedStatementsInstances;
import com.yan.crowdfunding.entity.PreparedStatementsInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreparedStatementsInstancesMapper {
    int countByExample(PreparedStatementsInstancesExample example);

    int deleteByExample(PreparedStatementsInstancesExample example);

    int insert(PreparedStatementsInstances record);

    int insertSelective(PreparedStatementsInstances record);

    List<PreparedStatementsInstances> selectByExampleWithBLOBs(PreparedStatementsInstancesExample example);

    List<PreparedStatementsInstances> selectByExample(PreparedStatementsInstancesExample example);

    int updateByExampleSelective(@Param("record") PreparedStatementsInstances record, @Param("example") PreparedStatementsInstancesExample example);

    int updateByExampleWithBLOBs(@Param("record") PreparedStatementsInstances record, @Param("example") PreparedStatementsInstancesExample example);

    int updateByExample(@Param("record") PreparedStatementsInstances record, @Param("example") PreparedStatementsInstancesExample example);
}