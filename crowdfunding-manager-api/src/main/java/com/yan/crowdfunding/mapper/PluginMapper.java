package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Plugin;
import com.yan.crowdfunding.entity.PluginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginMapper {
    int countByExample(PluginExample example);

    int deleteByExample(PluginExample example);

    int insert(Plugin record);

    int insertSelective(Plugin record);

    List<Plugin> selectByExample(PluginExample example);

    int updateByExampleSelective(@Param("record") Plugin record, @Param("example") PluginExample example);

    int updateByExample(@Param("record") Plugin record, @Param("example") PluginExample example);
}