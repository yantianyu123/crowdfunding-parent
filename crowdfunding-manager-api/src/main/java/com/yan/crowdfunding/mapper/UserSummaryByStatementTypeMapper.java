package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.UserSummaryByStatementType;
import com.yan.crowdfunding.entity.UserSummaryByStatementTypeExample;
import com.yan.crowdfunding.entity.UserSummaryByStatementTypeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByStatementTypeMapper {
    int countByExample(UserSummaryByStatementTypeExample example);

    int deleteByExample(UserSummaryByStatementTypeExample example);

    int insert(UserSummaryByStatementTypeWithBLOBs record);

    int insertSelective(UserSummaryByStatementTypeWithBLOBs record);

    List<UserSummaryByStatementTypeWithBLOBs> selectByExampleWithBLOBs(UserSummaryByStatementTypeExample example);

    List<UserSummaryByStatementType> selectByExample(UserSummaryByStatementTypeExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByStatementTypeWithBLOBs record, @Param("example") UserSummaryByStatementTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSummaryByStatementTypeWithBLOBs record, @Param("example") UserSummaryByStatementTypeExample example);

    int updateByExample(@Param("record") UserSummaryByStatementType record, @Param("example") UserSummaryByStatementTypeExample example);
}