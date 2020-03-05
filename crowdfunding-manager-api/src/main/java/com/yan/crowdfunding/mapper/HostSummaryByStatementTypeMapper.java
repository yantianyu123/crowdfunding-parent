package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.HostSummaryByStatementType;
import com.yan.crowdfunding.entity.HostSummaryByStatementTypeExample;
import com.yan.crowdfunding.entity.HostSummaryByStatementTypeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByStatementTypeMapper {
    int countByExample(HostSummaryByStatementTypeExample example);

    int deleteByExample(HostSummaryByStatementTypeExample example);

    int insert(HostSummaryByStatementTypeWithBLOBs record);

    int insertSelective(HostSummaryByStatementTypeWithBLOBs record);

    List<HostSummaryByStatementTypeWithBLOBs> selectByExampleWithBLOBs(HostSummaryByStatementTypeExample example);

    List<HostSummaryByStatementType> selectByExample(HostSummaryByStatementTypeExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByStatementTypeWithBLOBs record, @Param("example") HostSummaryByStatementTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") HostSummaryByStatementTypeWithBLOBs record, @Param("example") HostSummaryByStatementTypeExample example);

    int updateByExample(@Param("record") HostSummaryByStatementType record, @Param("example") HostSummaryByStatementTypeExample example);
}