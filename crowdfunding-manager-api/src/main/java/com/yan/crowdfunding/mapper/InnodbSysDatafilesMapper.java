package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbSysDatafiles;
import com.yan.crowdfunding.entity.InnodbSysDatafilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysDatafilesMapper {
    int countByExample(InnodbSysDatafilesExample example);

    int deleteByExample(InnodbSysDatafilesExample example);

    int insert(InnodbSysDatafiles record);

    int insertSelective(InnodbSysDatafiles record);

    List<InnodbSysDatafiles> selectByExample(InnodbSysDatafilesExample example);

    int updateByExampleSelective(@Param("record") InnodbSysDatafiles record, @Param("example") InnodbSysDatafilesExample example);

    int updateByExample(@Param("record") InnodbSysDatafiles record, @Param("example") InnodbSysDatafilesExample example);
}