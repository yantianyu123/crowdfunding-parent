package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.UserSummaryByStages;
import com.yan.crowdfunding.entity.UserSummaryByStagesExample;
import com.yan.crowdfunding.entity.UserSummaryByStagesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByStagesMapper {
    int countByExample(UserSummaryByStagesExample example);

    int deleteByExample(UserSummaryByStagesExample example);

    int insert(UserSummaryByStagesWithBLOBs record);

    int insertSelective(UserSummaryByStagesWithBLOBs record);

    List<UserSummaryByStagesWithBLOBs> selectByExampleWithBLOBs(UserSummaryByStagesExample example);

    List<UserSummaryByStages> selectByExample(UserSummaryByStagesExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByStagesWithBLOBs record, @Param("example") UserSummaryByStagesExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSummaryByStagesWithBLOBs record, @Param("example") UserSummaryByStagesExample example);

    int updateByExample(@Param("record") UserSummaryByStages record, @Param("example") UserSummaryByStagesExample example);
}