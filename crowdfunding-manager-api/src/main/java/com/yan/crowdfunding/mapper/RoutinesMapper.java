package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Routines;
import com.yan.crowdfunding.entity.RoutinesExample;
import com.yan.crowdfunding.entity.RoutinesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutinesMapper {
    int countByExample(RoutinesExample example);

    int deleteByExample(RoutinesExample example);

    int insert(RoutinesWithBLOBs record);

    int insertSelective(RoutinesWithBLOBs record);

    List<RoutinesWithBLOBs> selectByExampleWithBLOBs(RoutinesExample example);

    List<Routines> selectByExample(RoutinesExample example);

    int updateByExampleSelective(@Param("record") RoutinesWithBLOBs record, @Param("example") RoutinesExample example);

    int updateByExampleWithBLOBs(@Param("record") RoutinesWithBLOBs record, @Param("example") RoutinesExample example);

    int updateByExample(@Param("record") Routines record, @Param("example") RoutinesExample example);
}