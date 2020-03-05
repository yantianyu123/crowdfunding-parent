package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbBufferStatsByTable;
import com.yan.crowdfunding.entity.InnodbBufferStatsByTableExample;
import com.yan.crowdfunding.entity.InnodbBufferStatsByTableWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferStatsByTableMapper {
    int countByExample(InnodbBufferStatsByTableExample example);

    int deleteByExample(InnodbBufferStatsByTableExample example);

    int insert(InnodbBufferStatsByTableWithBLOBs record);

    int insertSelective(InnodbBufferStatsByTableWithBLOBs record);

    List<InnodbBufferStatsByTableWithBLOBs> selectByExampleWithBLOBs(InnodbBufferStatsByTableExample example);

    List<InnodbBufferStatsByTable> selectByExample(InnodbBufferStatsByTableExample example);

    int updateByExampleSelective(@Param("record") InnodbBufferStatsByTableWithBLOBs record, @Param("example") InnodbBufferStatsByTableExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbBufferStatsByTableWithBLOBs record, @Param("example") InnodbBufferStatsByTableExample example);

    int updateByExample(@Param("record") InnodbBufferStatsByTable record, @Param("example") InnodbBufferStatsByTableExample example);
}