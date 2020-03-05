package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbSysColumns;
import com.yan.crowdfunding.entity.InnodbSysColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysColumnsMapper {
    int countByExample(InnodbSysColumnsExample example);

    int deleteByExample(InnodbSysColumnsExample example);

    int insert(InnodbSysColumns record);

    int insertSelective(InnodbSysColumns record);

    List<InnodbSysColumns> selectByExample(InnodbSysColumnsExample example);

    int updateByExampleSelective(@Param("record") InnodbSysColumns record, @Param("example") InnodbSysColumnsExample example);

    int updateByExample(@Param("record") InnodbSysColumns record, @Param("example") InnodbSysColumnsExample example);
}