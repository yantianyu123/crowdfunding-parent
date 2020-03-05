package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbIndexStats;
import com.yan.crowdfunding.entity.InnodbIndexStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbIndexStatsMapper {
    int countByExample(InnodbIndexStatsExample example);

    int deleteByExample(InnodbIndexStatsExample example);

    int insert(InnodbIndexStats record);

    int insertSelective(InnodbIndexStats record);

    List<InnodbIndexStats> selectByExample(InnodbIndexStatsExample example);

    int updateByExampleSelective(@Param("record") InnodbIndexStats record, @Param("example") InnodbIndexStatsExample example);

    int updateByExample(@Param("record") InnodbIndexStats record, @Param("example") InnodbIndexStatsExample example);
}