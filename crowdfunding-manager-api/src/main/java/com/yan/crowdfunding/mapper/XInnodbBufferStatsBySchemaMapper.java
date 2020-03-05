package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XInnodbBufferStatsBySchema;
import com.yan.crowdfunding.entity.XInnodbBufferStatsBySchemaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XInnodbBufferStatsBySchemaMapper {
    int countByExample(XInnodbBufferStatsBySchemaExample example);

    int deleteByExample(XInnodbBufferStatsBySchemaExample example);

    int insert(XInnodbBufferStatsBySchema record);

    int insertSelective(XInnodbBufferStatsBySchema record);

    List<XInnodbBufferStatsBySchema> selectByExampleWithBLOBs(XInnodbBufferStatsBySchemaExample example);

    List<XInnodbBufferStatsBySchema> selectByExample(XInnodbBufferStatsBySchemaExample example);

    int updateByExampleSelective(@Param("record") XInnodbBufferStatsBySchema record, @Param("example") XInnodbBufferStatsBySchemaExample example);

    int updateByExampleWithBLOBs(@Param("record") XInnodbBufferStatsBySchema record, @Param("example") XInnodbBufferStatsBySchemaExample example);

    int updateByExample(@Param("record") XInnodbBufferStatsBySchema record, @Param("example") XInnodbBufferStatsBySchemaExample example);
}