package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.PsCheckLostInstrumentation;
import com.yan.crowdfunding.entity.PsCheckLostInstrumentationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsCheckLostInstrumentationMapper {
    int countByExample(PsCheckLostInstrumentationExample example);

    int deleteByExample(PsCheckLostInstrumentationExample example);

    int insert(PsCheckLostInstrumentation record);

    int insertSelective(PsCheckLostInstrumentation record);

    List<PsCheckLostInstrumentation> selectByExample(PsCheckLostInstrumentationExample example);

    int updateByExampleSelective(@Param("record") PsCheckLostInstrumentation record, @Param("example") PsCheckLostInstrumentationExample example);

    int updateByExample(@Param("record") PsCheckLostInstrumentation record, @Param("example") PsCheckLostInstrumentationExample example);
}