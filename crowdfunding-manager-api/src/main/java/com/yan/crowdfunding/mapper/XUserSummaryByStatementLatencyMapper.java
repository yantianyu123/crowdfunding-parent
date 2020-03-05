package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XUserSummaryByStatementLatency;
import com.yan.crowdfunding.entity.XUserSummaryByStatementLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByStatementLatencyMapper {
    int countByExample(XUserSummaryByStatementLatencyExample example);

    int deleteByExample(XUserSummaryByStatementLatencyExample example);

    int insert(XUserSummaryByStatementLatency record);

    int insertSelective(XUserSummaryByStatementLatency record);

    List<XUserSummaryByStatementLatency> selectByExample(XUserSummaryByStatementLatencyExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByStatementLatency record, @Param("example") XUserSummaryByStatementLatencyExample example);

    int updateByExample(@Param("record") XUserSummaryByStatementLatency record, @Param("example") XUserSummaryByStatementLatencyExample example);
}