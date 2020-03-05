package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XSchemaTableLockWaits;
import com.yan.crowdfunding.entity.XSchemaTableLockWaitsExample;
import com.yan.crowdfunding.entity.XSchemaTableLockWaitsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSchemaTableLockWaitsMapper {
    int countByExample(XSchemaTableLockWaitsExample example);

    int deleteByExample(XSchemaTableLockWaitsExample example);

    int insert(XSchemaTableLockWaitsWithBLOBs record);

    int insertSelective(XSchemaTableLockWaitsWithBLOBs record);

    List<XSchemaTableLockWaitsWithBLOBs> selectByExampleWithBLOBs(XSchemaTableLockWaitsExample example);

    List<XSchemaTableLockWaits> selectByExample(XSchemaTableLockWaitsExample example);

    int updateByExampleSelective(@Param("record") XSchemaTableLockWaitsWithBLOBs record, @Param("example") XSchemaTableLockWaitsExample example);

    int updateByExampleWithBLOBs(@Param("record") XSchemaTableLockWaitsWithBLOBs record, @Param("example") XSchemaTableLockWaitsExample example);

    int updateByExample(@Param("record") XSchemaTableLockWaits record, @Param("example") XSchemaTableLockWaitsExample example);
}