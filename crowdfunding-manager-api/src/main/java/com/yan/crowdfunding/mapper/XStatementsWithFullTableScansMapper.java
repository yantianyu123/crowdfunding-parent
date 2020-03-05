package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XStatementsWithFullTableScans;
import com.yan.crowdfunding.entity.XStatementsWithFullTableScansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XStatementsWithFullTableScansMapper {
    int countByExample(XStatementsWithFullTableScansExample example);

    int deleteByExample(XStatementsWithFullTableScansExample example);

    int insert(XStatementsWithFullTableScans record);

    int insertSelective(XStatementsWithFullTableScans record);

    List<XStatementsWithFullTableScans> selectByExampleWithBLOBs(XStatementsWithFullTableScansExample example);

    List<XStatementsWithFullTableScans> selectByExample(XStatementsWithFullTableScansExample example);

    int updateByExampleSelective(@Param("record") XStatementsWithFullTableScans record, @Param("example") XStatementsWithFullTableScansExample example);

    int updateByExampleWithBLOBs(@Param("record") XStatementsWithFullTableScans record, @Param("example") XStatementsWithFullTableScansExample example);

    int updateByExample(@Param("record") XStatementsWithFullTableScans record, @Param("example") XStatementsWithFullTableScansExample example);
}