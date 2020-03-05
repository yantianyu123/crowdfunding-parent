package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.UserSummary;
import com.yan.crowdfunding.entity.UserSummaryExample;
import com.yan.crowdfunding.entity.UserSummaryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryMapper {
    int countByExample(UserSummaryExample example);

    int deleteByExample(UserSummaryExample example);

    int insert(UserSummaryWithBLOBs record);

    int insertSelective(UserSummaryWithBLOBs record);

    List<UserSummaryWithBLOBs> selectByExampleWithBLOBs(UserSummaryExample example);

    List<UserSummary> selectByExample(UserSummaryExample example);

    int updateByExampleSelective(@Param("record") UserSummaryWithBLOBs record, @Param("example") UserSummaryExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSummaryWithBLOBs record, @Param("example") UserSummaryExample example);

    int updateByExample(@Param("record") UserSummary record, @Param("example") UserSummaryExample example);
}