package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbSysVirtual;
import com.yan.crowdfunding.entity.InnodbSysVirtualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysVirtualMapper {
    int countByExample(InnodbSysVirtualExample example);

    int deleteByExample(InnodbSysVirtualExample example);

    int insert(InnodbSysVirtual record);

    int insertSelective(InnodbSysVirtual record);

    List<InnodbSysVirtual> selectByExample(InnodbSysVirtualExample example);

    int updateByExampleSelective(@Param("record") InnodbSysVirtual record, @Param("example") InnodbSysVirtualExample example);

    int updateByExample(@Param("record") InnodbSysVirtual record, @Param("example") InnodbSysVirtualExample example);
}