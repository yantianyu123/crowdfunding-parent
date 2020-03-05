package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.HostCache;
import com.yan.crowdfunding.entity.HostCacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostCacheMapper {
    int countByExample(HostCacheExample example);

    int deleteByExample(HostCacheExample example);

    int insert(HostCache record);

    int insertSelective(HostCache record);

    List<HostCache> selectByExample(HostCacheExample example);

    int updateByExampleSelective(@Param("record") HostCache record, @Param("example") HostCacheExample example);

    int updateByExample(@Param("record") HostCache record, @Param("example") HostCacheExample example);
}