package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbTableStats;
import com.yan.crowdfunding.entity.InnodbTableStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTableStatsMapper {
    int countByExample(InnodbTableStatsExample example);

    int deleteByExample(InnodbTableStatsExample example);

    int insert(InnodbTableStats record);

    int insertSelective(InnodbTableStats record);

    List<InnodbTableStats> selectByExample(InnodbTableStatsExample example);

    int updateByExampleSelective(@Param("record") InnodbTableStats record, @Param("example") InnodbTableStatsExample example);

    int updateByExample(@Param("record") InnodbTableStats record, @Param("example") InnodbTableStatsExample example);
}