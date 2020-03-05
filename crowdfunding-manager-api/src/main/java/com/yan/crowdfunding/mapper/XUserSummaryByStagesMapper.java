package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XUserSummaryByStages;
import com.yan.crowdfunding.entity.XUserSummaryByStagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByStagesMapper {
    int countByExample(XUserSummaryByStagesExample example);

    int deleteByExample(XUserSummaryByStagesExample example);

    int insert(XUserSummaryByStages record);

    int insertSelective(XUserSummaryByStages record);

    List<XUserSummaryByStages> selectByExample(XUserSummaryByStagesExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByStages record, @Param("example") XUserSummaryByStagesExample example);

    int updateByExample(@Param("record") XUserSummaryByStages record, @Param("example") XUserSummaryByStagesExample example);
}