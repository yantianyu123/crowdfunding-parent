package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbBufferStatsBySchema;
import com.yan.crowdfunding.entity.InnodbBufferStatsBySchemaExample;
import com.yan.crowdfunding.entity.InnodbBufferStatsBySchemaWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferStatsBySchemaMapper {
    int countByExample(InnodbBufferStatsBySchemaExample example);

    int deleteByExample(InnodbBufferStatsBySchemaExample example);

    int insert(InnodbBufferStatsBySchemaWithBLOBs record);

    int insertSelective(InnodbBufferStatsBySchemaWithBLOBs record);

    List<InnodbBufferStatsBySchemaWithBLOBs> selectByExampleWithBLOBs(InnodbBufferStatsBySchemaExample example);

    List<InnodbBufferStatsBySchema> selectByExample(InnodbBufferStatsBySchemaExample example);

    int updateByExampleSelective(@Param("record") InnodbBufferStatsBySchemaWithBLOBs record, @Param("example") InnodbBufferStatsBySchemaExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbBufferStatsBySchemaWithBLOBs record, @Param("example") InnodbBufferStatsBySchemaExample example);

    int updateByExample(@Param("record") InnodbBufferStatsBySchema record, @Param("example") InnodbBufferStatsBySchemaExample example);
}