package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.StatementsWithRuntimesIn95thPercentile;
import com.yan.crowdfunding.entity.StatementsWithRuntimesIn95thPercentileExample;
import com.yan.crowdfunding.entity.StatementsWithRuntimesIn95thPercentileWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementsWithRuntimesIn95thPercentileMapper {
    int countByExample(StatementsWithRuntimesIn95thPercentileExample example);

    int deleteByExample(StatementsWithRuntimesIn95thPercentileExample example);

    int insert(StatementsWithRuntimesIn95thPercentileWithBLOBs record);

    int insertSelective(StatementsWithRuntimesIn95thPercentileWithBLOBs record);

    List<StatementsWithRuntimesIn95thPercentileWithBLOBs> selectByExampleWithBLOBs(StatementsWithRuntimesIn95thPercentileExample example);

    List<StatementsWithRuntimesIn95thPercentile> selectByExample(StatementsWithRuntimesIn95thPercentileExample example);

    int updateByExampleSelective(@Param("record") StatementsWithRuntimesIn95thPercentileWithBLOBs record, @Param("example") StatementsWithRuntimesIn95thPercentileExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementsWithRuntimesIn95thPercentileWithBLOBs record, @Param("example") StatementsWithRuntimesIn95thPercentileExample example);

    int updateByExample(@Param("record") StatementsWithRuntimesIn95thPercentile record, @Param("example") StatementsWithRuntimesIn95thPercentileExample example);
}