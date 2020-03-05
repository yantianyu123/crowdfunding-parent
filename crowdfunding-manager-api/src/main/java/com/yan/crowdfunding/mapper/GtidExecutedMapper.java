package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.GtidExecuted;
import com.yan.crowdfunding.entity.GtidExecutedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GtidExecutedMapper {
    int countByExample(GtidExecutedExample example);

    int deleteByExample(GtidExecutedExample example);

    int insert(GtidExecuted record);

    int insertSelective(GtidExecuted record);

    List<GtidExecuted> selectByExample(GtidExecutedExample example);

    int updateByExampleSelective(@Param("record") GtidExecuted record, @Param("example") GtidExecutedExample example);

    int updateByExample(@Param("record") GtidExecuted record, @Param("example") GtidExecutedExample example);
}