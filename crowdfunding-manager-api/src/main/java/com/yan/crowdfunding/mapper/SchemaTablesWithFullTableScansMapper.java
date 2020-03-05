package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SchemaTablesWithFullTableScans;
import com.yan.crowdfunding.entity.SchemaTablesWithFullTableScansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTablesWithFullTableScansMapper {
    int countByExample(SchemaTablesWithFullTableScansExample example);

    int deleteByExample(SchemaTablesWithFullTableScansExample example);

    int insert(SchemaTablesWithFullTableScans record);

    int insertSelective(SchemaTablesWithFullTableScans record);

    List<SchemaTablesWithFullTableScans> selectByExampleWithBLOBs(SchemaTablesWithFullTableScansExample example);

    List<SchemaTablesWithFullTableScans> selectByExample(SchemaTablesWithFullTableScansExample example);

    int updateByExampleSelective(@Param("record") SchemaTablesWithFullTableScans record, @Param("example") SchemaTablesWithFullTableScansExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaTablesWithFullTableScans record, @Param("example") SchemaTablesWithFullTableScansExample example);

    int updateByExample(@Param("record") SchemaTablesWithFullTableScans record, @Param("example") SchemaTablesWithFullTableScansExample example);
}