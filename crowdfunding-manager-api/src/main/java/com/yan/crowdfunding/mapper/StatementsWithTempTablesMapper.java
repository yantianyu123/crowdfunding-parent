package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.StatementsWithTempTables;
import com.yan.crowdfunding.entity.StatementsWithTempTablesExample;
import com.yan.crowdfunding.entity.StatementsWithTempTablesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementsWithTempTablesMapper {
    int countByExample(StatementsWithTempTablesExample example);

    int deleteByExample(StatementsWithTempTablesExample example);

    int insert(StatementsWithTempTablesWithBLOBs record);

    int insertSelective(StatementsWithTempTablesWithBLOBs record);

    List<StatementsWithTempTablesWithBLOBs> selectByExampleWithBLOBs(StatementsWithTempTablesExample example);

    List<StatementsWithTempTables> selectByExample(StatementsWithTempTablesExample example);

    int updateByExampleSelective(@Param("record") StatementsWithTempTablesWithBLOBs record, @Param("example") StatementsWithTempTablesExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementsWithTempTablesWithBLOBs record, @Param("example") StatementsWithTempTablesExample example);

    int updateByExample(@Param("record") StatementsWithTempTables record, @Param("example") StatementsWithTempTablesExample example);
}