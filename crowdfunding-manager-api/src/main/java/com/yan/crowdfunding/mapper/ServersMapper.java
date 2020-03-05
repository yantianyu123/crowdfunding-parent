package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.Servers;
import com.yan.crowdfunding.entity.ServersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServersMapper {
    int countByExample(ServersExample example);

    int deleteByExample(ServersExample example);

    int insert(Servers record);

    int insertSelective(Servers record);

    List<Servers> selectByExample(ServersExample example);

    int updateByExampleSelective(@Param("record") Servers record, @Param("example") ServersExample example);

    int updateByExample(@Param("record") Servers record, @Param("example") ServersExample example);
}