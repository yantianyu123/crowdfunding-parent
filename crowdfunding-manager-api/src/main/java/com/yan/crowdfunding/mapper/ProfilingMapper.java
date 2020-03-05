package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Profiling;
import com.yan.crowdfunding.entity.ProfilingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfilingMapper {
    int countByExample(ProfilingExample example);

    int deleteByExample(ProfilingExample example);

    int insert(Profiling record);

    int insertSelective(Profiling record);

    List<Profiling> selectByExample(ProfilingExample example);

    int updateByExampleSelective(@Param("record") Profiling record, @Param("example") ProfilingExample example);

    int updateByExample(@Param("record") Profiling record, @Param("example") ProfilingExample example);
}