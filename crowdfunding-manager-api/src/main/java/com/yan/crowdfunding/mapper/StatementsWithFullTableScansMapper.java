package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.StatementsWithFullTableScans;
import com.yan.crowdfunding.entity.StatementsWithFullTableScansExample;
import com.yan.crowdfunding.entity.StatementsWithFullTableScansWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementsWithFullTableScansMapper {
    int countByExample(StatementsWithFullTableScansExample example);

    int deleteByExample(StatementsWithFullTableScansExample example);

    int insert(StatementsWithFullTableScansWithBLOBs record);

    int insertSelective(StatementsWithFullTableScansWithBLOBs record);

    List<StatementsWithFullTableScansWithBLOBs> selectByExampleWithBLOBs(StatementsWithFullTableScansExample example);

    List<StatementsWithFullTableScans> selectByExample(StatementsWithFullTableScansExample example);

    int updateByExampleSelective(@Param("record") StatementsWithFullTableScansWithBLOBs record, @Param("example") StatementsWithFullTableScansExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementsWithFullTableScansWithBLOBs record, @Param("example") StatementsWithFullTableScansExample example);

    int updateByExample(@Param("record") StatementsWithFullTableScans record, @Param("example") StatementsWithFullTableScansExample example);
}