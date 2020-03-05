package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.XHostSummary;
import com.yan.crowdfunding.entity.XHostSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryMapper {
    int countByExample(XHostSummaryExample example);

    int deleteByExample(XHostSummaryExample example);

    int insert(XHostSummary record);

    int insertSelective(XHostSummary record);

    List<XHostSummary> selectByExample(XHostSummaryExample example);

    int updateByExampleSelective(@Param("record") XHostSummary record, @Param("example") XHostSummaryExample example);

    int updateByExample(@Param("record") XHostSummary record, @Param("example") XHostSummaryExample example);
}