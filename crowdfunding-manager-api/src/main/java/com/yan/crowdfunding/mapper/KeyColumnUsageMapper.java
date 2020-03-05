package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.KeyColumnUsage;
import com.yan.crowdfunding.entity.KeyColumnUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeyColumnUsageMapper {
    int countByExample(KeyColumnUsageExample example);

    int deleteByExample(KeyColumnUsageExample example);

    int insert(KeyColumnUsage record);

    int insertSelective(KeyColumnUsage record);

    List<KeyColumnUsage> selectByExample(KeyColumnUsageExample example);

    int updateByExampleSelective(@Param("record") KeyColumnUsage record, @Param("example") KeyColumnUsageExample example);

    int updateByExample(@Param("record") KeyColumnUsage record, @Param("example") KeyColumnUsageExample example);
}