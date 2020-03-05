package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Statistics;
import com.yan.crowdfunding.entity.StatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatisticsMapper {
    int countByExample(StatisticsExample example);

    int deleteByExample(StatisticsExample example);

    int insert(Statistics record);

    int insertSelective(Statistics record);

    List<Statistics> selectByExample(StatisticsExample example);

    int updateByExampleSelective(@Param("record") Statistics record, @Param("example") StatisticsExample example);

    int updateByExample(@Param("record") Statistics record, @Param("example") StatisticsExample example);
}