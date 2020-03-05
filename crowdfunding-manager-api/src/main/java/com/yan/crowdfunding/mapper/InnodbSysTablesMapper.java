package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbSysTables;
import com.yan.crowdfunding.entity.InnodbSysTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysTablesMapper {
    int countByExample(InnodbSysTablesExample example);

    int deleteByExample(InnodbSysTablesExample example);

    int insert(InnodbSysTables record);

    int insertSelective(InnodbSysTables record);

    List<InnodbSysTables> selectByExample(InnodbSysTablesExample example);

    int updateByExampleSelective(@Param("record") InnodbSysTables record, @Param("example") InnodbSysTablesExample example);

    int updateByExample(@Param("record") InnodbSysTables record, @Param("example") InnodbSysTablesExample example);
}