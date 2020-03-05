package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SchemaTableLockWaits;
import com.yan.crowdfunding.entity.SchemaTableLockWaitsExample;
import com.yan.crowdfunding.entity.SchemaTableLockWaitsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableLockWaitsMapper {
    int countByExample(SchemaTableLockWaitsExample example);

    int deleteByExample(SchemaTableLockWaitsExample example);

    int insert(SchemaTableLockWaitsWithBLOBs record);

    int insertSelective(SchemaTableLockWaitsWithBLOBs record);

    List<SchemaTableLockWaitsWithBLOBs> selectByExampleWithBLOBs(SchemaTableLockWaitsExample example);

    List<SchemaTableLockWaits> selectByExample(SchemaTableLockWaitsExample example);

    int updateByExampleSelective(@Param("record") SchemaTableLockWaitsWithBLOBs record, @Param("example") SchemaTableLockWaitsExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaTableLockWaitsWithBLOBs record, @Param("example") SchemaTableLockWaitsExample example);

    int updateByExample(@Param("record") SchemaTableLockWaits record, @Param("example") SchemaTableLockWaitsExample example);
}