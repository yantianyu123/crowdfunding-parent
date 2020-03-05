package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.FileInstances;
import com.yan.crowdfunding.entity.FileInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileInstancesMapper {
    int countByExample(FileInstancesExample example);

    int deleteByExample(FileInstancesExample example);

    int insert(FileInstances record);

    int insertSelective(FileInstances record);

    List<FileInstances> selectByExample(FileInstancesExample example);

    int updateByExampleSelective(@Param("record") FileInstances record, @Param("example") FileInstancesExample example);

    int updateByExample(@Param("record") FileInstances record, @Param("example") FileInstancesExample example);
}