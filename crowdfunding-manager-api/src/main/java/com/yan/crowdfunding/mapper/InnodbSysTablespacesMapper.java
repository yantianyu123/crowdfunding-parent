package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.InnodbSysTablespaces;
import com.yan.crowdfunding.entity.InnodbSysTablespacesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysTablespacesMapper {
    int countByExample(InnodbSysTablespacesExample example);

    int deleteByExample(InnodbSysTablespacesExample example);

    int insert(InnodbSysTablespaces record);

    int insertSelective(InnodbSysTablespaces record);

    List<InnodbSysTablespaces> selectByExample(InnodbSysTablespacesExample example);

    int updateByExampleSelective(@Param("record") InnodbSysTablespaces record, @Param("example") InnodbSysTablespacesExample example);

    int updateByExample(@Param("record") InnodbSysTablespaces record, @Param("example") InnodbSysTablespacesExample example);
}