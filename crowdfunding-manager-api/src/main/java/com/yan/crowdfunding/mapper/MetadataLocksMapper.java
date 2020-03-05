package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.MetadataLocks;
import com.yan.crowdfunding.entity.MetadataLocksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetadataLocksMapper {
    int countByExample(MetadataLocksExample example);

    int deleteByExample(MetadataLocksExample example);

    int insert(MetadataLocks record);

    int insertSelective(MetadataLocks record);

    List<MetadataLocks> selectByExample(MetadataLocksExample example);

    int updateByExampleSelective(@Param("record") MetadataLocks record, @Param("example") MetadataLocksExample example);

    int updateByExample(@Param("record") MetadataLocks record, @Param("example") MetadataLocksExample example);
}