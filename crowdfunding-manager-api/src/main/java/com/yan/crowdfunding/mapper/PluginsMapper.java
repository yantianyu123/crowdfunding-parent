package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Plugins;
import com.yan.crowdfunding.entity.PluginsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginsMapper {
    int countByExample(PluginsExample example);

    int deleteByExample(PluginsExample example);

    int insert(Plugins record);

    int insertSelective(Plugins record);

    List<Plugins> selectByExampleWithBLOBs(PluginsExample example);

    List<Plugins> selectByExample(PluginsExample example);

    int updateByExampleSelective(@Param("record") Plugins record, @Param("example") PluginsExample example);

    int updateByExampleWithBLOBs(@Param("record") Plugins record, @Param("example") PluginsExample example);

    int updateByExample(@Param("record") Plugins record, @Param("example") PluginsExample example);
}