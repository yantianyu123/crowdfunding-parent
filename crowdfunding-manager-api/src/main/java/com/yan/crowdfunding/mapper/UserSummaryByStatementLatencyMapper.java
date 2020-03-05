package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.UserSummaryByStatementLatency;
import com.yan.crowdfunding.entity.UserSummaryByStatementLatencyExample;
import com.yan.crowdfunding.entity.UserSummaryByStatementLatencyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByStatementLatencyMapper {
    int countByExample(UserSummaryByStatementLatencyExample example);

    int deleteByExample(UserSummaryByStatementLatencyExample example);

    int insert(UserSummaryByStatementLatencyWithBLOBs record);

    int insertSelective(UserSummaryByStatementLatencyWithBLOBs record);

    List<UserSummaryByStatementLatencyWithBLOBs> selectByExampleWithBLOBs(UserSummaryByStatementLatencyExample example);

    List<UserSummaryByStatementLatency> selectByExample(UserSummaryByStatementLatencyExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByStatementLatencyWithBLOBs record, @Param("example") UserSummaryByStatementLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSummaryByStatementLatencyWithBLOBs record, @Param("example") UserSummaryByStatementLatencyExample example);

    int updateByExample(@Param("record") UserSummaryByStatementLatency record, @Param("example") UserSummaryByStatementLatencyExample example);
}