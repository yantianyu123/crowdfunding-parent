package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XInnodbBufferStatsByTable;
import com.yan.crowdfunding.entity.XInnodbBufferStatsByTableExample;
import com.yan.crowdfunding.entity.XInnodbBufferStatsByTableWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XInnodbBufferStatsByTableMapper {
    int countByExample(XInnodbBufferStatsByTableExample example);

    int deleteByExample(XInnodbBufferStatsByTableExample example);

    int insert(XInnodbBufferStatsByTableWithBLOBs record);

    int insertSelective(XInnodbBufferStatsByTableWithBLOBs record);

    List<XInnodbBufferStatsByTableWithBLOBs> selectByExampleWithBLOBs(XInnodbBufferStatsByTableExample example);

    List<XInnodbBufferStatsByTable> selectByExample(XInnodbBufferStatsByTableExample example);

    int updateByExampleSelective(@Param("record") XInnodbBufferStatsByTableWithBLOBs record, @Param("example") XInnodbBufferStatsByTableExample example);

    int updateByExampleWithBLOBs(@Param("record") XInnodbBufferStatsByTableWithBLOBs record, @Param("example") XInnodbBufferStatsByTableExample example);

    int updateByExample(@Param("record") XInnodbBufferStatsByTable record, @Param("example") XInnodbBufferStatsByTableExample example);
}