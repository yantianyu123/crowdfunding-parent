package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.SysConfig;
import com.yan.crowdfunding.entity.SysConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysConfigMapper {
    int countByExample(SysConfigExample example);

    int deleteByExample(SysConfigExample example);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    List<SysConfig> selectByExample(SysConfigExample example);

    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example);
}